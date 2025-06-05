package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.CartEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CartDao {
    
    @Query("SELECT * FROM cart_items WHERE user_id = :userId ORDER BY added_at DESC")
    fun getCartItemsByUserId(userId: String): Flow<List<CartEntity>>
    
    @Query("SELECT * FROM cart_items WHERE user_id = :userId AND product_id = :productId")
    suspend fun getCartItem(userId: String, productId: String): CartEntity?
    
    @Query("SELECT COUNT(*) FROM cart_items WHERE user_id = :userId")
    suspend fun getCartItemCount(userId: String): Int
    
    @Query("SELECT COUNT(*) FROM cart_items WHERE user_id = :userId")
    fun getCartItemCountFlow(userId: String): Flow<Int>
    
    @Query("SELECT SUM(quantity) FROM cart_items WHERE user_id = :userId")
    suspend fun getTotalQuantity(userId: String): Int?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCartItem(cartItem: CartEntity)
    
    @Update
    suspend fun updateCartItem(cartItem: CartEntity)
    
    @Delete
    suspend fun deleteCartItem(cartItem: CartEntity)
    
    @Query("DELETE FROM cart_items WHERE cart_id = :cartId")
    suspend fun deleteCartItemById(cartId: String)
    
    @Query("DELETE FROM cart_items WHERE user_id = :userId AND product_id = :productId")
    suspend fun deleteCartItemByUserAndProduct(userId: String, productId: String)
    
    @Query("DELETE FROM cart_items WHERE user_id = :userId")
    suspend fun clearCart(userId: String)
    
    @Query("UPDATE cart_items SET quantity = :quantity, updated_at = :updatedAt WHERE user_id = :userId AND product_id = :productId")
    suspend fun updateCartItemQuantity(
        userId: String,
        productId: String,
        quantity: Int,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Transaction
    suspend fun addToCart(userId: String, productId: String, quantity: Int = 1) {
        val existingItem = getCartItem(userId, productId)
        if (existingItem != null) {
            val newQuantity = existingItem.quantity + quantity
            updateCartItemQuantity(userId, productId, newQuantity)
        } else {
            val cartId = "${userId}_${productId}_${System.currentTimeMillis()}"
            insertCartItem(
                CartEntity(
                    cartId = cartId,
                    userId = userId,
                    productId = productId,
                    quantity = quantity
                )
            )
        }
    }
}
