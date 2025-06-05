package com.shopapp.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.shopapp.R
import com.shopapp.data.database.entity.OrderEntity
import com.shopapp.databinding.ItemOrderBinding
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.*

class OrdersAdapter(
    private val onOrderClick: (OrderEntity) -> Unit
) : ListAdapter<OrderEntity, OrdersAdapter.OrderViewHolder>(OrderDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val binding = ItemOrderBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return OrderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class OrderViewHolder(
        private val binding: ItemOrderBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(order: OrderEntity) {
            binding.apply {
                // Order info
                orderNumber.text = "Đơn hàng #${order.orderNumber}"
                orderDate.text = formatDate(order.createdAt)
                orderStatus.text = getStatusText(order.status)
                orderTotal.text = formatPrice(order.totalAmount)

                // Status color
                val statusColor = when (order.status) {
                    "pending" -> R.color.orange
                    "confirmed" -> R.color.blue
                    "shipping" -> R.color.purple
                    "delivered" -> R.color.green
                    "cancelled" -> R.color.red
                    else -> R.color.gray
                }
                orderStatus.setTextColor(ContextCompat.getColor(itemView.context, statusColor))

                // Simple item info (since we don't have items loaded)
                orderItems.text = "Xem chi tiết"
                firstItemName.text = "Đơn hàng #${order.orderNumber}"

                // Click listener
                root.setOnClickListener {
                    onOrderClick(order)
                }
            }
        }

        private fun formatDate(timestamp: Long): String {
            val sdf = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
            return sdf.format(Date(timestamp))
        }

        private fun formatPrice(price: Double): String {
            val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
            return formatter.format(price).replace("₫", "đ")
        }

        private fun getStatusText(status: String): String {
            return when (status) {
                "pending" -> "Chờ xác nhận"
                "confirmed" -> "Đã xác nhận"
                "shipping" -> "Đang giao"
                "delivered" -> "Đã giao"
                "cancelled" -> "Đã hủy"
                else -> "Không xác định"
            }
        }
    }

    class OrderDiffCallback : DiffUtil.ItemCallback<OrderEntity>() {
        override fun areItemsTheSame(
            oldItem: OrderEntity,
            newItem: OrderEntity
        ): Boolean {
            return oldItem.orderId == newItem.orderId
        }

        override fun areContentsTheSame(
            oldItem: OrderEntity,
            newItem: OrderEntity
        ): Boolean {
            return oldItem == newItem
        }
    }
}
