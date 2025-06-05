package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH'J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ \u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0014\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u00a7@\u00a2\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J*\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010\u001fJ<\u0010 \u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010$J(\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010&\u001a\u00020'2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u00a7@\u00a2\u0006\u0002\u0010(\u00a8\u0006)"}, d2 = {"Lcom/shopapp/data/database/dao/UserDao;", "", "deleteUser", "", "user", "Lcom/shopapp/data/database/entity/UserEntity;", "(Lcom/shopapp/data/database/entity/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserById", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUsers", "Lkotlinx/coroutines/flow/Flow;", "", "getUserByEmail", "email", "getUserByEmailAndPassword", "passwordHash", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "insertAll", "users", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "isEmailExists", "", "updateUser", "updateUserAvatar", "avatarUrl", "updatedAt", "", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserProfile", "fullName", "phoneNumber", "address", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserVerification", "isVerified", "", "(Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
@androidx.room.Dao()
public abstract interface UserDao {
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE email = :email")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users WHERE email = :email AND password_hash = :passwordHash")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserByEmailAndPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String passwordHash, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.UserEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM users")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.UserEntity>> getAllUsers();
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopapp.data.database.entity.UserEntity> users, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteUser(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM users WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET full_name = :fullName, phone_number = :phoneNumber, address = :address, updated_at = :updatedAt WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.Nullable()
    java.lang.String phoneNumber, @org.jetbrains.annotations.Nullable()
    java.lang.String address, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET avatar_url = :avatarUrl, updated_at = :updatedAt WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserAvatar(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.Nullable()
    java.lang.String avatarUrl, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE users SET is_verified = :isVerified, updated_at = :updatedAt WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserVerification(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, boolean isVerified, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM users WHERE email = :email")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isEmailExists(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}