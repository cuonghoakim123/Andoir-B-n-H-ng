package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0015\u001a\u00020\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u00a7@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0097@\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001c"}, d2 = {"Lcom/shopapp/data/database/dao/ProductImageDao;", "", "clearPrimaryImages", "", "productId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImage", "image", "Lcom/shopapp/data/database/entity/ProductImageEntity;", "(Lcom/shopapp/data/database/entity/ProductImageEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImageById", "imageId", "deleteImagesByProductId", "getImagesByProductId", "", "getImagesByProductIdFlow", "Lkotlinx/coroutines/flow/Flow;", "getPrimaryImageByProductId", "getPrimaryImageUrlByProductId", "insertImage", "insertImages", "images", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrimaryImage", "updateImage", "updatePrimaryImage", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@androidx.room.Dao()
public abstract interface ProductImageDao {
    
    @androidx.room.Query(value = "SELECT * FROM product_images WHERE product_id = :productId ORDER BY sort_order ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getImagesByProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.ProductImageEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM product_images WHERE product_id = :productId ORDER BY sort_order ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.ProductImageEntity>> getImagesByProductIdFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String productId);
    
    @androidx.room.Query(value = "SELECT * FROM product_images WHERE product_id = :productId AND is_primary = 1 LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPrimaryImageByProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.ProductImageEntity> $completion);
    
    @androidx.room.Query(value = "SELECT image_url FROM product_images WHERE product_id = :productId AND is_primary = 1 LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getPrimaryImageUrlByProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertImage(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductImageEntity image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertImages(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopapp.data.database.entity.ProductImageEntity> images, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateImage(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductImageEntity image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteImage(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.ProductImageEntity image, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM product_images WHERE image_id = :imageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteImageById(@org.jetbrains.annotations.NotNull()
    java.lang.String imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM product_images WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteImagesByProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE product_images SET is_primary = 0 WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearPrimaryImages(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE product_images SET is_primary = 1 WHERE image_id = :imageId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setPrimaryImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Transaction()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePrimaryImage(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String imageId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        @androidx.room.Transaction()
        @org.jetbrains.annotations.Nullable()
        public static java.lang.Object updatePrimaryImage(@org.jetbrains.annotations.NotNull()
        com.shopapp.data.database.dao.ProductImageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String productId, @org.jetbrains.annotations.NotNull()
        java.lang.String imageId, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
            return null;
        }
    }
}