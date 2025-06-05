package com.shopapp.ui.profile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.shopapp.ShopApplication
import com.shopapp.data.repository.OrderRepository
import com.shopapp.databinding.ActivityMyOrdersBinding
import kotlinx.coroutines.launch

class MyOrdersActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMyOrdersBinding
    private lateinit var orderRepository: OrderRepository
    private lateinit var ordersAdapter: OrdersAdapter
    private val currentUserId = "user_demo" // In real app, get from session

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyOrdersBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Initialize repository
        val database = (application as ShopApplication).database
        orderRepository = OrderRepository(
            database.orderDao(),
            database.orderItemDao(),
            database.cartDao()
        )

        setupUI()
        setupRecyclerView()
        loadOrders()
    }

    override fun onResume() {
        super.onResume()
        // Reload orders when returning to this activity
        android.util.Log.d("MyOrdersActivity", "onResume - reloading orders")
        loadOrders()
    }

    private fun setupUI() {
        binding.apply {
            backButton.setOnClickListener {
                finish()
            }
        }
    }

    private fun setupRecyclerView() {
        ordersAdapter = OrdersAdapter { order ->
            // Handle order click - could navigate to order details
        }

        binding.ordersRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@MyOrdersActivity)
            adapter = ordersAdapter
        }
    }

    private fun loadOrders() {
        lifecycleScope.launch {
            try {
                binding.progressBar.visibility = View.VISIBLE
                binding.emptyStateLayout.visibility = View.GONE

                android.util.Log.d("MyOrdersActivity", "Loading orders for user: $currentUserId")

                // Load orders from database using Flow
                orderRepository.getOrdersByUserId(currentUserId).collect { orders ->
                    android.util.Log.d("MyOrdersActivity", "Found ${orders.size} orders")

                    if (orders.isEmpty()) {
                        binding.emptyStateLayout.visibility = View.VISIBLE
                        binding.ordersRecyclerView.visibility = View.GONE
                    } else {
                        binding.emptyStateLayout.visibility = View.GONE
                        binding.ordersRecyclerView.visibility = View.VISIBLE
                        ordersAdapter.submitList(orders)
                    }

                    binding.progressBar.visibility = View.GONE
                }

            } catch (e: Exception) {
                android.util.Log.e("MyOrdersActivity", "Error loading orders: ${e.message}", e)
                binding.emptyStateLayout.visibility = View.VISIBLE
                binding.ordersRecyclerView.visibility = View.GONE
                binding.progressBar.visibility = View.GONE
            }
        }
    }
}
