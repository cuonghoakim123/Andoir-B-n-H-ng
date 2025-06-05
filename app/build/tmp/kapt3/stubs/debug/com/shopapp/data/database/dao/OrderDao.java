package com.shopapp.data.database.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0017\u001a\u00020\tH\'J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0013\u001a\u00020\tH\'J*\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0015\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\rH\'J\u001c\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\f2\u0006\u0010\u0015\u001a\u00020\tH\'J\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J4\u0010\u001f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J(\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010&J(\u0010\'\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020!H\u00a7@\u00a2\u0006\u0002\u0010&\u00a8\u0006("}, d2 = {"Lcom/shopapp/data/database/dao/OrderDao;", "", "deleteOrder", "", "order", "Lcom/shopapp/data/database/entity/OrderEntity;", "(Lcom/shopapp/data/database/entity/OrderEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrderById", "orderId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrders", "Lkotlinx/coroutines/flow/Flow;", "", "getOrderById", "getOrderByNumber", "orderNumber", "getOrderCountByStatus", "", "status", "getOrderCountByUser", "userId", "getOrdersByPaymentStatus", "paymentStatus", "getOrdersByStatus", "getOrdersByUserAndStatuses", "statuses", "getOrdersByUserId", "getTotalSpentByUser", "", "insertOrder", "markOrderAsDelivered", "deliveredAt", "", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "updateOrderStatus", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentStatus", "app_debug"})
@androidx.room.Dao()
public abstract interface OrderDao {
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderById(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.OrderEntity> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE user_id = :userId ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE status = :status ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status);
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE payment_status = :paymentStatus ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByPaymentStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus);
    
    @androidx.room.Query(value = "SELECT * FROM orders ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getAllOrders();
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE user_id = :userId AND status IN (:statuses) ORDER BY created_at DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByUserAndStatuses(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> statuses);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderEntity order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Update()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderEntity order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOrder(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.entity.OrderEntity order, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM orders WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteOrderById(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE orders SET status = :status, updated_at = :updatedAt WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateOrderStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String status, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE orders SET payment_status = :paymentStatus, updated_at = :updatedAt WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePaymentStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String paymentStatus, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "UPDATE orders SET status = :status, delivered_at = :deliveredAt, updated_at = :updatedAt WHERE order_id = :orderId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object markOrderAsDelivered(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    java.lang.String status, long deliveredAt, long updatedAt, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM orders WHERE user_id = :userId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderCountByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM orders WHERE status = :status")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderCountByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT SUM(total_amount) FROM orders WHERE user_id = :userId AND payment_status = \'PAID\'")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTotalSpentByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM orders WHERE order_number = :orderNumber")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getOrderByNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String orderNumber, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.OrderEntity> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}