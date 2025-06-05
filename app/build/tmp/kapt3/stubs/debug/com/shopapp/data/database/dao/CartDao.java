package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0097@\u00a2\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0013J\u0016\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00190\u00172\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u000bJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010\u001c\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00a2\u0006\u0002\u0010\u000fJ0\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u00a7@\u00a2\u0006\u0002\u0010 \u00a8\u0006!"}, d2 = {"Lcom/shopapp/data/database/dao/CartDao;", "", "addToCart", "", "userId", "", "productId", "quantity", "", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartItem", "cartItem", "Lcom/shopapp/data/database/entity/CartEntity;", "(Lcom/shopapp/data/database/entity/CartEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCartItemById", "cartId", "deleteCartItemByUserAndProduct", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartItem", "getCartItemCount", "getCartItemCountFlow", "Lkotlinx/coroutines/flow/Flow;", "getCartItemsByUserId", "", "getTotalQuantity", "insertCartItem", "updateCartItem", "updateCartItemQuantity", "updatedAt", "", "(Ljava/lang/String;Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface CartDao {
    
    @androidx.room.Query(value = "SELECT * FROM cart_items WHERE user_id = :userId ORDER BY added_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.CartEntity>> getCartItemsByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM cart_items WHERE user_id = :userId AND product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCartItem(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.CartEntity> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_items WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCartItemCount(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM cart_items WHERE user_id = :userId")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.lang.Integer> getCartItemCountFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT SUM(quantity) FROM cart_items WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertCartItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CartEntity cartItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCartItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CartEntity cartItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCartItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.CartEntity cartItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cart_items WHERE cart_id = :cartId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCartItemById(@org.jetbrains.annotations.NotNull()
    java.lang.String cartId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cart_items WHERE user_id = :userId AND product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCartItemByUserAndProduct(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cart_items WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearCart(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE cart_items SET quantity = :quantity, updated_at = :updatedAt WHERE user_id = :userId AND product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateCartItemQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, int quantity, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addToCart(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, int quantity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object addToCart(@org.jetbrains.annotations.NotNull()
        com.shopapp.data.database.dao.CartDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String userId, @org.jetbrains.annotations.NotNull()
        java.lang.String productId, int quantity, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}