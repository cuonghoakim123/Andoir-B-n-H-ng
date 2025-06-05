package com.shopapp.data.database.dao

import androidx.room.*
import com.shopapp.data.database.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    
    @Query("SELECT * FROM users WHERE user_id = :userId")
    suspend fun getUserById(userId: String): UserEntity?
    
    @Query("SELECT * FROM users WHERE email = :email")
    suspend fun getUserByEmail(email: String): UserEntity?
    
    @Query("SELECT * FROM users WHERE email = :email AND password_hash = :passwordHash")
    suspend fun getUserByEmailAndPassword(email: String, passwordHash: String): UserEntity?
    
    @Query("SELECT * FROM users")
    fun getAllUsers(): Flow<List<UserEntity>>
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(user: UserEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(users: List<UserEntity>)
    
    @Update
    suspend fun updateUser(user: UserEntity)
    
    @Delete
    suspend fun deleteUser(user: UserEntity)
    
    @Query("DELETE FROM users WHERE user_id = :userId")
    suspend fun deleteUserById(userId: String)
    
    @Query("UPDATE users SET full_name = :fullName, phone_number = :phoneNumber, address = :address, updated_at = :updatedAt WHERE user_id = :userId")
    suspend fun updateUserProfile(
        userId: String,
        fullName: String,
        phoneNumber: String?,
        address: String?,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE users SET avatar_url = :avatarUrl, updated_at = :updatedAt WHERE user_id = :userId")
    suspend fun updateUserAvatar(
        userId: String,
        avatarUrl: String?,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("UPDATE users SET is_verified = :isVerified, updated_at = :updatedAt WHERE user_id = :userId")
    suspend fun updateUserVerification(
        userId: String,
        isVerified: Boolean,
        updatedAt: Long = System.currentTimeMillis()
    )
    
    @Query("SELECT COUNT(*) FROM users WHERE email = :email")
    suspend fun isEmailExists(email: String): Int
}
