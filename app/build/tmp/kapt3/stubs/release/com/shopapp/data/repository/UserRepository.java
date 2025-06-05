package com.shopapp.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010\u000bJ,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019J@\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010 \u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b!\u0010\"J.\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b%\u0010\u0019J@\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b(\u0010\u001eJ$\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b*\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006+"}, d2 = {"Lcom/shopapp/data/repository/UserRepository;", "", "userDao", "Lcom/shopapp/data/database/dao/UserDao;", "(Lcom/shopapp/data/database/dao/UserDao;)V", "deleteUser", "Lkotlin/Result;", "", "userId", "", "deleteUser-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/shopapp/data/database/entity/UserEntity;", "getUserByEmail", "email", "getUserById", "hashPassword", "password", "isEmailExists", "", "loginUser", "loginUser-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "fullName", "phoneNumber", "registerUser-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "user", "updateUser-gIAlu-s", "(Lcom/shopapp/data/database/entity/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUserAvatar", "avatarUrl", "updateUserAvatar-0E7RQCE", "updateUserProfile", "address", "updateUserProfile-yxL6bBk", "verifyUser", "verifyUser-gIAlu-s", "app_release"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.UserDao userDao = null;
    
    @javax.inject.Inject()
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.UserEntity>> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserById(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.UserEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.UserEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object isEmailExists(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    private final java.lang.String hashPassword(java.lang.String password) {
        return null;
    }
}