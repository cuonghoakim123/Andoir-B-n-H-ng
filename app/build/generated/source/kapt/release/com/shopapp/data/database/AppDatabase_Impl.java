package com.shopapp.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.shopapp.data.database.dao.CartDao;
import com.shopapp.data.database.dao.CartDao_Impl;
import com.shopapp.data.database.dao.CategoryDao;
import com.shopapp.data.database.dao.CategoryDao_Impl;
import com.shopapp.data.database.dao.OrderDao;
import com.shopapp.data.database.dao.OrderDao_Impl;
import com.shopapp.data.database.dao.OrderItemDao;
import com.shopapp.data.database.dao.OrderItemDao_Impl;
import com.shopapp.data.database.dao.ProductDao;
import com.shopapp.data.database.dao.ProductDao_Impl;
import com.shopapp.data.database.dao.ProductImageDao;
import com.shopapp.data.database.dao.ProductImageDao_Impl;
import com.shopapp.data.database.dao.UserDao;
import com.shopapp.data.database.dao.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile UserDao _userDao;

  private volatile CategoryDao _categoryDao;

  private volatile ProductDao _productDao;

  private volatile ProductImageDao _productImageDao;

  private volatile CartDao _cartDao;

  private volatile OrderDao _orderDao;

  private volatile OrderItemDao _orderItemDao;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `users` (`user_id` TEXT NOT NULL, `email` TEXT NOT NULL, `password_hash` TEXT NOT NULL, `full_name` TEXT NOT NULL, `phone_number` TEXT, `address` TEXT, `avatar_url` TEXT, `is_verified` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`user_id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `categories` (`category_id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT, `icon_url` TEXT, `color` TEXT, `sort_order` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`category_id`))");
        db.execSQL("CREATE TABLE IF NOT EXISTS `products` (`product_id` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `price` REAL NOT NULL, `original_price` REAL NOT NULL, `category_id` TEXT NOT NULL, `stock_quantity` INTEGER NOT NULL, `sku` TEXT, `brand` TEXT, `weight` REAL, `dimensions` TEXT, `rating` REAL NOT NULL, `review_count` INTEGER NOT NULL, `is_featured` INTEGER NOT NULL, `is_on_sale` INTEGER NOT NULL, `discount_percentage` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`product_id`), FOREIGN KEY(`category_id`) REFERENCES `categories`(`category_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS `product_images` (`image_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `image_url` TEXT NOT NULL, `alt_text` TEXT, `sort_order` INTEGER NOT NULL, `is_primary` INTEGER NOT NULL, `created_at` INTEGER NOT NULL, PRIMARY KEY(`image_id`), FOREIGN KEY(`product_id`) REFERENCES `products`(`product_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS `cart_items` (`cart_id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `quantity` INTEGER NOT NULL, `added_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`cart_id`), FOREIGN KEY(`user_id`) REFERENCES `users`(`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`product_id`) REFERENCES `products`(`product_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS `orders` (`order_id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `order_number` TEXT NOT NULL, `status` TEXT NOT NULL, `subtotal` REAL NOT NULL, `shipping_fee` REAL NOT NULL, `tax_amount` REAL NOT NULL, `discount_amount` REAL NOT NULL, `total_amount` REAL NOT NULL, `payment_method` TEXT NOT NULL, `payment_status` TEXT NOT NULL, `customer_name` TEXT NOT NULL, `customer_phone` TEXT NOT NULL, `delivery_address` TEXT NOT NULL, `notes` TEXT, `created_at` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `delivered_at` INTEGER, PRIMARY KEY(`order_id`), FOREIGN KEY(`user_id`) REFERENCES `users`(`user_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS `order_items` (`order_item_id` TEXT NOT NULL, `order_id` TEXT NOT NULL, `product_id` TEXT NOT NULL, `product_name` TEXT NOT NULL, `product_image_url` TEXT, `unit_price` REAL NOT NULL, `quantity` INTEGER NOT NULL, `total_price` REAL NOT NULL, `created_at` INTEGER NOT NULL, PRIMARY KEY(`order_item_id`), FOREIGN KEY(`order_id`) REFERENCES `orders`(`order_id`) ON UPDATE NO ACTION ON DELETE CASCADE , FOREIGN KEY(`product_id`) REFERENCES `products`(`product_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '47bdfceb75d70c9f1ae444108af38dc7')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `users`");
        db.execSQL("DROP TABLE IF EXISTS `categories`");
        db.execSQL("DROP TABLE IF EXISTS `products`");
        db.execSQL("DROP TABLE IF EXISTS `product_images`");
        db.execSQL("DROP TABLE IF EXISTS `cart_items`");
        db.execSQL("DROP TABLE IF EXISTS `orders`");
        db.execSQL("DROP TABLE IF EXISTS `order_items`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        db.execSQL("PRAGMA foreign_keys = ON");
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsUsers = new HashMap<String, TableInfo.Column>(10);
        _columnsUsers.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("email", new TableInfo.Column("email", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("password_hash", new TableInfo.Column("password_hash", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("full_name", new TableInfo.Column("full_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("phone_number", new TableInfo.Column("phone_number", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("address", new TableInfo.Column("address", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("is_verified", new TableInfo.Column("is_verified", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUsers.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUsers = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUsers = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUsers = new TableInfo("users", _columnsUsers, _foreignKeysUsers, _indicesUsers);
        final TableInfo _existingUsers = TableInfo.read(db, "users");
        if (!_infoUsers.equals(_existingUsers)) {
          return new RoomOpenHelper.ValidationResult(false, "users(com.shopapp.data.database.entity.UserEntity).\n"
                  + " Expected:\n" + _infoUsers + "\n"
                  + " Found:\n" + _existingUsers);
        }
        final HashMap<String, TableInfo.Column> _columnsCategories = new HashMap<String, TableInfo.Column>(9);
        _columnsCategories.put("category_id", new TableInfo.Column("category_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("icon_url", new TableInfo.Column("icon_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("color", new TableInfo.Column("color", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("sort_order", new TableInfo.Column("sort_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategories.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategories = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategories = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategories = new TableInfo("categories", _columnsCategories, _foreignKeysCategories, _indicesCategories);
        final TableInfo _existingCategories = TableInfo.read(db, "categories");
        if (!_infoCategories.equals(_existingCategories)) {
          return new RoomOpenHelper.ValidationResult(false, "categories(com.shopapp.data.database.entity.CategoryEntity).\n"
                  + " Expected:\n" + _infoCategories + "\n"
                  + " Found:\n" + _existingCategories);
        }
        final HashMap<String, TableInfo.Column> _columnsProducts = new HashMap<String, TableInfo.Column>(19);
        _columnsProducts.put("product_id", new TableInfo.Column("product_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("description", new TableInfo.Column("description", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("price", new TableInfo.Column("price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("original_price", new TableInfo.Column("original_price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("category_id", new TableInfo.Column("category_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("stock_quantity", new TableInfo.Column("stock_quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("sku", new TableInfo.Column("sku", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("brand", new TableInfo.Column("brand", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("weight", new TableInfo.Column("weight", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("dimensions", new TableInfo.Column("dimensions", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("rating", new TableInfo.Column("rating", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("review_count", new TableInfo.Column("review_count", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("is_featured", new TableInfo.Column("is_featured", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("is_on_sale", new TableInfo.Column("is_on_sale", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("discount_percentage", new TableInfo.Column("discount_percentage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("is_active", new TableInfo.Column("is_active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProducts.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProducts = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysProducts.add(new TableInfo.ForeignKey("categories", "CASCADE", "NO ACTION", Arrays.asList("category_id"), Arrays.asList("category_id")));
        final HashSet<TableInfo.Index> _indicesProducts = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProducts = new TableInfo("products", _columnsProducts, _foreignKeysProducts, _indicesProducts);
        final TableInfo _existingProducts = TableInfo.read(db, "products");
        if (!_infoProducts.equals(_existingProducts)) {
          return new RoomOpenHelper.ValidationResult(false, "products(com.shopapp.data.database.entity.ProductEntity).\n"
                  + " Expected:\n" + _infoProducts + "\n"
                  + " Found:\n" + _existingProducts);
        }
        final HashMap<String, TableInfo.Column> _columnsProductImages = new HashMap<String, TableInfo.Column>(7);
        _columnsProductImages.put("image_id", new TableInfo.Column("image_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("product_id", new TableInfo.Column("product_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("image_url", new TableInfo.Column("image_url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("alt_text", new TableInfo.Column("alt_text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("sort_order", new TableInfo.Column("sort_order", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("is_primary", new TableInfo.Column("is_primary", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsProductImages.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysProductImages = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysProductImages.add(new TableInfo.ForeignKey("products", "CASCADE", "NO ACTION", Arrays.asList("product_id"), Arrays.asList("product_id")));
        final HashSet<TableInfo.Index> _indicesProductImages = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoProductImages = new TableInfo("product_images", _columnsProductImages, _foreignKeysProductImages, _indicesProductImages);
        final TableInfo _existingProductImages = TableInfo.read(db, "product_images");
        if (!_infoProductImages.equals(_existingProductImages)) {
          return new RoomOpenHelper.ValidationResult(false, "product_images(com.shopapp.data.database.entity.ProductImageEntity).\n"
                  + " Expected:\n" + _infoProductImages + "\n"
                  + " Found:\n" + _existingProductImages);
        }
        final HashMap<String, TableInfo.Column> _columnsCartItems = new HashMap<String, TableInfo.Column>(6);
        _columnsCartItems.put("cart_id", new TableInfo.Column("cart_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("product_id", new TableInfo.Column("product_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("added_at", new TableInfo.Column("added_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCartItems.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCartItems = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysCartItems.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("user_id"), Arrays.asList("user_id")));
        _foreignKeysCartItems.add(new TableInfo.ForeignKey("products", "CASCADE", "NO ACTION", Arrays.asList("product_id"), Arrays.asList("product_id")));
        final HashSet<TableInfo.Index> _indicesCartItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCartItems = new TableInfo("cart_items", _columnsCartItems, _foreignKeysCartItems, _indicesCartItems);
        final TableInfo _existingCartItems = TableInfo.read(db, "cart_items");
        if (!_infoCartItems.equals(_existingCartItems)) {
          return new RoomOpenHelper.ValidationResult(false, "cart_items(com.shopapp.data.database.entity.CartEntity).\n"
                  + " Expected:\n" + _infoCartItems + "\n"
                  + " Found:\n" + _existingCartItems);
        }
        final HashMap<String, TableInfo.Column> _columnsOrders = new HashMap<String, TableInfo.Column>(18);
        _columnsOrders.put("order_id", new TableInfo.Column("order_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("user_id", new TableInfo.Column("user_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("order_number", new TableInfo.Column("order_number", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("subtotal", new TableInfo.Column("subtotal", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("shipping_fee", new TableInfo.Column("shipping_fee", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("tax_amount", new TableInfo.Column("tax_amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("discount_amount", new TableInfo.Column("discount_amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("total_amount", new TableInfo.Column("total_amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("payment_method", new TableInfo.Column("payment_method", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("payment_status", new TableInfo.Column("payment_status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("customer_name", new TableInfo.Column("customer_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("customer_phone", new TableInfo.Column("customer_phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("delivery_address", new TableInfo.Column("delivery_address", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("notes", new TableInfo.Column("notes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("updated_at", new TableInfo.Column("updated_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrders.put("delivered_at", new TableInfo.Column("delivered_at", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrders = new HashSet<TableInfo.ForeignKey>(1);
        _foreignKeysOrders.add(new TableInfo.ForeignKey("users", "CASCADE", "NO ACTION", Arrays.asList("user_id"), Arrays.asList("user_id")));
        final HashSet<TableInfo.Index> _indicesOrders = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrders = new TableInfo("orders", _columnsOrders, _foreignKeysOrders, _indicesOrders);
        final TableInfo _existingOrders = TableInfo.read(db, "orders");
        if (!_infoOrders.equals(_existingOrders)) {
          return new RoomOpenHelper.ValidationResult(false, "orders(com.shopapp.data.database.entity.OrderEntity).\n"
                  + " Expected:\n" + _infoOrders + "\n"
                  + " Found:\n" + _existingOrders);
        }
        final HashMap<String, TableInfo.Column> _columnsOrderItems = new HashMap<String, TableInfo.Column>(9);
        _columnsOrderItems.put("order_item_id", new TableInfo.Column("order_item_id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("order_id", new TableInfo.Column("order_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("product_id", new TableInfo.Column("product_id", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("product_name", new TableInfo.Column("product_name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("product_image_url", new TableInfo.Column("product_image_url", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("unit_price", new TableInfo.Column("unit_price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("quantity", new TableInfo.Column("quantity", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("total_price", new TableInfo.Column("total_price", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOrderItems.put("created_at", new TableInfo.Column("created_at", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOrderItems = new HashSet<TableInfo.ForeignKey>(2);
        _foreignKeysOrderItems.add(new TableInfo.ForeignKey("orders", "CASCADE", "NO ACTION", Arrays.asList("order_id"), Arrays.asList("order_id")));
        _foreignKeysOrderItems.add(new TableInfo.ForeignKey("products", "CASCADE", "NO ACTION", Arrays.asList("product_id"), Arrays.asList("product_id")));
        final HashSet<TableInfo.Index> _indicesOrderItems = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOrderItems = new TableInfo("order_items", _columnsOrderItems, _foreignKeysOrderItems, _indicesOrderItems);
        final TableInfo _existingOrderItems = TableInfo.read(db, "order_items");
        if (!_infoOrderItems.equals(_existingOrderItems)) {
          return new RoomOpenHelper.ValidationResult(false, "order_items(com.shopapp.data.database.entity.OrderItemEntity).\n"
                  + " Expected:\n" + _infoOrderItems + "\n"
                  + " Found:\n" + _existingOrderItems);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "47bdfceb75d70c9f1ae444108af38dc7", "a74db50177f29958dedf03af81efe77f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "users","categories","products","product_images","cart_items","orders","order_items");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    final boolean _supportsDeferForeignKeys = android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP;
    try {
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = FALSE");
      }
      super.beginTransaction();
      if (_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA defer_foreign_keys = TRUE");
      }
      _db.execSQL("DELETE FROM `users`");
      _db.execSQL("DELETE FROM `categories`");
      _db.execSQL("DELETE FROM `products`");
      _db.execSQL("DELETE FROM `product_images`");
      _db.execSQL("DELETE FROM `cart_items`");
      _db.execSQL("DELETE FROM `orders`");
      _db.execSQL("DELETE FROM `order_items`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      if (!_supportsDeferForeignKeys) {
        _db.execSQL("PRAGMA foreign_keys = TRUE");
      }
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CategoryDao.class, CategoryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ProductDao.class, ProductDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ProductImageDao.class, ProductImageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CartDao.class, CartDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OrderDao.class, OrderDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OrderItemDao.class, OrderItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public CategoryDao categoryDao() {
    if (_categoryDao != null) {
      return _categoryDao;
    } else {
      synchronized(this) {
        if(_categoryDao == null) {
          _categoryDao = new CategoryDao_Impl(this);
        }
        return _categoryDao;
      }
    }
  }

  @Override
  public ProductDao productDao() {
    if (_productDao != null) {
      return _productDao;
    } else {
      synchronized(this) {
        if(_productDao == null) {
          _productDao = new ProductDao_Impl(this);
        }
        return _productDao;
      }
    }
  }

  @Override
  public ProductImageDao productImageDao() {
    if (_productImageDao != null) {
      return _productImageDao;
    } else {
      synchronized(this) {
        if(_productImageDao == null) {
          _productImageDao = new ProductImageDao_Impl(this);
        }
        return _productImageDao;
      }
    }
  }

  @Override
  public CartDao cartDao() {
    if (_cartDao != null) {
      return _cartDao;
    } else {
      synchronized(this) {
        if(_cartDao == null) {
          _cartDao = new CartDao_Impl(this);
        }
        return _cartDao;
      }
    }
  }

  @Override
  public OrderDao orderDao() {
    if (_orderDao != null) {
      return _orderDao;
    } else {
      synchronized(this) {
        if(_orderDao == null) {
          _orderDao = new OrderDao_Impl(this);
        }
        return _orderDao;
      }
    }
  }

  @Override
  public OrderItemDao orderItemDao() {
    if (_orderItemDao != null) {
      return _orderItemDao;
    } else {
      synchronized(this) {
        if(_orderItemDao == null) {
          _orderItemDao = new OrderItemDao_Impl(this);
        }
        return _orderItemDao;
      }
    }
  }
}
