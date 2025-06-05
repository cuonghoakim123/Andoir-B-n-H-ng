package com.shopapp.data.database.entity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0002\u0010\u0017J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0014H\u00c6\u0003J\t\u00107\u001a\u00020\u0014H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\bH\u00c6\u0003J\t\u0010>\u001a\u00020\bH\u00c6\u0003J\t\u0010?\u001a\u00020\bH\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\u00c6\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020GH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\"R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0016\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001b\u00a8\u0006I"}, d2 = {"Lcom/shopapp/data/database/entity/OrderEntity;", "", "orderId", "", "userId", "orderNumber", "status", "subtotal", "", "shippingFee", "taxAmount", "discountAmount", "totalAmount", "paymentMethod", "paymentStatus", "customerName", "customerPhone", "deliveryAddress", "notes", "createdAt", "", "updatedAt", "deliveredAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;)V", "getCreatedAt", "()J", "getCustomerName", "()Ljava/lang/String;", "getCustomerPhone", "getDeliveredAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeliveryAddress", "getDiscountAmount", "()D", "getNotes", "getOrderId", "getOrderNumber", "getPaymentMethod", "getPaymentStatus", "getShippingFee", "getStatus", "getSubtotal", "getTaxAmount", "getTotalAmount", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/Long;)Lcom/shopapp/data/database/entity/OrderEntity;", "equals", "", "other", "hashCode", "", "toString", "app_release"})
@androidx.room.Entity(tableName = "orders", foreignKeys = {@androidx.room.ForeignKey(entity = com.shopapp.data.database.entity.UserEntity.class, parentColumns = {"user_id"}, childColumns = {"user_id"}, onDelete = 5)})
public final class OrderEntity {
    @androidx.room.PrimaryKey()
    @androidx.room.ColumnInfo(name = "order_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderId = null;
    @androidx.room.ColumnInfo(name = "user_id")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    @androidx.room.ColumnInfo(name = "order_number")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String orderNumber = null;
    @androidx.room.ColumnInfo(name = "status")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String status = null;
    @androidx.room.ColumnInfo(name = "subtotal")
    private final double subtotal = 0.0;
    @androidx.room.ColumnInfo(name = "shipping_fee")
    private final double shippingFee = 0.0;
    @androidx.room.ColumnInfo(name = "tax_amount")
    private final double taxAmount = 0.0;
    @androidx.room.ColumnInfo(name = "discount_amount")
    private final double discountAmount = 0.0;
    @androidx.room.ColumnInfo(name = "total_amount")
    private final double totalAmount = 0.0;
    @androidx.room.ColumnInfo(name = "payment_method")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String paymentMethod = null;
    @androidx.room.ColumnInfo(name = "payment_status")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String paymentStatus = null;
    @androidx.room.ColumnInfo(name = "customer_name")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customerName = null;
    @androidx.room.ColumnInfo(name = "customer_phone")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String customerPhone = null;
    @androidx.room.ColumnInfo(name = "delivery_address")
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String deliveryAddress = null;
    @androidx.room.ColumnInfo(name = "notes")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String notes = null;
    @androidx.room.ColumnInfo(name = "created_at")
    private final long createdAt = 0L;
    @androidx.room.ColumnInfo(name = "updated_at")
    private final long updatedAt = 0L;
    @androidx.room.ColumnInfo(name = "delivered_at")
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Long deliveredAt = null;
    
    public OrderEntity(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String status, double subtotal, double shippingFee, double taxAmount, double discountAmount, double totalAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String customerName, @org.jetbrains.annotations.NotNull()
    java.lang.String customerPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String deliveryAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, long createdAt, long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long deliveredAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrderNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStatus() {
        return null;
    }
    
    public final double getSubtotal() {
        return 0.0;
    }
    
    public final double getShippingFee() {
        return 0.0;
    }
    
    public final double getTaxAmount() {
        return 0.0;
    }
    
    public final double getDiscountAmount() {
        return 0.0;
    }
    
    public final double getTotalAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentMethod() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPaymentStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCustomerPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDeliveryAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final long getUpdatedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDeliveredAt() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component15() {
        return null;
    }
    
    public final long component16() {
        return 0L;
    }
    
    public final long component17() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component18() {
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
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.shopapp.data.database.entity.OrderEntity copy(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String orderNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String status, double subtotal, double shippingFee, double taxAmount, double discountAmount, double totalAmount, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentMethod, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus, @org.jetbrains.annotations.NotNull()
    java.lang.String customerName, @org.jetbrains.annotations.NotNull()
    java.lang.String customerPhone, @org.jetbrains.annotations.NotNull()
    java.lang.String deliveryAddress, @org.jetbrains.annotations.Nullable()
    java.lang.String notes, long createdAt, long updatedAt, @org.jetbrains.annotations.Nullable()
    java.lang.Long deliveredAt) {
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