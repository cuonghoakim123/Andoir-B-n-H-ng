package com.shopapp.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u000bJ\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\u0006\u0010\u001e\u001a\u00020\u001fJ\u001c\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J$\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\"\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\'H\u0082@\u00a2\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\u0011H\u0002J\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010,\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\rJ4\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b0\u00101J,\u00102\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0014H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b4\u00105R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00066"}, d2 = {"Lcom/shopapp/data/repository/ProductRepository;", "", "productDao", "Lcom/shopapp/data/database/dao/ProductDao;", "productImageDao", "Lcom/shopapp/data/database/dao/ProductImageDao;", "(Lcom/shopapp/data/database/dao/ProductDao;Lcom/shopapp/data/database/dao/ProductImageDao;)V", "deleteProduct", "Lkotlin/Result;", "", "productId", "", "deleteProduct-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllActiveProducts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/shopapp/data/model/Product;", "getFeaturedProducts", "limit", "", "getProductById", "getProductImages", "getProductsByCategory", "categoryId", "getProductsByPriceRange", "minPrice", "", "maxPrice", "getProductsByRating", "minRating", "", "getSaleProducts", "insertProduct", "product", "insertProduct-gIAlu-s", "(Lcom/shopapp/data/model/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapEntityToModel", "entity", "Lcom/shopapp/data/database/entity/ProductEntity;", "(Lcom/shopapp/data/database/entity/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mapModelToEntity", "model", "searchProducts", "searchQuery", "updateProductRating", "rating", "reviewCount", "updateProductRating-BWLJW6A", "(Ljava/lang/String;FILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductStock", "stockQuantity", "updateProductStock-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.ProductDao productDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.ProductImageDao productImageDao = null;
    
    @javax.inject.Inject()
    public ProductRepository(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.ProductDao productDao, @org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.ProductImageDao productImageDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getAllActiveProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getProductsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getFeaturedProducts(int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getSaleProducts(int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.model.Product> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.model.Product>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getProductsByRating(float minRating) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.model.Product>> getProductsByPriceRange(double minPrice, double maxPrice) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductImages(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
        return null;
    }
    
    private final java.lang.Object mapEntityToModel(com.shopapp.data.database.entity.ProductEntity entity, kotlin.coroutines.Continuation<? super com.shopapp.data.model.Product> $completion) {
        return null;
    }
    
    private final com.shopapp.data.database.entity.ProductEntity mapModelToEntity(com.shopapp.data.model.Product model) {
        return null;
    }
}