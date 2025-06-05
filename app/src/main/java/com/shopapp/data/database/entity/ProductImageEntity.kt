package com.shopapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.ForeignKey

@Entity(
    tableName = "product_images",
    foreignKeys = [
        ForeignKey(
            entity = ProductEntity::class,
            parentColumns = ["product_id"],
            childColumns = ["product_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class ProductImageEntity(
    @PrimaryKey
    @ColumnInfo(name = "image_id")
    val imageId: String,
    
    @ColumnInfo(name = "product_id")
    val productId: String,
    
    @ColumnInfo(name = "image_url")
    val imageUrl: String,
    
    @ColumnInfo(name = "alt_text")
    val altText: String? = null,
    
    @ColumnInfo(name = "sort_order")
    val sortOrder: Int = 0,
    
    @ColumnInfo(name = "is_primary")
    val isPrimary: Boolean = false,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis()
)
