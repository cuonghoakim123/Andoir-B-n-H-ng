package com.shopapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo
import androidx.room.ForeignKey

@Entity(
    tableName = "orders",
    foreignKeys = [
        ForeignKey(
            entity = UserEntity::class,
            parentColumns = ["user_id"],
            childColumns = ["user_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class OrderEntity(
    @PrimaryKey
    @ColumnInfo(name = "order_id")
    val orderId: String,
    
    @ColumnInfo(name = "user_id")
    val userId: String,
    
    @ColumnInfo(name = "order_number")
    val orderNumber: String,
    
    @ColumnInfo(name = "status")
    val status: String, // PENDING, CONFIRMED, PROCESSING, SHIPPED, DELIVERED, CANCELLED
    
    @ColumnInfo(name = "subtotal")
    val subtotal: Double,
    
    @ColumnInfo(name = "shipping_fee")
    val shippingFee: Double,
    
    @ColumnInfo(name = "tax_amount")
    val taxAmount: Double = 0.0,
    
    @ColumnInfo(name = "discount_amount")
    val discountAmount: Double = 0.0,
    
    @ColumnInfo(name = "total_amount")
    val totalAmount: Double,
    
    @ColumnInfo(name = "payment_method")
    val paymentMethod: String, // COD, MOMO, ZALOPAY, VNPAY, BANK_TRANSFER
    
    @ColumnInfo(name = "payment_status")
    val paymentStatus: String, // PENDING, PAID, FAILED, REFUNDED
    
    @ColumnInfo(name = "customer_name")
    val customerName: String,
    
    @ColumnInfo(name = "customer_phone")
    val customerPhone: String,
    
    @ColumnInfo(name = "delivery_address")
    val deliveryAddress: String,
    
    @ColumnInfo(name = "notes")
    val notes: String? = null,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis(),
    
    @ColumnInfo(name = "updated_at")
    val updatedAt: Long = System.currentTimeMillis(),
    
    @ColumnInfo(name = "delivered_at")
    val deliveredAt: Long? = null
)
