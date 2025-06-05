package com.shopapp.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.shopapp.ShopApplication
import com.shopapp.data.DemoData
import com.shopapp.data.model.Category
import com.shopapp.data.model.Product
import com.shopapp.data.repository.ProductRepository
import com.shopapp.databinding.FragmentHomeBinding
import com.shopapp.ui.product.ProductDetailActivity
import kotlinx.coroutines.launch

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private lateinit var featuredProductsAdapter: ProductAdapter
    private lateinit var categoriesAdapter: CategoryAdapter
    private lateinit var productRepository: ProductRepository

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize repository
        val database = (requireActivity().application as ShopApplication).database
        productRepository = ProductRepository(database.productDao(), database.productImageDao())

        setupRecyclerViews()
        loadData()
    }

    private fun setupRecyclerViews() {
        // Categories RecyclerView
        categoriesAdapter = CategoryAdapter { _ ->
            // Handle category click
        }
        binding.categoriesRecyclerView.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = categoriesAdapter
        }

        // Featured Products RecyclerView
        featuredProductsAdapter = ProductAdapter { product ->
            // Handle product click - navigate to product detail
            val intent = Intent(requireContext(), ProductDetailActivity::class.java)
            intent.putExtra(ProductDetailActivity.EXTRA_PRODUCT, product)
            startActivity(intent)
        }
        binding.featuredProductsRecyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = featuredProductsAdapter
        }
    }

    private fun loadData() {
        // Load demo categories (still using demo data for now)
        val categories = DemoData.getCategories().take(5)
        categoriesAdapter.submitList(categories)

        // Load featured products from database
        lifecycleScope.launch {
            productRepository.getFeaturedProducts(6).collect { products ->
                featuredProductsAdapter.submitList(products)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
