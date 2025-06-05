package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.ProductImageEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductImageDao {
    
    @Query("SELECT * FROM product_images WHERE product_id = :productId ORDER BY sort_order ASC")
    suspend fun getImagesByProductId(productId: String): List<ProductImageEntity>
    
    @Query("SELECT * FROM product_images WHERE product_id = :productId ORDER BY sort_order ASC")
    fun getImagesByProductIdFlow(productId: String): Flow<List<ProductImageEntity>>
    
    @Query("SELECT * FROM product_images WHERE product_id = :productId AND is_primary = 1 LIMIT 1")
    suspend fun getPrimaryImageByProductId(productId: String): ProductImageEntity?
    
    @Query("SELECT image_url FROM product_images WHERE product_id = :productId AND is_primary = 1 LIMIT 1")
    suspend fun getPrimaryImageUrlByProductId(productId: String): String?
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertImage(image: ProductImageEntity)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertImages(images: List<ProductImageEntity>)
    
    @Update
    suspend fun updateImage(image: ProductImageEntity)
    
    @Delete
    suspend fun deleteImage(image: ProductImageEntity)
    
    @Query("DELETE FROM product_images WHERE image_id = :imageId")
    suspend fun deleteImageById(imageId: String)
    
    @Query("DELETE FROM product_images WHERE product_id = :productId")
    suspend fun deleteImagesByProductId(productId: String)
    
    @Query("UPDATE product_images SET is_primary = 0 WHERE product_id = :productId")
    suspend fun clearPrimaryImages(productId: String)
    
    @Query("UPDATE product_images SET is_primary = 1 WHERE image_id = :imageId")
    suspend fun setPrimaryImage(imageId: String)
    
    @Transaction
    suspend fun updatePrimaryImage(productId: String, imageId: String) {
        clearPrimaryImages(productId)
        setPrimaryImage(imageId)
    }
}
