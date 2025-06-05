package com.shopapp.ui.payment

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.shopapp.databinding.ActivityPaymentBinding
import com.shopapp.payment.MoMoPaymentService
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.*

class PaymentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPaymentBinding
    private lateinit var momoPaymentService: MoMoPaymentService
    private var amount: Double = 0.0
    private var orderInfo: String = ""
    private var customerName: String = ""
    private var customerPhone: String = ""
    private var selectedMethod = "momo"

    companion object {
        const val EXTRA_AMOUNT = "extra_amount"
        const val EXTRA_ORDER_INFO = "extra_order_info"
        const val EXTRA_CUSTOMER_NAME = "extra_customer_name"
        const val EXTRA_CUSTOMER_PHONE = "extra_customer_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize MoMo service
        momoPaymentService = MoMoPaymentService(this)

        // Get data from intent
        amount = intent.getDoubleExtra(EXTRA_AMOUNT, 0.0)
        orderInfo = intent.getStringExtra(EXTRA_ORDER_INFO) ?: ""
        customerName = intent.getStringExtra(EXTRA_CUSTOMER_NAME) ?: ""
        customerPhone = intent.getStringExtra(EXTRA_CUSTOMER_PHONE) ?: ""

        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        binding.apply {
            // Payment info
            paymentAmount.text = formatPrice(amount)
            paymentOrderInfo.text = orderInfo
            
            // Default selection
            momoRadio.isChecked = true
        }
    }

    private fun setupClickListeners() {
        binding.apply {
            // Back button
            backButton.setOnClickListener {
                setResult(RESULT_CANCELED)
                finish()
            }

            // Payment method selection
            paymentMethodGroup.setOnCheckedChangeListener { _, checkedId ->
                selectedMethod = when (checkedId) {
                    momoRadio.id -> "momo"
                    zalopayRadio.id -> "zalopay"
                    vnpayRadio.id -> "vnpay"
                    bankRadio.id -> "bank"
                    else -> "momo"
                }
            }

            // Pay button
            payButton.setOnClickListener {
                processPayment()
            }
        }
    }

    private fun processPayment() {
        when (selectedMethod) {
            "momo" -> processMoMoPayment()
            "zalopay" -> processZaloPayPayment()
            "vnpay" -> processVNPayPayment()
            "bank" -> processBankTransfer()
        }
    }

    private fun processMoMoPayment() {
        // Real MoMo payment integration
        binding.payButton.isEnabled = false
        binding.payButton.text = "Đang xử lý..."

        val orderId = "ORDER_${System.currentTimeMillis()}"
        val amountInVND = (amount * 1000).toLong() // Convert to VND (assuming amount is in thousands)

        lifecycleScope.launch {
            momoPaymentService.createPayment(
                orderId = orderId,
                amount = amountInVND,
                orderInfo = orderInfo,
                callback = object : MoMoPaymentService.PaymentCallback {
                    override fun onSuccess(paymentUrl: String, deeplink: String?) {
                        // Open payment URL in browser or WebView
                        try {
                            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(paymentUrl))
                            startActivity(intent)

                            // Simulate payment completion after user returns
                            binding.root.postDelayed({
                                showPaymentResult(true, "MoMo")
                            }, 5000)

                        } catch (e: Exception) {
                            onError("Không thể mở trang thanh toán: ${e.message}")
                        }
                    }

                    override fun onError(error: String) {
                        binding.payButton.isEnabled = true
                        binding.payButton.text = "Thanh toán"
                        Toast.makeText(this@PaymentActivity, "Lỗi MoMo: $error", Toast.LENGTH_LONG).show()
                    }
                }
            )
        }
    }

    private fun processZaloPayPayment() {
        // Simulate ZaloPay payment
        showPaymentDialog("ZaloPay", "Đang chuyển đến ứng dụng ZaloPay...") {
            // In real app, integrate with ZaloPay SDK
            simulatePaymentProcess("ZaloPay")
        }
    }

    private fun processVNPayPayment() {
        // Simulate VNPay payment
        showPaymentDialog("VNPay", "Đang chuyển đến cổng thanh toán VNPay...") {
            // In real app, integrate with VNPay
            simulatePaymentProcess("VNPay")
        }
    }

    private fun processBankTransfer() {
        // Show bank transfer info
        AlertDialog.Builder(this)
            .setTitle("Chuyển khoản ngân hàng")
            .setMessage("""
                Thông tin chuyển khoản:
                
                Ngân hàng: Vietcombank
                Số tài khoản: 1234567890
                Chủ tài khoản: SHOP APP
                Số tiền: ${formatPrice(amount)}
                Nội dung: ${orderInfo}
                
                Vui lòng chuyển khoản và gửi ảnh chụp màn hình để xác nhận.
            """.trimIndent())
            .setPositiveButton("Đã chuyển khoản") { _, _ ->
                // In real app, wait for admin confirmation
                simulatePaymentProcess("Bank Transfer")
            }
            .setNegativeButton("Hủy") { _, _ ->
                // Do nothing
            }
            .show()
    }

    private fun showPaymentDialog(method: String, message: String, onProceed: () -> Unit) {
        AlertDialog.Builder(this)
            .setTitle("Thanh toán $method")
            .setMessage(message)
            .setPositiveButton("Tiếp tục") { _, _ ->
                onProceed()
            }
            .setNegativeButton("Hủy") { _, _ ->
                // Do nothing
            }
            .show()
    }

    private fun simulatePaymentProcess(method: String) {
        // Show loading
        binding.payButton.isEnabled = false
        binding.payButton.text = "Đang xử lý..."

        // Simulate payment processing
        binding.root.postDelayed({
            // Simulate success (90% success rate)
            val isSuccess = Math.random() > 0.1
            
            if (isSuccess) {
                showPaymentResult(true, method)
            } else {
                showPaymentResult(false, method)
            }
        }, 3000) // 3 seconds delay
    }

    private fun showPaymentResult(isSuccess: Boolean, method: String) {
        binding.payButton.isEnabled = true
        binding.payButton.text = "Thanh toán"

        if (isSuccess) {
            AlertDialog.Builder(this)
                .setTitle("Thanh toán thành công")
                .setMessage("Thanh toán qua $method đã thành công!\n\nSố tiền: ${formatPrice(amount)}")
                .setPositiveButton("OK") { _, _ ->
                    setResult(RESULT_OK)
                    finish()
                }
                .setCancelable(false)
                .show()
        } else {
            AlertDialog.Builder(this)
                .setTitle("Thanh toán thất bại")
                .setMessage("Thanh toán qua $method không thành công. Vui lòng thử lại.")
                .setPositiveButton("Thử lại") { _, _ ->
                    // Allow retry
                }
                .setNegativeButton("Hủy") { _, _ ->
                    setResult(RESULT_CANCELED)
                    finish()
                }
                .show()
        }
    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
        return formatter.format(price).replace("₫", "đ")
    }
}
