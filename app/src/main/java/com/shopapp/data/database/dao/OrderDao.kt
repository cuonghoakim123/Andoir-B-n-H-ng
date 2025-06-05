package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.OrderEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderDao {
    
    @Query("SELECT * FROM orders WHERE order_id = :orderId")
    suspend fun getOrderById(orderId: String): OrderEntity?
    
    @Query("SELECT * FROM orders WHERE user_id = :userId ORDER BY created_at DESC")
    fun getOrdersByUserId(userId: String): Flow<List<OrderEntity>>
    
    @Query("SELECT * FROM orders WHERE status = :status ORDER BY created_at DESC")
    fun getOrdersByStatus(status: String): Flow<List<OrderEntity>>
    
    @Query("SELECT * FROM orders WHERE payment_status = :paymentStatus ORDER BY created_at DESC")
    fun getOrdersByPaymentStatus(paymentStatus: String): Flow<List<OrderEntity>>
    
    @Query("SELECT * FROM orders ORDER BY created_at DESC")
    fun getAllOrders(): Flow<List<OrderEntity>>
    
    @Query("SELECT * FROM orders WHERE user_id = :userId AND status IN (:statuses) ORDER BY created_at DESC")
    fun getOrdersByUserAndStatuses(userId: String, statuses: List<String>): Flow<List<OrderEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrder(order: OrderEntity)
    
    @Update
    suspend fun updateOrder(order: OrderEntity)
    
    @Delete
    suspend fun deleteOrder(order: OrderEntity)
    
    @Query("DELETE FROM orders WHERE order_id = :orderId")
    suspend fun deleteOrderById(orderId: String)
    
    @Query("UPDATE orders SET status = :status, updated_at = :updatedAt WHERE order_id = :orderId")
    suspend fun updateOrderStatus(
        orderId: String,
        status: String,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE orders SET payment_status = :paymentStatus, updated_at = :updatedAt WHERE order_id = :orderId")
    suspend fun updatePaymentStatus(
        orderId: String,
        paymentStatus: String,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE orders SET status = :status, delivered_at = :deliveredAt, updated_at = :updatedAt WHERE order_id = :orderId")
    suspend fun markOrderAsDelivered(
        orderId: String,
        status: String = "DELIVERED",
        deliveredAt: Long = System.currentTimeMillis(),
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("SELECT COUNT(*) FROM orders WHERE user_id = :userId")
    suspend fun getOrderCountByUser(userId: String): Int
    
    @Query("SELECT COUNT(*) FROM orders WHERE status = :status")
    suspend fun getOrderCountByStatus(status: String): Int
    
    @Query("SELECT SUM(total_amount) FROM orders WHERE user_id = :userId AND payment_status = 'PAID'")
    suspend fun getTotalSpentByUser(userId: String): Double?
    
    @Query("SELECT * FROM orders WHERE order_number = :orderNumber")
    suspend fun getOrderByNumber(orderNumber: String): OrderEntity?
}
