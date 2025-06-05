package com.shopapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.ForeignKey

@Entity(
    tableName = "products",
    foreignKeys = [
        ForeignKey(
            entity = CategoryEntity::class,
            parentColumns = ["category_id"],
            childColumns = ["category_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ProductEntity(
    @PrimaryKey
    @ColumnInfo(name = "product_id")
    val productId: String,
    
    @ColumnInfo(name = "name")
    val name: String,
    
    @ColumnInfo(name = "description")
    val description: String,
    
    @ColumnInfo(name = "price")
    val price: Double,
    
    @ColumnInfo(name = "original_price")
    val originalPrice: Double,
    
    @ColumnInfo(name = "category_id")
    val categoryId: String,
    
    @ColumnInfo(name = "stock_quantity")
    val stockQuantity: Int,
    
    @ColumnInfo(name = "sku")
    val sku: String? = null,
    
    @ColumnInfo(name = "brand")
    val brand: String? = null,
    
    @ColumnInfo(name = "weight")
    val weight: Double? = null,
    
    @ColumnInfo(name = "dimensions")
    val dimensions: String? = null,
    
    @ColumnInfo(name = "rating")
    val rating: Float = 0f,
    
    @ColumnInfo(name = "review_count")
    val reviewCount: Int = 0,
    
    @ColumnInfo(name = "is_featured")
    val isFeatured: Boolean = false,
    
    @ColumnInfo(name = "is_on_sale")
    val isOnSale: Boolean = false,
    
    @ColumnInfo(name = "discount_percentage")
    val discountPercentage: Int = 0,
    
    @ColumnInfo(name = "is_active")
    val isActive: Boolean = true,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis(),
    
    @ColumnInfo(name = "updated_at")
    val updatedAt: Long = System.currentTimeMillis()
)
