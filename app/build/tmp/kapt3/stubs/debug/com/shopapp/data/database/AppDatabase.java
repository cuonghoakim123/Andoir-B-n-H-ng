package com.shopapp.data.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&\u00a8\u0006\u0012"}, d2 = {"Lcom/shopapp/data/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "cartDao", "Lcom/shopapp/data/database/dao/CartDao;", "categoryDao", "Lcom/shopapp/data/database/dao/CategoryDao;", "orderDao", "Lcom/shopapp/data/database/dao/OrderDao;", "orderItemDao", "Lcom/shopapp/data/database/dao/OrderItemDao;", "productDao", "Lcom/shopapp/data/database/dao/ProductDao;", "productImageDao", "Lcom/shopapp/data/database/dao/ProductImageDao;", "userDao", "Lcom/shopapp/data/database/dao/UserDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.shopapp.data.database.entity.UserEntity.class, com.shopapp.data.database.entity.CategoryEntity.class, com.shopapp.data.database.entity.ProductEntity.class, com.shopapp.data.database.entity.ProductImageEntity.class, com.shopapp.data.database.entity.CartEntity.class, com.shopapp.data.database.entity.OrderEntity.class, com.shopapp.data.database.entity.OrderItemEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.shopapp.data.database.converter.Converters.class})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.shopapp.data.database.AppDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.shopapp.data.database.AppDatabase.Companion Companion = null;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.UserDao userDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.CategoryDao categoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.ProductDao productDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.ProductImageDao productImageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.CartDao cartDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.OrderDao orderDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.shopapp.data.database.dao.OrderItemDao orderItemDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/shopapp/data/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/shopapp/data/database/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.shopapp.data.database.AppDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}