package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00110\u00132\u0006\u0010\f\u001a\u00020\tH\'J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00112\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011H\u00a7@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006 "}, d2 = {"Lcom/shopapp/data/database/dao/OrderItemDao;", "", "deleteOrderItem", "", "orderItem", "Lcom/shopapp/data/database/entity/OrderItemEntity;", "(Lcom/shopapp/data/database/entity/OrderItemEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrderItemById", "orderItemId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrderItemsByOrderId", "orderId", "getOrderItemById", "getOrderItemCount", "", "getOrderItemsByOrderId", "", "getOrderItemsByOrderIdFlow", "Lkotlinx/coroutines/flow/Flow;", "getOrderItemsByProductId", "productId", "getOrderItemsTotal", "", "getOrderItemsTotalQuantity", "getProductOrderCount", "getProductTotalSold", "insertOrderItem", "insertOrderItems", "orderItems", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrderItem", "app_debug"})
@androidx.room.Dao()
public abstract interface OrderItemDao {
    
    @androidx.room.Query(value = "SELECT * FROM order_items WHERE order_id = :orderId ORDER BY created_at ASC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemsByOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.OrderItemEntity>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM order_items WHERE order_id = :orderId ORDER BY created_at ASC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderItemEntity>> getOrderItemsByOrderIdFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId);
    
    @androidx.room.Query(value = "SELECT * FROM order_items WHERE order_item_id = :orderItemId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemById(@org.jetbrains.annotations.NotNull()
    java.lang.String orderItemId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.OrderItemEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM order_items WHERE product_id = :productId ORDER BY created_at DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemsByProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.OrderItemEntity>> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrderItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderItemEntity orderItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrderItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.shopapp.data.database.entity.OrderItemEntity> orderItems, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateOrderItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderItemEntity orderItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOrderItem(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderItemEntity orderItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM order_items WHERE order_item_id = :orderItemId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOrderItemById(@org.jetbrains.annotations.NotNull()
    java.lang.String orderItemId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM order_items WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOrderItemsByOrderId(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM order_items WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemCount(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(total_price) FROM order_items WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemsTotal(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(quantity) FROM order_items WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderItemsTotalQuantity(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM order_items WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductOrderCount(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(quantity) FROM order_items WHERE product_id = :productId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductTotalSold(@org.jetbrains.annotations.NotNull()
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
}