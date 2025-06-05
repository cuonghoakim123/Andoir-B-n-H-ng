package com.shopapp.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopapp.data.database.entity.ProductEntity;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class ProductDao_Impl implements ProductDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductEntity> __insertionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __deletionAdapterOfProductEntity;

  private final EntityDeletionOrUpdateAdapter<ProductEntity> __updateAdapterOfProductEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteProductById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductStock;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductRating;

  private final SharedSQLiteStatement __preparedStmtOfUpdateProductStatus;

  public ProductDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductEntity = new EntityInsertionAdapter<ProductEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `products` (`product_id`,`name`,`description`,`price`,`original_price`,`category_id`,`stock_quantity`,`sku`,`brand`,`weight`,`dimensions`,`rating`,`review_count`,`is_featured`,`is_on_sale`,`discount_percentage`,`is_active`,`created_at`,`updated_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        if (entity.getProductId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getProductId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        statement.bindDouble(4, entity.getPrice());
        statement.bindDouble(5, entity.getOriginalPrice());
        if (entity.getCategoryId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getCategoryId());
        }
        statement.bindLong(7, entity.getStockQuantity());
        if (entity.getSku() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getSku());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getBrand());
        }
        if (entity.getWeight() == null) {
          statement.bindNull(10);
        } else {
          statement.bindDouble(10, entity.getWeight());
        }
        if (entity.getDimensions() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getDimensions());
        }
        statement.bindDouble(12, entity.getRating());
        statement.bindLong(13, entity.getReviewCount());
        final int _tmp = entity.isFeatured() ? 1 : 0;
        statement.bindLong(14, _tmp);
        final int _tmp_1 = entity.isOnSale() ? 1 : 0;
        statement.bindLong(15, _tmp_1);
        statement.bindLong(16, entity.getDiscountPercentage());
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(17, _tmp_2);
        statement.bindLong(18, entity.getCreatedAt());
        statement.bindLong(19, entity.getUpdatedAt());
      }
    };
    this.__deletionAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `products` WHERE `product_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        if (entity.getProductId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getProductId());
        }
      }
    };
    this.__updateAdapterOfProductEntity = new EntityDeletionOrUpdateAdapter<ProductEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `products` SET `product_id` = ?,`name` = ?,`description` = ?,`price` = ?,`original_price` = ?,`category_id` = ?,`stock_quantity` = ?,`sku` = ?,`brand` = ?,`weight` = ?,`dimensions` = ?,`rating` = ?,`review_count` = ?,`is_featured` = ?,`is_on_sale` = ?,`discount_percentage` = ?,`is_active` = ?,`created_at` = ?,`updated_at` = ? WHERE `product_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductEntity entity) {
        if (entity.getProductId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getProductId());
        }
        if (entity.getName() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getName());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getDescription());
        }
        statement.bindDouble(4, entity.getPrice());
        statement.bindDouble(5, entity.getOriginalPrice());
        if (entity.getCategoryId() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getCategoryId());
        }
        statement.bindLong(7, entity.getStockQuantity());
        if (entity.getSku() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getSku());
        }
        if (entity.getBrand() == null) {
          statement.bindNull(9);
        } else {
          statement.bindString(9, entity.getBrand());
        }
        if (entity.getWeight() == null) {
          statement.bindNull(10);
        } else {
          statement.bindDouble(10, entity.getWeight());
        }
        if (entity.getDimensions() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getDimensions());
        }
        statement.bindDouble(12, entity.getRating());
        statement.bindLong(13, entity.getReviewCount());
        final int _tmp = entity.isFeatured() ? 1 : 0;
        statement.bindLong(14, _tmp);
        final int _tmp_1 = entity.isOnSale() ? 1 : 0;
        statement.bindLong(15, _tmp_1);
        statement.bindLong(16, entity.getDiscountPercentage());
        final int _tmp_2 = entity.isActive() ? 1 : 0;
        statement.bindLong(17, _tmp_2);
        statement.bindLong(18, entity.getCreatedAt());
        statement.bindLong(19, entity.getUpdatedAt());
        if (entity.getProductId() == null) {
          statement.bindNull(20);
        } else {
          statement.bindString(20, entity.getProductId());
        }
      }
    };
    this.__preparedStmtOfDeleteProductById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM products WHERE product_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductStock = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE products SET stock_quantity = ?, updated_at = ? WHERE product_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductRating = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE products SET rating = ?, review_count = ?, updated_at = ? WHERE product_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateProductStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE products SET is_active = ?, updated_at = ? WHERE product_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertProduct(final ProductEntity product,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertProducts(final List<ProductEntity> products,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductEntity.insert(products);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteProduct(final ProductEntity product,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductEntity.handle(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProduct(final ProductEntity product,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProductEntity.handle(product);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteProductById(final String productId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteProductById.acquire();
        int _argIndex = 1;
        if (productId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfDeleteProductById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProductStock(final String productId, final int stockQuantity,
      final long updatedAt, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductStock.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, stockQuantity);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 3;
        if (productId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProductStock.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProductRating(final String productId, final float rating,
      final int reviewCount, final long updatedAt, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductRating.acquire();
        int _argIndex = 1;
        _stmt.bindDouble(_argIndex, rating);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, reviewCount);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 4;
        if (productId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProductRating.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object updateProductStatus(final String productId, final boolean isActive,
      final long updatedAt, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateProductStatus.acquire();
        int _argIndex = 1;
        final int _tmp = isActive ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 3;
        if (productId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, productId);
        }
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfUpdateProductStatus.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getProductById(final String productId,
      final Continuation<? super ProductEntity> $completion) {
    final String _sql = "SELECT * FROM products WHERE product_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ProductEntity>() {
      @Override
      @Nullable
      public ProductEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final ProductEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _result = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ProductEntity>> getAllActiveProducts() {
    final String _sql = "SELECT * FROM products WHERE is_active = 1 ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ProductEntity>> getProductsByCategory(final String categoryId) {
    final String _sql = "SELECT * FROM products WHERE category_id = ? AND is_active = 1 ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (categoryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, categoryId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ProductEntity>> getFeaturedProducts(final int limit) {
    final String _sql = "SELECT * FROM products WHERE is_featured = 1 AND is_active = 1 ORDER BY created_at DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ProductEntity>> getSaleProducts(final int limit) {
    final String _sql = "SELECT * FROM products WHERE is_on_sale = 1 AND is_active = 1 ORDER BY discount_percentage DESC LIMIT ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, limit);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object searchProducts(final String searchQuery,
      final Continuation<? super List<ProductEntity>> $completion) {
    final String _sql = "SELECT * FROM products WHERE (name LIKE '%' || ? || '%' OR description LIKE '%' || ? || '%') AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    _argIndex = 2;
    if (searchQuery == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, searchQuery);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<ProductEntity>> getProductsByRating(final float minRating) {
    final String _sql = "SELECT * FROM products WHERE rating >= ? AND is_active = 1 ORDER BY rating DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, minRating);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<List<ProductEntity>> getProductsByPriceRange(final double minPrice,
      final double maxPrice) {
    final String _sql = "SELECT * FROM products WHERE price BETWEEN ? AND ? AND is_active = 1 ORDER BY price ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindDouble(_argIndex, minPrice);
    _argIndex = 2;
    _statement.bindDouble(_argIndex, maxPrice);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"products"}, new Callable<List<ProductEntity>>() {
      @Override
      @NonNull
      public List<ProductEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "price");
          final int _cursorIndexOfOriginalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "original_price");
          final int _cursorIndexOfCategoryId = CursorUtil.getColumnIndexOrThrow(_cursor, "category_id");
          final int _cursorIndexOfStockQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "stock_quantity");
          final int _cursorIndexOfSku = CursorUtil.getColumnIndexOrThrow(_cursor, "sku");
          final int _cursorIndexOfBrand = CursorUtil.getColumnIndexOrThrow(_cursor, "brand");
          final int _cursorIndexOfWeight = CursorUtil.getColumnIndexOrThrow(_cursor, "weight");
          final int _cursorIndexOfDimensions = CursorUtil.getColumnIndexOrThrow(_cursor, "dimensions");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfReviewCount = CursorUtil.getColumnIndexOrThrow(_cursor, "review_count");
          final int _cursorIndexOfIsFeatured = CursorUtil.getColumnIndexOrThrow(_cursor, "is_featured");
          final int _cursorIndexOfIsOnSale = CursorUtil.getColumnIndexOrThrow(_cursor, "is_on_sale");
          final int _cursorIndexOfDiscountPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_percentage");
          final int _cursorIndexOfIsActive = CursorUtil.getColumnIndexOrThrow(_cursor, "is_active");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final List<ProductEntity> _result = new ArrayList<ProductEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductEntity _item;
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final double _tmpPrice;
            _tmpPrice = _cursor.getDouble(_cursorIndexOfPrice);
            final double _tmpOriginalPrice;
            _tmpOriginalPrice = _cursor.getDouble(_cursorIndexOfOriginalPrice);
            final String _tmpCategoryId;
            if (_cursor.isNull(_cursorIndexOfCategoryId)) {
              _tmpCategoryId = null;
            } else {
              _tmpCategoryId = _cursor.getString(_cursorIndexOfCategoryId);
            }
            final int _tmpStockQuantity;
            _tmpStockQuantity = _cursor.getInt(_cursorIndexOfStockQuantity);
            final String _tmpSku;
            if (_cursor.isNull(_cursorIndexOfSku)) {
              _tmpSku = null;
            } else {
              _tmpSku = _cursor.getString(_cursorIndexOfSku);
            }
            final String _tmpBrand;
            if (_cursor.isNull(_cursorIndexOfBrand)) {
              _tmpBrand = null;
            } else {
              _tmpBrand = _cursor.getString(_cursorIndexOfBrand);
            }
            final Double _tmpWeight;
            if (_cursor.isNull(_cursorIndexOfWeight)) {
              _tmpWeight = null;
            } else {
              _tmpWeight = _cursor.getDouble(_cursorIndexOfWeight);
            }
            final String _tmpDimensions;
            if (_cursor.isNull(_cursorIndexOfDimensions)) {
              _tmpDimensions = null;
            } else {
              _tmpDimensions = _cursor.getString(_cursorIndexOfDimensions);
            }
            final float _tmpRating;
            _tmpRating = _cursor.getFloat(_cursorIndexOfRating);
            final int _tmpReviewCount;
            _tmpReviewCount = _cursor.getInt(_cursorIndexOfReviewCount);
            final boolean _tmpIsFeatured;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFeatured);
            _tmpIsFeatured = _tmp != 0;
            final boolean _tmpIsOnSale;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfIsOnSale);
            _tmpIsOnSale = _tmp_1 != 0;
            final int _tmpDiscountPercentage;
            _tmpDiscountPercentage = _cursor.getInt(_cursorIndexOfDiscountPercentage);
            final boolean _tmpIsActive;
            final int _tmp_2;
            _tmp_2 = _cursor.getInt(_cursorIndexOfIsActive);
            _tmpIsActive = _tmp_2 != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            _item = new ProductEntity(_tmpProductId,_tmpName,_tmpDescription,_tmpPrice,_tmpOriginalPrice,_tmpCategoryId,_tmpStockQuantity,_tmpSku,_tmpBrand,_tmpWeight,_tmpDimensions,_tmpRating,_tmpReviewCount,_tmpIsFeatured,_tmpIsOnSale,_tmpDiscountPercentage,_tmpIsActive,_tmpCreatedAt,_tmpUpdatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Object getActiveProductCount(final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM products WHERE is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @Override
  public Object getProductCountByCategory(final String categoryId,
      final Continuation<? super Integer> $completion) {
    final String _sql = "SELECT COUNT(*) FROM products WHERE category_id = ? AND is_active = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (categoryId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, categoryId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @NonNull
      public Integer call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Integer _result;
          if (_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
