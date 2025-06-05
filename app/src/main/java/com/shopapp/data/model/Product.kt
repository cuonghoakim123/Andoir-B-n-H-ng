package com.shopapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val price: Double = 0.0,
    val originalPrice: Double = 0.0,
    val imageUrls: List<String> = emptyList(),
    val category: String = "",
    val stock: Int = 0,
    val rating: Float = 0f,
    val reviewCount: Int = 0,
    val isOnSale: Boolean = false,
    val discountPercentage: Int = 0,
    val createdAt: Long = System.currentTimeMillis()
) : Parcelable {
    val isInStock: Boolean
        get() = stock > 0

    val mainImageUrl: String
        get() = imageUrls.firstOrNull() ?: ""

    val discountPercent: Double
        get() = discountPercentage.toDouble()
}
