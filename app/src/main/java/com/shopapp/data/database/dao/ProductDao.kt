package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao {
    
    @Query("SELECT * FROM products WHERE product_id = :productId")
    suspend fun getProductById(productId: String): ProductEntity?
    
    @Query("SELECT * FROM products WHERE is_active = 1 ORDER BY created_at DESC")
    fun getAllActiveProducts(): Flow<List<ProductEntity>>
    
    @Query("SELECT * FROM products WHERE category_id = :categoryId AND is_active = 1 ORDER BY created_at DESC")
    fun getProductsByCategory(categoryId: String): Flow<List<ProductEntity>>
    
    @Query("SELECT * FROM products WHERE is_featured = 1 AND is_active = 1 ORDER BY created_at DESC LIMIT :limit")
    fun getFeaturedProducts(limit: Int = 10): Flow<List<ProductEntity>>
    
    @Query("SELECT * FROM products WHERE is_on_sale = 1 AND is_active = 1 ORDER BY discount_percentage DESC LIMIT :limit")
    fun getSaleProducts(limit: Int = 10): Flow<List<ProductEntity>>
    
    @Query("SELECT * FROM products WHERE (name LIKE '%' || :searchQuery || '%' OR description LIKE '%' || :searchQuery || '%') AND is_active = 1")
    suspend fun searchProducts(searchQuery: String): List<ProductEntity>
    
    @Query("SELECT * FROM products WHERE rating >= :minRating AND is_active = 1 ORDER BY rating DESC")
    fun getProductsByRating(minRating: Float): Flow<List<ProductEntity>>
    
    @Query("SELECT * FROM products WHERE price BETWEEN :minPrice AND :maxPrice AND is_active = 1 ORDER BY price ASC")
    fun getProductsByPriceRange(minPrice: Double, maxPrice: Double): Flow<List<ProductEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProduct(product: ProductEntity)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertProducts(products: List<ProductEntity>)
    
    @Update
    suspend fun updateProduct(product: ProductEntity)
    
    @Delete
    suspend fun deleteProduct(product: ProductEntity)
    
    @Query("DELETE FROM products WHERE product_id = :productId")
    suspend fun deleteProductById(productId: String)
    
    @Query("UPDATE products SET stock_quantity = :stockQuantity, updated_at = :updatedAt WHERE product_id = :productId")
    suspend fun updateProductStock(
        productId: String,
        stockQuantity: Int,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE products SET rating = :rating, review_count = :reviewCount, updated_at = :updatedAt WHERE product_id = :productId")
    suspend fun updateProductRating(
        productId: String,
        rating: Float,
        reviewCount: Int,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE products SET is_active = :isActive, updated_at = :updatedAt WHERE product_id = :productId")
    suspend fun updateProductStatus(
        productId: String,
        isActive: Boolean,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("SELECT COUNT(*) FROM products WHERE is_active = 1")
    suspend fun getActiveProductCount(): Int
    
    @Query("SELECT COUNT(*) FROM products WHERE category_id = :categoryId AND is_active = 1")
    suspend fun getProductCountByCategory(categoryId: String): Int
}
