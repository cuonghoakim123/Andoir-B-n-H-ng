package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.CategoryEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {
    
    @Query("SELECT * FROM categories WHERE category_id = :categoryId")
    suspend fun getCategoryById(categoryId: String): CategoryEntity?
    
    @Query("SELECT * FROM categories WHERE is_active = 1 ORDER BY sort_order ASC, name ASC")
    fun getAllActiveCategories(): Flow<List<CategoryEntity>>
    
    @Query("SELECT * FROM categories ORDER BY sort_order ASC, name ASC")
    fun getAllCategories(): Flow<List<CategoryEntity>>
    
    @Query("SELECT * FROM categories WHERE name LIKE '%' || :searchQuery || '%' AND is_active = 1")
    suspend fun searchCategories(searchQuery: String): List<CategoryEntity>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategory(category: CategoryEntity)
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategories(categories: List<CategoryEntity>)
    
    @Update
    suspend fun updateCategory(category: CategoryEntity)
    
    @Delete
    suspend fun deleteCategory(category: CategoryEntity)
    
    @Query("DELETE FROM categories WHERE category_id = :categoryId")
    suspend fun deleteCategoryById(categoryId: String)
    
    @Query("UPDATE categories SET is_active = :isActive, updated_at = :updatedAt WHERE category_id = :categoryId")
    suspend fun updateCategoryStatus(
        categoryId: String,
        isActive: Boolean,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("SELECT COUNT(*) FROM categories WHERE is_active = 1")
    suspend fun getActiveCategoryCount(): Int
}
