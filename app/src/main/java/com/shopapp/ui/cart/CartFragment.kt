package com.shopapp.ui.cart

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.shopapp.ShopApplication
import com.shopapp.data.DemoData
import com.shopapp.data.model.CartItem
import com.shopapp.data.model.Product
import com.shopapp.data.repository.CartRepository
import com.shopapp.databinding.FragmentCartBinding
import com.shopapp.ui.checkout.CheckoutActivity
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.*

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding get() = _binding!!

    private lateinit var cartAdapter: CartAdapter
    private lateinit var cartRepository: CartRepository
    private val cartItems = mutableListOf<CartItem>()
    private val currentUserId = "user_demo" // In real app, get from user session

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize repository
        val database = (requireActivity().application as ShopApplication).database
        cartRepository = CartRepository(
            database.cartDao(),
            database.productDao(),
            database.productImageDao()
        )

        setupRecyclerView()
        setupClickListeners()
        loadCartItems()
    }

    private fun setupRecyclerView() {
        cartAdapter = CartAdapter(
            onQuantityChanged = { cartItem, newQuantity ->
                updateQuantity(cartItem, newQuantity)
            },
            onRemoveItem = { cartItem ->
                removeItem(cartItem)
            }
        )
        binding.cartRecyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = cartAdapter
        }
    }

    private fun setupClickListeners() {
        binding.checkoutButton.setOnClickListener {
            if (cartItems.isNotEmpty()) {
                // For now, checkout with first item (can be extended for multiple items)
                val firstItem = cartItems.first()
                val intent = Intent(requireContext(), CheckoutActivity::class.java).apply {
                    putExtra(CheckoutActivity.EXTRA_PRODUCT, firstItem.product)
                    putExtra(CheckoutActivity.EXTRA_QUANTITY, firstItem.quantity)
                }
                startActivity(intent)
            }
        }
    }

    private fun loadCartItems() {
        lifecycleScope.launch {
            try {
                val dbCartItems = cartRepository.getCartItems(currentUserId)

                // Convert CartRepository.CartItem to UI CartItem
                val uiCartItems = dbCartItems.map { dbItem ->
                    CartItem(
                        id = dbItem.cartId,
                        productId = dbItem.product.id,
                        product = dbItem.product,
                        quantity = dbItem.quantity
                    )
                }

                cartItems.clear()
                cartItems.addAll(uiCartItems)
                cartAdapter.submitList(cartItems.toList())
                updateTotalPrice()
                updateEmptyState()

                // If cart is empty, add some demo items for testing
                if (cartItems.isEmpty()) {
                    addDemoItemsToCart()
                }
            } catch (e: Exception) {
                // Fallback to demo data if database fails
                addDemoItemsToCart()
            }
        }
    }

    private suspend fun addDemoItemsToCart() {
        // Add some demo products to cart for testing
        cartRepository.addToCart(currentUserId, "1", 1) // iPhone
        cartRepository.addToCart(currentUserId, "3", 2) // Áo thun

        // Reload cart items
        loadCartItems()
    }

    private fun updateQuantity(cartItem: CartItem, newQuantity: Int) {
        lifecycleScope.launch {
            cartRepository.updateQuantity(currentUserId, cartItem.productId, newQuantity)
            loadCartItems() // Reload from database
        }
    }

    private fun removeItem(cartItem: CartItem) {
        lifecycleScope.launch {
            cartRepository.removeFromCart(currentUserId, cartItem.productId)
            loadCartItems() // Reload from database
        }
    }

    private fun updateTotalPrice() {
        val total = cartItems.sumOf { it.totalPrice }
        val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
        binding.totalPrice.text = formatter.format(total)
    }

    private fun updateEmptyState() {
        if (cartItems.isEmpty()) {
            binding.emptyStateLayout.visibility = View.VISIBLE
            binding.cartContentLayout.visibility = View.GONE
        } else {
            binding.emptyStateLayout.visibility = View.GONE
            binding.cartContentLayout.visibility = View.VISIBLE
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
