package com.shopapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val id: String = "",
    val email: String = "",
    val fullName: String = "",
    val phone: String = "",
    val address: String = "",
    val profileImageUrl: String = "",
    val createdAt: Long = System.currentTimeMillis()
) : Parcelable
