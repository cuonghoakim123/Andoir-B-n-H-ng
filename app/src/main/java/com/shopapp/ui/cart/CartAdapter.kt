package com.shopapp.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.shopapp.R
import com.shopapp.data.model.CartItem
import com.shopapp.databinding.ItemCartBinding
import java.text.NumberFormat
import java.util.*

class CartAdapter(
    private val onQuantityChanged: (CartItem, Int) -> Unit,
    private val onRemoveItem: (CartItem) -> Unit
) : ListAdapter<CartItem, CartAdapter.CartViewHolder>(CartDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemCartBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class CartViewHolder(
        private val binding: ItemCartBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(cartItem: CartItem) {
            binding.apply {
                productName.text = cartItem.product.name
                productPrice.text = formatPrice(cartItem.product.price)
                totalPrice.text = formatPrice(cartItem.totalPrice)
                quantityText.text = cartItem.quantity.toString()

                // Load product image
                if (cartItem.product.mainImageUrl.isNotEmpty()) {
                    Glide.with(productImage.context)
                        .load(cartItem.product.mainImageUrl)
                        .placeholder(R.drawable.ic_placeholder)
                        .error(R.drawable.ic_placeholder)
                        .into(productImage)
                } else {
                    productImage.setImageResource(R.drawable.ic_placeholder)
                }

                // Quantity controls
                decreaseButton.setOnClickListener {
                    val newQuantity = cartItem.quantity - 1
                    onQuantityChanged(cartItem, newQuantity)
                }

                increaseButton.setOnClickListener {
                    val newQuantity = cartItem.quantity + 1
                    onQuantityChanged(cartItem, newQuantity)
                }

                removeButton.setOnClickListener {
                    onRemoveItem(cartItem)
                }
            }
        }

        private fun formatPrice(price: Double): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
            return formatter.format(price)
        }
    }

    class CartDiffCallback : DiffUtil.ItemCallback<CartItem>() {
        override fun areItemsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: CartItem, newItem: CartItem): Boolean {
            return oldItem == newItem
        }
    }
}
