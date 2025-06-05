package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000fH\'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\'J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\u0015\u001a\u00020\tH\'J$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\'J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\'J\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\fH\'J\u0016\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00a7@\u00a2\u0006\u0002\u0010\"J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010$\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J0\u0010&\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020*H\u00a7@\u00a2\u0006\u0002\u0010+J(\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010-\u001a\u00020.2\b\b\u0002\u0010)\u001a\u00020*H\u00a7@\u00a2\u0006\u0002\u0010/J(\u00100\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u00101\u001a\u00020\f2\b\b\u0002\u0010)\u001a\u00020*H\u00a7@\u00a2\u0006\u0002\u00102\u00a8\u00063"}, d2 = {"Lcom/shopapp/data/database/dao/ProductDao;", "", "deleteProduct", "", "product", "Lcom/shopapp/data/database/entity/ProductEntity;", "(Lcom/shopapp/data/database/entity/ProductEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProductById", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveProductCount", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllActiveProducts", "Lkotlinx/coroutines/flow/Flow;", "", "getFeaturedProducts", "limit", "getProductById", "getProductCountByCategory", "categoryId", "getProductsByCategory", "getProductsByPriceRange", "minPrice", "", "maxPrice", "getProductsByRating", "minRating", "", "getSaleProducts", "insertProduct", "insertProducts", "products", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchProducts", "searchQuery", "updateProduct", "updateProductRating", "rating", "reviewCount", "updatedAt", "", "(Ljava/lang/String;FIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductStatus", "isActive", "", "(Ljava/lang/String;ZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProductStock", "stockQuantity", "(Ljava/lang/String;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ProductDao {
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.ProductEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE is_active = 1 ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getAllActiveProducts();
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE category_id = :categoryId AND is_active = 1 ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getProductsByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE is_featured = 1 AND is_active = 1 ORDER BY created_at DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getFeaturedProducts(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE is_on_sale = 1 AND is_active = 1 ORDER BY discount_percentage DESC LIMIT :limit")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getSaleProducts(int limit);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE (name LIKE \'%\' || :searchQuery || \'%\' OR description LIKE \'%\' || :searchQuery || \'%\') AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchProducts(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.ProductEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE rating >= :minRating AND is_active = 1 ORDER BY rating DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getProductsByRating(float minRating);
    
    @androidx.room.Query(value = "SELECT * FROM products WHERE price BETWEEN :minPrice AND :maxPrice AND is_active = 1 ORDER BY price ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductEntity>> getProductsByPriceRange(double minPrice, double maxPrice);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertProducts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopapp.data.database.entity.ProductEntity> products, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductEntity product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM products WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteProductById(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE products SET stock_quantity = :stockQuantity, updated_at = :updatedAt WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProductStock(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, int stockQuantity, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE products SET rating = :rating, review_count = :reviewCount, updated_at = :updatedAt WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProductRating(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, float rating, int reviewCount, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE products SET is_active = :isActive, updated_at = :updatedAt WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateProductStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, boolean isActive, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM products WHERE is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getActiveProductCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM products WHERE category_id = :categoryId AND is_active = 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductCountByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}