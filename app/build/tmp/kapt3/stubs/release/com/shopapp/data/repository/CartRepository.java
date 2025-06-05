package com.shopapp.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00172\u0006\u0010\f\u001a\u00020\rJ\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u0015J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u0015J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001e\u0010\u001fJ4\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b!\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006#"}, d2 = {"Lcom/shopapp/data/repository/CartRepository;", "", "cartDao", "Lcom/shopapp/data/database/dao/CartDao;", "productDao", "Lcom/shopapp/data/database/dao/ProductDao;", "productImageDao", "Lcom/shopapp/data/database/dao/ProductImageDao;", "(Lcom/shopapp/data/database/dao/CartDao;Lcom/shopapp/data/database/dao/ProductDao;Lcom/shopapp/data/database/dao/ProductImageDao;)V", "addToCart", "Lkotlin/Result;", "", "userId", "", "productId", "quantity", "", "addToCart-BWLJW6A", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearCart", "clearCart-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCartItemCount", "Lkotlinx/coroutines/flow/Flow;", "getCartItems", "", "Lcom/shopapp/data/repository/CartRepository$CartItem;", "getCartTotal", "", "removeFromCart", "removeFromCart-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuantity", "updateQuantity-BWLJW6A", "CartItem", "app_release"})
public final class CartRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.CartDao cartDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.ProductDao productDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.ProductImageDao productImageDao = null;
    
    @javax.inject.Inject()
    public CartRepository(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.CartDao cartDao, @org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.ProductDao productDao, @org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.ProductImageDao productImageDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartItems(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.repository.CartRepository.CartItem>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> getCartItemCount(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCartTotal(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/shopapp/data/repository/CartRepository$CartItem;", "", "cartId", "", "product", "Lcom/shopapp/data/model/Product;", "quantity", "", "addedAt", "", "totalPrice", "", "(Ljava/lang/String;Lcom/shopapp/data/model/Product;IJD)V", "getAddedAt", "()J", "getCartId", "()Ljava/lang/String;", "getProduct", "()Lcom/shopapp/data/model/Product;", "getQuantity", "()I", "getTotalPrice", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"})
    public static final class CartItem {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String cartId = null;
        @org.jetbrains.annotations.NotNull()
        private final com.shopapp.data.model.Product product = null;
        private final int quantity = 0;
        private final long addedAt = 0L;
        private final double totalPrice = 0.0;
        
        public CartItem(@org.jetbrains.annotations.NotNull()
        java.lang.String cartId, @org.jetbrains.annotations.NotNull()
        com.shopapp.data.model.Product product, int quantity, long addedAt, double totalPrice) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCartId() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.data.model.Product getProduct() {
            return null;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        public final long getAddedAt() {
            return 0L;
        }
        
        public final double getTotalPrice() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.data.model.Product component2() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final long component4() {
            return 0L;
        }
        
        public final double component5() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.data.repository.CartRepository.CartItem copy(@org.jetbrains.annotations.NotNull()
        java.lang.String cartId, @org.jetbrains.annotations.NotNull()
        com.shopapp.data.model.Product product, int quantity, long addedAt, double totalPrice) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}