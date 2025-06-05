package com.shopapp.data.repository

import com.shopapp.data.database.dao.UserDao
import com.shopapp.data.database.entity.UserEntity
import kotlinx.coroutines.flow.Flow
import java.security.MessageDigest
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDao: UserDao
) {
    
    fun getAllUsers(): Flow<List<UserEntity>> = userDao.getAllUsers()
    
    suspend fun getUserById(userId: String): UserEntity? = userDao.getUserById(userId)
    
    suspend fun getUserByEmail(email: String): UserEntity? = userDao.getUserByEmail(email)
    
    suspend fun registerUser(
        email: String,
        password: String,
        fullName: String,
        phoneNumber: String? = null
    ): Result<UserEntity> {
        return try {
            // Check if email already exists
            if (userDao.isEmailExists(email) > 0) {
                return Result.failure(Exception("Email đã được sử dụng"))
            }
            
            val userId = UUID.randomUUID().toString()
            val passwordHash = hashPassword(password)
            
            val user = UserEntity(
                userId = userId,
                email = email,
                passwordHash = passwordHash,
                fullName = fullName,
                phoneNumber = phoneNumber
            )
            
            userDao.insertUser(user)
            Result.success(user)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun loginUser(email: String, password: String): Result<UserEntity> {
        return try {
            val passwordHash = hashPassword(password)
            val user = userDao.getUserByEmailAndPassword(email, passwordHash)
            
            if (user != null) {
                Result.success(user)
            } else {
                Result.failure(Exception("Email hoặc mật khẩu không đúng"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateUser(user: UserEntity): Result<Unit> {
        return try {
            userDao.updateUser(user)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    suspend fun updateUserProfile(
        userId: String,
        fullName: String,
        phoneNumber: String?,
        address: String?
    ): Result<Unit> {
        return try {
            userDao.updateUserProfile(userId, fullName, phoneNumber, address)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun updateUserAvatar(userId: String, avatarUrl: String?): Result<Unit> {
        return try {
            userDao.updateUserAvatar(userId, avatarUrl)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun verifyUser(userId: String): Result<Unit> {
        return try {
            userDao.updateUserVerification(userId, true)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun deleteUser(userId: String): Result<Unit> {
        return try {
            userDao.deleteUserById(userId)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
    
    suspend fun isEmailExists(email: String): Boolean {
        return userDao.isEmailExists(email) > 0
    }
    
    private fun hashPassword(password: String): String {
        val digest = MessageDigest.getInstance("SHA-256")
        val hash = digest.digest(password.toByteArray())
        return hash.fold("") { str, it -> str + "%02x".format(it) }
    }
}
