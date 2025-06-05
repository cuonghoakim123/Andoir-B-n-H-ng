package com.shopapp.ui.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.shopapp.data.DemoData
import com.shopapp.data.model.Category
import com.shopapp.databinding.FragmentCategoriesBinding
import com.shopapp.ui.home.CategoryAdapter

class CategoriesFragment : Fragment() {

    private var _binding: FragmentCategoriesBinding? = null
    private val binding get() = _binding!!

    private lateinit var categoriesAdapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoriesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        loadCategories()
    }

    private fun setupRecyclerView() {
        categoriesAdapter = CategoryAdapter { _ ->
            // Handle category click - navigate to products
        }
        binding.categoriesRecyclerView.apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = categoriesAdapter
        }
    }

    private fun loadCategories() {
        val categories = DemoData.getCategories()
        categoriesAdapter.submitList(categories)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
