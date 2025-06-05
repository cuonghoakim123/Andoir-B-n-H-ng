package com.shopapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.ForeignKey

@Entity(
    tableName = "order_items",
    foreignKeys = [
        ForeignKey(
            entity = OrderEntity::class,
            parentColumns = ["order_id"],
            childColumns = ["order_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = ProductEntity::class,
            parentColumns = ["product_id"],
            childColumns = ["product_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class OrderItemEntity(
    @PrimaryKey
    @ColumnInfo(name = "order_item_id")
    val orderItemId: String,
    
    @ColumnInfo(name = "order_id")
    val orderId: String,
    
    @ColumnInfo(name = "product_id")
    val productId: String,
    
    @ColumnInfo(name = "product_name")
    val productName: String,
    
    @ColumnInfo(name = "product_image_url")
    val productImageUrl: String? = null,
    
    @ColumnInfo(name = "unit_price")
    val unitPrice: Double,
    
    @ColumnInfo(name = "quantity")
    val quantity: Int,
    
    @ColumnInfo(name = "total_price")
    val totalPrice: Double,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis()
)
