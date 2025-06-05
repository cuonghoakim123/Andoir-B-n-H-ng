package com.shopapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CartItem(
    val id: String = "",
    val productId: String = "",
    val product: Product = Product(),
    val quantity: Int = 1,
    val addedAt: Long = System.currentTimeMillis()
) : Parcelable {
    val totalPrice: Double
        get() = product.price * quantity
}
