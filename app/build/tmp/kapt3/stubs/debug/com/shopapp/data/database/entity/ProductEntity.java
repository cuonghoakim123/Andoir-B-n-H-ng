package com.shopapp.data.database.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0002\u0010\u001bJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u00102J\u000b\u00106\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0011H\u00c6\u0003J\t\u00108\u001a\u00020\u000bH\u00c6\u0003J\t\u00109\u001a\u00020\u0014H\u00c6\u0003J\t\u0010:\u001a\u00020\u0014H\u00c6\u0003J\t\u0010;\u001a\u00020\u000bH\u00c6\u0003J\t\u0010<\u001a\u00020\u0014H\u00c6\u0003J\t\u0010=\u001a\u00020\u0019H\u00c6\u0003J\t\u0010>\u001a\u00020\u0019H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00d4\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00142\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u000bH\u00d6\u0001J\t\u0010L\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0016\u0010\u0016\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010%R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010%R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010$R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0016\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102\u00a8\u0006M"}, d2 = {"Lcom/shopapp/data/database/entity/ProductEntity;", "", "productId", "", "name", "description", "price", "", "originalPrice", "categoryId", "stockQuantity", "", "sku", "brand", "weight", "dimensions", "rating", "", "reviewCount", "isFeatured", "", "isOnSale", "discountPercentage", "isActive", "createdAt", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;FIZZIZJJ)V", "getBrand", "()Ljava/lang/String;", "getCategoryId", "getCreatedAt", "()J", "getDescription", "getDimensions", "getDiscountPercentage", "()I", "()Z", "getName", "getOriginalPrice", "()D", "getPrice", "getProductId", "getRating", "()F", "getReviewCount", "getSku", "getStockQuantity", "getUpdatedAt", "getWeight", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;FIZZIZJJ)Lcom/shopapp/data/database/entity/ProductEntity;", "equals", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "products", foreignKeys = {@androidx.room.ForeignKey(entity = com.shopapp.data.database.entity.CategoryEntity.class, parentColumns = {"category_id"}, childColumns = {"category_id"}, onDelete = 5)})
public final class ProductEntity {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "product_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productId = null;
    @androidx.room.ColumnInfo(name = "name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @androidx.room.ColumnInfo(name = "description")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String description = null;
    @androidx.room.ColumnInfo(name = "price")
    private final double price = 0.0;
    @androidx.room.ColumnInfo(name = "original_price")
    private final double originalPrice = 0.0;
    @androidx.room.ColumnInfo(name = "category_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String categoryId = null;
    @androidx.room.ColumnInfo(name = "stock_quantity")
    private final int stockQuantity = 0;
    @androidx.room.ColumnInfo(name = "sku")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String sku = null;
    @androidx.room.ColumnInfo(name = "brand")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String brand = null;
    @androidx.room.ColumnInfo(name = "weight")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Double weight = null;
    @androidx.room.ColumnInfo(name = "dimensions")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String dimensions = null;
    @androidx.room.ColumnInfo(name = "rating")
    private final float rating = 0.0F;
    @androidx.room.ColumnInfo(name = "review_count")
    private final int reviewCount = 0;
    @androidx.room.ColumnInfo(name = "is_featured")
    private final boolean isFeatured = false;
    @androidx.room.ColumnInfo(name = "is_on_sale")
    private final boolean isOnSale = false;
    @androidx.room.ColumnInfo(name = "discount_percentage")
    private final int discountPercentage = 0;
    @androidx.room.ColumnInfo(name = "is_active")
    private final boolean isActive = false;
    @androidx.room.ColumnInfo(name = "created_at")
    private final long createdAt = 0L;
    @androidx.room.ColumnInfo(name = "updated_at")
    private final long updatedAt = 0L;
    
    public ProductEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double price, double originalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int stockQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double weight, @org.jetbrains.annotations.Nullable()
    java.lang.String dimensions, float rating, int reviewCount, boolean isFeatured, boolean isOnSale, int discountPercentage, boolean isActive, long createdAt, long updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final double getOriginalPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryId() {
        return null;
    }
    
    public final int getStockQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSku() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getWeight() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDimensions() {
        return null;
    }
    
    public final float getRating() {
        return 0.0F;
    }
    
    public final int getReviewCount() {
        return 0;
    }
    
    public final boolean isFeatured() {
        return false;
    }
    
    public final boolean isOnSale() {
        return false;
    }
    
    public final int getDiscountPercentage() {
        return 0;
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final long getUpdatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component11() {
        return null;
    }
    
    public final float component12() {
        return 0.0F;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final long component18() {
        return 0L;
    }
    
    public final long component19() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopapp.data.database.entity.ProductEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, double price, double originalPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String categoryId, int stockQuantity, @org.jetbrains.annotations.Nullable()
    java.lang.String sku, @org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.Double weight, @org.jetbrains.annotations.Nullable()
    java.lang.String dimensions, float rating, int reviewCount, boolean isFeatured, boolean isOnSale, int discountPercentage, boolean isActive, long createdAt, long updatedAt) {
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