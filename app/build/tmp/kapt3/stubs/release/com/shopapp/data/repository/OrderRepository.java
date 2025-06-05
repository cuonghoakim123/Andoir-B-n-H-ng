package com.shopapp.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u000e\u0010\u000fJ^\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u001d\u0010\u001eJN\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b \u0010!J\b\u0010\"\u001a\u00020\rH\u0002J\u0018\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0016\u0010$\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110&0)2\u0006\u0010*\u001a\u00020\rJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110&0)2\u0006\u0010\u0012\u001a\u00020\rJ\u0016\u0010,\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000fJ$\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b.\u0010\u000fJ,\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010*\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b0\u00101J,\u00102\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u00103\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b4\u00101R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\u00a8\u00065"}, d2 = {"Lcom/shopapp/data/repository/OrderRepository;", "", "orderDao", "Lcom/shopapp/data/database/dao/OrderDao;", "orderItemDao", "Lcom/shopapp/data/database/dao/OrderItemDao;", "cartDao", "Lcom/shopapp/data/database/dao/CartDao;", "(Lcom/shopapp/data/database/dao/OrderDao;Lcom/shopapp/data/database/dao/OrderItemDao;Lcom/shopapp/data/database/dao/CartDao;)V", "cancelOrder", "Lkotlin/Result;", "", "orderId", "", "cancelOrder-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrder", "Lcom/shopapp/data/database/entity/OrderEntity;", "userId", "product", "Lcom/shopapp/data/model/Product;", "quantity", "", "customerName", "customerPhone", "deliveryAddress", "paymentMethod", "shippingFee", "", "createOrder-tZkwj4A", "(Ljava/lang/String;Lcom/shopapp/data/model/Product;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createOrderFromCart", "createOrderFromCart-bMdYcbs", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateOrderNumber", "getOrderById", "getOrderCountByUser", "getOrderItems", "", "Lcom/shopapp/data/database/entity/OrderItemEntity;", "getOrdersByStatus", "Lkotlinx/coroutines/flow/Flow;", "status", "getOrdersByUserId", "getTotalSpentByUser", "markOrderAsDelivered", "markOrderAsDelivered-gIAlu-s", "updateOrderStatus", "updateOrderStatus-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePaymentStatus", "paymentStatus", "updatePaymentStatus-0E7RQCE", "app_release"})
public final class OrderRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.OrderDao orderDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.OrderItemDao orderItemDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.shopapp.data.database.dao.CartDao cartDao = null;
    
    @javax.inject.Inject()
    public OrderRepository(@org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.OrderDao orderDao, @org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.OrderItemDao orderItemDao, @org.jetbrains.annotations.NotNull()
    com.shopapp.data.database.dao.CartDao cartDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.shopapp.data.database.entity.OrderEntity>> getOrdersByStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderById(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.shopapp.data.database.entity.OrderEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderItems(@org.jetbrains.annotations.NotNull()
    java.lang.String orderId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.shopapp.data.database.entity.OrderItemEntity>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getOrderCountByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTotalSpentByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Double> $completion) {
        return null;
    }
    
    private final java.lang.String generateOrderNumber() {
        return null;
    }
}