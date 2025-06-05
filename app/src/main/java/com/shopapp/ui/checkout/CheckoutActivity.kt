package com.shopapp.ui.checkout

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.shopapp.ShopApplication
import com.shopapp.data.model.Product
import com.shopapp.data.repository.OrderRepository
import com.shopapp.databinding.ActivityCheckoutBinding
import com.shopapp.ui.payment.PaymentActivity
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.*

class CheckoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCheckoutBinding
    private lateinit var product: Product
    private var quantity: Int = 1
    private var selectedPaymentMethod = "cod" // Default: Cash on Delivery
    private lateinit var orderRepository: OrderRepository

    companion object {
        const val EXTRA_PRODUCT = "extra_product"
        const val EXTRA_QUANTITY = "extra_quantity"
        private const val PAYMENT_REQUEST_CODE = 1001
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCheckoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize repository
        val database = (application as ShopApplication).database
        orderRepository = OrderRepository(database.orderDao(), database.orderItemDao(), database.cartDao())

        // Get data from intent
        product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT) ?: return
        quantity = intent.getIntExtra(EXTRA_QUANTITY, 1)

        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        binding.apply {
            // Product info
            productName.text = product.name
            productPrice.text = formatPrice(product.price)
            productQuantity.text = "x${quantity}"
            
            // Calculate prices
            val subtotal = product.price * quantity
            val shippingFee = 30000.0 // 30k shipping
            val total = subtotal + shippingFee
            
            subtotalAmount.text = formatPrice(subtotal)
            shippingAmount.text = formatPrice(shippingFee)
            totalAmount.text = formatPrice(total)

            // Default payment method
            codRadio.isChecked = true
            
            // Default delivery info (you can get from user profile)
            customerName.setText("Nguyễn Văn A")
            customerPhone.setText("0123456789")
            deliveryAddress.setText("123 Đường ABC, Quận 1, TP.HCM")
        }
    }

    private fun setupClickListeners() {
        binding.apply {
            // Back button
            backButton.setOnClickListener {
                finish()
            }

            // Payment method selection
            paymentMethodGroup.setOnCheckedChangeListener { _, checkedId ->
                selectedPaymentMethod = when (checkedId) {
                    codRadio.id -> "cod"
                    onlineRadio.id -> "online"
                    else -> "cod"
                }
            }

            // Place order button
            placeOrderButton.setOnClickListener {
                if (validateForm()) {
                    placeOrder()
                }
            }
        }
    }

    private fun validateForm(): Boolean {
        binding.apply {
            if (customerName.text.toString().trim().isEmpty()) {
                customerName.error = "Vui lòng nhập tên"
                return false
            }
            
            if (customerPhone.text.toString().trim().isEmpty()) {
                customerPhone.error = "Vui lòng nhập số điện thoại"
                return false
            }
            
            if (deliveryAddress.text.toString().trim().isEmpty()) {
                deliveryAddress.error = "Vui lòng nhập địa chỉ giao hàng"
                return false
            }
        }
        return true
    }

    private fun placeOrder() {
        when (selectedPaymentMethod) {
            "cod" -> {
                // Cash on Delivery
                showOrderConfirmation()
            }
            "online" -> {
                // Online Payment
                proceedToPayment()
            }
        }
    }

    private fun showOrderConfirmation() {
        // Save order to database
        lifecycleScope.launch {
            android.util.Log.d("CheckoutActivity", "Creating COD order for user: user_demo")
            android.util.Log.d("CheckoutActivity", "Product: ${product.name}, Quantity: $quantity")

            val result = orderRepository.createOrder(
                userId = "user_demo", // In real app, get from user session
                product = product,
                quantity = quantity,
                customerName = binding.customerName.text.toString(),
                customerPhone = binding.customerPhone.text.toString(),
                deliveryAddress = binding.deliveryAddress.text.toString(),
                paymentMethod = "COD"
            )

            result.onSuccess { order ->
                android.util.Log.d("CheckoutActivity", "Order created successfully: ${order.orderNumber}")
                android.util.Log.d("CheckoutActivity", "Order ID: ${order.orderId}, User ID: ${order.userId}")

                AlertDialog.Builder(this@CheckoutActivity)
                    .setTitle("Xác nhận đặt hàng")
                    .setMessage("Đơn hàng ${order.orderNumber} đã được đặt thành công!\n\nPhương thức thanh toán: Thanh toán khi nhận hàng\nThời gian giao hàng: 2-3 ngày làm việc")
                    .setPositiveButton("OK") { _, _ ->
                        Toast.makeText(this@CheckoutActivity, "Đặt hàng thành công!", Toast.LENGTH_LONG).show()
                        finish()
                    }
                    .show()
            }.onFailure { error ->
                android.util.Log.e("CheckoutActivity", "Failed to create order: ${error.message}", error)
                Toast.makeText(this@CheckoutActivity, "Lỗi: ${error.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun proceedToPayment() {
        val subtotal = product.price * quantity
        val shippingFee = 30000.0
        val total = subtotal + shippingFee

        val intent = Intent(this, PaymentActivity::class.java)
        intent.putExtra(PaymentActivity.EXTRA_AMOUNT, total)
        intent.putExtra(PaymentActivity.EXTRA_ORDER_INFO, "Thanh toán đơn hàng ${product.name}")
        intent.putExtra(PaymentActivity.EXTRA_CUSTOMER_NAME, binding.customerName.text.toString())
        intent.putExtra(PaymentActivity.EXTRA_CUSTOMER_PHONE, binding.customerPhone.text.toString())
        startActivityForResult(intent, PAYMENT_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        
        if (requestCode == PAYMENT_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                // Payment successful
                showPaymentSuccess()
            } else {
                // Payment failed or cancelled
                Toast.makeText(this, "Thanh toán không thành công", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun showPaymentSuccess() {
        // Save order to database with online payment
        lifecycleScope.launch {
            val result = orderRepository.createOrder(
                userId = "user_demo", // In real app, get from user session
                product = product,
                quantity = quantity,
                customerName = binding.customerName.text.toString(),
                customerPhone = binding.customerPhone.text.toString(),
                deliveryAddress = binding.deliveryAddress.text.toString(),
                paymentMethod = selectedPaymentMethod.uppercase()
            )

            result.onSuccess { order ->
                // Update payment status to PAID
                orderRepository.updatePaymentStatus(order.orderId, "PAID")

                AlertDialog.Builder(this@CheckoutActivity)
                    .setTitle("Thanh toán thành công")
                    .setMessage("Đơn hàng ${order.orderNumber} đã được thanh toán và đặt thành công!\n\nThời gian giao hàng: 2-3 ngày làm việc")
                    .setPositiveButton("OK") { _, _ ->
                        Toast.makeText(this@CheckoutActivity, "Đặt hàng thành công!", Toast.LENGTH_LONG).show()
                        finish()
                    }
                    .show()
            }.onFailure { error ->
                Toast.makeText(this@CheckoutActivity, "Lỗi: ${error.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
        return formatter.format(price).replace("₫", "đ")
    }
}
