package com.shopapp.data.repository

import com.shopapp.data.database.dao.OrderDao
import com.shopapp.data.database.dao.OrderItemDao
import com.shopapp.data.database.dao.CartDao
import com.shopapp.data.database.entity.OrderEntity
import com.shopapp.data.database.entity.OrderItemEntity
import com.shopapp.data.model.Product
import kotlinx.coroutines.flow.Flow
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderRepository @Inject constructor(
    private val orderDao: OrderDao,
    private val orderItemDao: OrderItemDao,
    private val cartDao: CartDao
) {
    
    fun getOrdersByUserId(userId: String): Flow<List<OrderEntity>> = 
        orderDao.getOrdersByUserId(userId)
    
    fun getOrdersByStatus(status: String): Flow<List<OrderEntity>> = 
        orderDao.getOrdersByStatus(status)
    
    suspend fun getOrderById(orderId: String): OrderEntity? = 
        orderDao.getOrderById(orderId)
    
    suspend fun getOrderItems(orderId: String): List<OrderItemEntity> = 
        orderItemDao.getOrderItemsByOrderId(orderId)
    
    suspend fun createOrder(
        userId: String,
        product: Product,
        quantity: Int,
        customerName: String,
        customerPhone: String,
        deliveryAddress: String,
        paymentMethod: String,
        shippingFee: Double = 30000.0
    ): Result<OrderEntity> {
        return try {
            android.util.Log.d("OrderRepository", "Creating order for user: $userId")
            android.util.Log.d("OrderRepository", "Product: ${product.name}, Quantity: $quantity")

            val orderId = UUID.randomUUID().toString()
            val orderNumber = generateOrderNumber()
            val subtotal = product.price * quantity
            val totalAmount = subtotal + shippingFee
            
            val order = OrderEntity(
                orderId = orderId,
                userId = userId,
                orderNumber = orderNumber,
                status = "PENDING",
                subtotal = subtotal,
                shippingFee = shippingFee,
                totalAmount = totalAmount,
                paymentMethod = paymentMethod,
                paymentStatus = if (paymentMethod == "COD") "PENDING" else "PENDING",
                customerName = customerName,
                customerPhone = customerPhone,
                deliveryAddress = deliveryAddress
            )
            
            android.util.Log.d("OrderRepository", "Inserting order: $orderNumber")
            orderDao.insertOrder(order)

            // Create order item
            val orderItemId = UUID.randomUUID().toString()
            val orderItem = OrderItemEntity(
                orderItemId = orderItemId,
                orderId = orderId,
                productId = product.id,
                productName = product.name,
                productImageUrl = product.mainImageUrl,
                unitPrice = product.price,
                quantity = quantity,
                totalPrice = product.price * quantity
            )

            android.util.Log.d("OrderRepository", "Inserting order item for product: ${product.name}")
            orderItemDao.insertOrderItem(orderItem)

            android.util.Log.d("OrderRepository", "Order created successfully: $orderNumber")
            Result.success(order)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun createOrderFromCart(
        userId: String,
        customerName: String,
        customerPhone: String,
        deliveryAddress: String,
        paymentMethod: String,
        shippingFee: Double = 30000.0
    ): Result<OrderEntity> {
        return try {
            // Get cart items (this would need to be implemented with proper cart-product join)
            // For now, we'll create a simple order structure
            
            val orderId = UUID.randomUUID().toString()
            val orderNumber = generateOrderNumber()
            
            // This is simplified - in real implementation, you'd calculate from cart items
            val subtotal = 0.0 // Calculate from cart
            val totalAmount = subtotal + shippingFee
            
            val order = OrderEntity(
                orderId = orderId,
                userId = userId,
                orderNumber = orderNumber,
                status = "PENDING",
                subtotal = subtotal,
                shippingFee = shippingFee,
                totalAmount = totalAmount,
                paymentMethod = paymentMethod,
                paymentStatus = if (paymentMethod == "COD") "PENDING" else "PENDING",
                customerName = customerName,
                customerPhone = customerPhone,
                deliveryAddress = deliveryAddress
            )
            
            orderDao.insertOrder(order)
            
            // Clear cart after order creation
            cartDao.clearCart(userId)
            
            Result.success(order)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateOrderStatus(orderId: String, status: String): Result<Unit> {
        return try {
            orderDao.updateOrderStatus(orderId, status)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updatePaymentStatus(orderId: String, paymentStatus: String): Result<Unit> {
        return try {
            orderDao.updatePaymentStatus(orderId, paymentStatus)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun markOrderAsDelivered(orderId: String): Result<Unit> {
        return try {
            orderDao.markOrderAsDelivered(orderId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun cancelOrder(orderId: String): Result<Unit> {
        return try {
            orderDao.updateOrderStatus(orderId, "CANCELLED")
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getOrderCountByUser(userId: String): Int = 
        orderDao.getOrderCountByUser(userId)
    
    suspend fun getTotalSpentByUser(userId: String): Double = 
        orderDao.getTotalSpentByUser(userId) ?: 0.0
    
    private fun generateOrderNumber(): String {
        val dateFormat = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        val date = dateFormat.format(Date())
        val random = (1000..9999).random()
        return "ORD$date$random"
    }
}
