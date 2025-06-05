package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.OrderItemEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface OrderItemDao {
    
    @Query("SELECT * FROM order_items WHERE order_id = :orderId ORDER BY created_at ASC")
    suspend fun getOrderItemsByOrderId(orderId: String): List<OrderItemEntity>
    
    @Query("SELECT * FROM order_items WHERE order_id = :orderId ORDER BY created_at ASC")
    fun getOrderItemsByOrderIdFlow(orderId: String): Flow<List<OrderItemEntity>>
    
    @Query("SELECT * FROM order_items WHERE order_item_id = :orderItemId")
    suspend fun getOrderItemById(orderItemId: String): OrderItemEntity?
    
    @Query("SELECT * FROM order_items WHERE product_id = :productId ORDER BY created_at DESC")
    suspend fun getOrderItemsByProductId(productId: String): List<OrderItemEntity>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderItem(orderItem: OrderItemEntity)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrderItems(orderItems: List<OrderItemEntity>)
    
    @Update
    suspend fun updateOrderItem(orderItem: OrderItemEntity)
    
    @Delete
    suspend fun deleteOrderItem(orderItem: OrderItemEntity)
    
    @Query("DELETE FROM order_items WHERE order_item_id = :orderItemId")
    suspend fun deleteOrderItemById(orderItemId: String)
    
    @Query("DELETE FROM order_items WHERE order_id = :orderId")
    suspend fun deleteOrderItemsByOrderId(orderId: String)
    
    @Query("SELECT COUNT(*) FROM order_items WHERE order_id = :orderId")
    suspend fun getOrderItemCount(orderId: String): Int
    
    @Query("SELECT SUM(total_price) FROM order_items WHERE order_id = :orderId")
    suspend fun getOrderItemsTotal(orderId: String): Double?
    
    @Query("SELECT SUM(quantity) FROM order_items WHERE order_id = :orderId")
    suspend fun getOrderItemsTotalQuantity(orderId: String): Int?
    
    @Query("SELECT COUNT(*) FROM order_items WHERE product_id = :productId")
    suspend fun getProductOrderCount(productId: String): Int
    
    @Query("SELECT SUM(quantity) FROM order_items WHERE product_id = :productId")
    suspend fun getProductTotalSold(productId: String): Int?
}
