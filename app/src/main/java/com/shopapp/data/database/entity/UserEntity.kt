package com.shopapp.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey
    @ColumnInfo(name = "user_id")
    val userId: String,
    
    @ColumnInfo(name = "email")
    val email: String,
    
    @ColumnInfo(name = "password_hash")
    val passwordHash: String,
    
    @ColumnInfo(name = "full_name")
    val fullName: String,
    
    @ColumnInfo(name = "phone_number")
    val phoneNumber: String? = null,
    
    @ColumnInfo(name = "address")
    val address: String? = null,
    
    @ColumnInfo(name = "avatar_url")
    val avatarUrl: String? = null,
    
    @ColumnInfo(name = "is_verified")
    val isVerified: Boolean = false,
    
    @ColumnInfo(name = "created_at")
    val createdAt: Long = System.currentTimeMillis(),
    
    @ColumnInfo(name = "updated_at")
    val updatedAt: Long = System.currentTimeMillis()
)
