package com.shopapp.ui.product

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.shopapp.ShopApplication
import com.shopapp.data.model.Product
import com.shopapp.data.repository.CartRepository
import com.shopapp.databinding.ActivityProductDetailBinding
import com.shopapp.ui.checkout.CheckoutActivity
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.*

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProductDetailBinding
    private lateinit var product: Product
    private lateinit var cartRepository: CartRepository
    private var quantity = 1
    private val currentUserId = "user_demo" // In real app, get from user session

    companion object {
        const val EXTRA_PRODUCT = "extra_product"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize repository
        val database = (application as ShopApplication).database
        cartRepository = CartRepository(
            database.cartDao(),
            database.productDao(),
            database.productImageDao()
        )

        // Get product from intent
        product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT) ?: return

        setupUI()
        setupClickListeners()
    }

    private fun setupUI() {
        binding.apply {
            // Set product info
            productName.text = product.name
            productDescription.text = product.description
            productPrice.text = formatPrice(product.price)
            productRating.rating = product.rating
            productRatingText.text = "(${product.reviewCount} đánh giá)"
            productStock.text = "Còn lại: ${product.stock} sản phẩm"
            
            // Set discount if available
            if (product.discountPercent > 0) {
                val originalPrice = product.price / (1 - product.discountPercent / 100.0)
                productOriginalPrice.text = formatPrice(originalPrice)
                productOriginalPrice.paintFlags = 
                    productOriginalPrice.paintFlags or android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
                discountBadge.text = "-${product.discountPercent.toInt()}%"
                discountBadge.visibility = android.view.View.VISIBLE
                productOriginalPrice.visibility = android.view.View.VISIBLE
            } else {
                discountBadge.visibility = android.view.View.GONE
                productOriginalPrice.visibility = android.view.View.GONE
            }

            // Set quantity
            quantityText.text = quantity.toString()
            
            // Update total price
            updateTotalPrice()
        }
    }

    private fun setupClickListeners() {
        binding.apply {
            // Back button
            backButton.setOnClickListener {
                finish()
            }

            // Quantity controls
            decreaseButton.setOnClickListener {
                if (quantity > 1) {
                    quantity--
                    quantityText.text = quantity.toString()
                    updateTotalPrice()
                }
            }

            increaseButton.setOnClickListener {
                if (quantity < product.stock) {
                    quantity++
                    quantityText.text = quantity.toString()
                    updateTotalPrice()
                } else {
                    Toast.makeText(this@ProductDetailActivity, 
                        "Không đủ hàng trong kho", Toast.LENGTH_SHORT).show()
                }
            }

            // Add to cart
            addToCartButton.setOnClickListener {
                addToCart()
            }

            // Buy now
            buyNowButton.setOnClickListener {
                buyNow()
            }
        }
    }

    private fun updateTotalPrice() {
        val totalPrice = product.price * quantity
        binding.totalPrice.text = "Tổng: ${formatPrice(totalPrice)}"
    }

    private fun addToCart() {
        lifecycleScope.launch {
            val result = cartRepository.addToCart(currentUserId, product.id, quantity)
            result.onSuccess {
                Toast.makeText(this@ProductDetailActivity,
                    "Đã thêm ${quantity} sản phẩm vào giỏ hàng", Toast.LENGTH_SHORT).show()
            }.onFailure { error ->
                Toast.makeText(this@ProductDetailActivity,
                    "Lỗi: ${error.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun buyNow() {
        val intent = Intent(this, CheckoutActivity::class.java)
        intent.putExtra(CheckoutActivity.EXTRA_PRODUCT, product)
        intent.putExtra(CheckoutActivity.EXTRA_QUANTITY, quantity)
        startActivity(intent)
    }

    private fun formatPrice(price: Double): String {
        val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
        return formatter.format(price).replace("₫", "đ")
    }
}
