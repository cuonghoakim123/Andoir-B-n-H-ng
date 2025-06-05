package com.shopapp.data.repository

import com.shopapp.data.database.dao.CartDao
import com.shopapp.data.database.dao.ProductDao
import com.shopapp.data.database.dao.ProductImageDao
import com.shopapp.data.database.entity.CartEntity
import com.shopapp.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CartRepository @Inject constructor(
    private val cartDao: CartDao,
    private val productDao: ProductDao,
    private val productImageDao: ProductImageDao
) {
    
    data class CartItem(
        val cartId: String,
        val product: Product,
        val quantity: Int,
        val addedAt: Long,
        val totalPrice: Double
    )
    
    suspend fun addToCart(userId: String, productId: String, quantity: Int = 1): Result<Unit> {
        return try {
            cartDao.addToCart(userId, productId, quantity)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun removeFromCart(userId: String, productId: String): Result<Unit> {
        return try {
            cartDao.deleteCartItemByUserAndProduct(userId, productId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateQuantity(userId: String, productId: String, quantity: Int): Result<Unit> {
        return try {
            if (quantity <= 0) {
                cartDao.deleteCartItemByUserAndProduct(userId, productId)
            } else {
                cartDao.updateCartItemQuantity(userId, productId, quantity)
            }
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getCartItems(userId: String): List<CartItem> {
        return try {
            val cartEntities = cartDao.getCartItemsByUserId(userId)
            val cartItems = mutableListOf<CartItem>()
            
            cartEntities.collect { entities ->
                for (entity in entities) {
                    val productEntity = productDao.getProductById(entity.productId)
                    if (productEntity != null) {
                        val imageUrls = productImageDao.getImagesByProductId(entity.productId).map { it.imageUrl }
                        
                        val product = Product(
                            id = productEntity.productId,
                            name = productEntity.name,
                            description = productEntity.description,
                            price = productEntity.price,
                            originalPrice = productEntity.originalPrice,
                            imageUrls = imageUrls,
                            category = productEntity.categoryId,
                            stock = productEntity.stockQuantity,
                            rating = productEntity.rating,
                            reviewCount = productEntity.reviewCount,
                            isOnSale = productEntity.isOnSale,
                            discountPercentage = productEntity.discountPercentage,
                            createdAt = productEntity.createdAt
                        )
                        
                        cartItems.add(
                            CartItem(
                                cartId = entity.cartId,
                                product = product,
                                quantity = entity.quantity,
                                addedAt = entity.addedAt,
                                totalPrice = product.price * entity.quantity
                            )
                        )
                    }
                }
            }
            
            cartItems
        } catch (e: Exception) {
            emptyList()
        }
    }
    
    fun getCartItemCount(userId: String): Flow<Int> = cartDao.getCartItemCountFlow(userId)
    
    suspend fun clearCart(userId: String): Result<Unit> {
        return try {
            cartDao.clearCart(userId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun getCartTotal(userId: String): Double {
        return try {
            val cartItems = getCartItems(userId)
            cartItems.sumOf { it.totalPrice }
        } catch (e: Exception) {
            0.0
        }
    }
}
