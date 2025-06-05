package com.shopapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shopapp.R
import com.shopapp.data.model.Product
import com.shopapp.databinding.ItemProductBinding
import java.text.NumberFormat
import java.util.*

class ProductAdapter(
    private val onProductClick: (Product) -> Unit
) : ListAdapter<Product, ProductAdapter.ProductViewHolder>(ProductDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ProductViewHolder(
        private val binding: ItemProductBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(product: Product) {
            binding.apply {
                productName.text = product.name
                productPrice.text = formatPrice(product.price)
                
                if (product.isOnSale && product.originalPrice > product.price) {
                    originalPrice.text = formatPrice(product.originalPrice)
                    originalPrice.visibility = android.view.View.VISIBLE
                    discountBadge.text = "-${product.discountPercentage}%"
                    discountBadge.visibility = android.view.View.VISIBLE
                } else {
                    originalPrice.visibility = android.view.View.GONE
                    discountBadge.visibility = android.view.View.GONE
                }

                ratingBar.rating = product.rating
                reviewCount.text = "(${product.reviewCount})"

                // Load product image
                if (product.mainImageUrl.isNotEmpty()) {
                    Glide.with(productImage.context)
                        .load(product.mainImageUrl)
                        .placeholder(R.drawable.ic_placeholder)
                        .error(R.drawable.ic_placeholder)
                        .into(productImage)
                } else {
                    productImage.setImageResource(R.drawable.ic_placeholder)
                }

                root.setOnClickListener {
                    onProductClick(product)
                }
            }
        }

        private fun formatPrice(price: Double): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
            return formatter.format(price)
        }
    }

    class ProductDiffCallback : DiffUtil.ItemCallback<Product>() {
        override fun areItemsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Product, newItem: Product): Boolean {
            return oldItem == newItem
        }
    }
}
