package com.shopapp.data.database.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u000eH\u00c6\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\u000bH\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/shopapp/data/database/entity/OrderItemEntity;", "", "orderItemId", "", "orderId", "productId", "productName", "productImageUrl", "unitPrice", "", "quantity", "", "totalPrice", "createdAt", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIDJ)V", "getCreatedAt", "()J", "getOrderId", "()Ljava/lang/String;", "getOrderItemId", "getProductId", "getProductImageUrl", "getProductName", "getQuantity", "()I", "getTotalPrice", "()D", "getUnitPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "order_items", foreignKeys = {@androidx.room.ForeignKey(entity = com.shopapp.data.database.entity.OrderEntity.class, parentColumns = {"order_id"}, childColumns = {"order_id"}, onDelete = 5), @androidx.room.ForeignKey(entity = com.shopapp.data.database.entity.ProductEntity.class, parentColumns = {"product_id"}, childColumns = {"product_id"}, onDelete = 5)})
public final class OrderItemEntity {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "order_item_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderItemId = null;
    @androidx.room.ColumnInfo(name = "order_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderId = null;
    @androidx.room.ColumnInfo(name = "product_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productId = null;
    @androidx.room.ColumnInfo(name = "product_name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String productName = null;
    @androidx.room.ColumnInfo(name = "product_image_url")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String productImageUrl = null;
    @androidx.room.ColumnInfo(name = "unit_price")
    private final double unitPrice = 0.0;
    @androidx.room.ColumnInfo(name = "quantity")
    private final int quantity = 0;
    @androidx.room.ColumnInfo(name = "total_price")
    private final double totalPrice = 0.0;
    @androidx.room.ColumnInfo(name = "created_at")
    private final long createdAt = 0L;
    
    public OrderItemEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String orderItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrl, double unitPrice, int quantity, double totalPrice, long createdAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderItemId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProductImageUrl() {
        return null;
    }
    
    public final double getUnitPrice() {
        return 0.0;
    }
    
    public final int getQuantity() {
        return 0;
    }
    
    public final double getTotalPrice() {
        return 0.0;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final long component9() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopapp.data.database.entity.OrderItemEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String orderItemId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    java.lang.String productName, @org.jetbrains.annotations.Nullable()
    java.lang.String productImageUrl, double unitPrice, int quantity, double totalPrice, long createdAt) {
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