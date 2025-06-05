package com.shopapp.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomDatabaseKt;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopapp.data.database.entity.ProductImageEntity;
import java.lang.Class;
import java.lang.Exception;
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
public final class ProductImageDao_Impl implements ProductImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ProductImageEntity> __insertionAdapterOfProductImageEntity;

  private final EntityDeletionOrUpdateAdapter<ProductImageEntity> __deletionAdapterOfProductImageEntity;

  private final EntityDeletionOrUpdateAdapter<ProductImageEntity> __updateAdapterOfProductImageEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteImageById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteImagesByProductId;

  private final SharedSQLiteStatement __preparedStmtOfClearPrimaryImages;

  private final SharedSQLiteStatement __preparedStmtOfSetPrimaryImage;

  public ProductImageDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfProductImageEntity = new EntityInsertionAdapter<ProductImageEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `product_images` (`image_id`,`product_id`,`image_url`,`alt_text`,`sort_order`,`is_primary`,`created_at`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductImageEntity entity) {
        if (entity.getImageId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getImageId());
        }
        if (entity.getProductId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductId());
        }
        if (entity.getImageUrl() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImageUrl());
        }
        if (entity.getAltText() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAltText());
        }
        statement.bindLong(5, entity.getSortOrder());
        final int _tmp = entity.isPrimary() ? 1 : 0;
        statement.bindLong(6, _tmp);
        statement.bindLong(7, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfProductImageEntity = new EntityDeletionOrUpdateAdapter<ProductImageEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `product_images` WHERE `image_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductImageEntity entity) {
        if (entity.getImageId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getImageId());
        }
      }
    };
    this.__updateAdapterOfProductImageEntity = new EntityDeletionOrUpdateAdapter<ProductImageEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `product_images` SET `image_id` = ?,`product_id` = ?,`image_url` = ?,`alt_text` = ?,`sort_order` = ?,`is_primary` = ?,`created_at` = ? WHERE `image_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final ProductImageEntity entity) {
        if (entity.getImageId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getImageId());
        }
        if (entity.getProductId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getProductId());
        }
        if (entity.getImageUrl() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getImageUrl());
        }
        if (entity.getAltText() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getAltText());
        }
        statement.bindLong(5, entity.getSortOrder());
        final int _tmp = entity.isPrimary() ? 1 : 0;
        statement.bindLong(6, _tmp);
        statement.bindLong(7, entity.getCreatedAt());
        if (entity.getImageId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindString(8, entity.getImageId());
        }
      }
    };
    this.__preparedStmtOfDeleteImageById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM product_images WHERE image_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteImagesByProductId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM product_images WHERE product_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfClearPrimaryImages = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE product_images SET is_primary = 0 WHERE product_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfSetPrimaryImage = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE product_images SET is_primary = 1 WHERE image_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertImage(final ProductImageEntity image,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductImageEntity.insert(image);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object insertImages(final List<ProductImageEntity> images,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfProductImageEntity.insert(images);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteImage(final ProductImageEntity image,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfProductImageEntity.handle(image);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updateImage(final ProductImageEntity image,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfProductImageEntity.handle(image);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object updatePrimaryImage(final String productId, final String imageId,
      final Continuation<? super Unit> $completion) {
    return RoomDatabaseKt.withTransaction(__db, (__cont) -> ProductImageDao.DefaultImpls.updatePrimaryImage(ProductImageDao_Impl.this, productId, imageId, __cont), $completion);
  }

  @Override
  public Object deleteImageById(final String imageId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteImageById.acquire();
        int _argIndex = 1;
        if (imageId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, imageId);
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
          __preparedStmtOfDeleteImageById.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteImagesByProductId(final String productId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteImagesByProductId.acquire();
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
          __preparedStmtOfDeleteImagesByProductId.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object clearPrimaryImages(final String productId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearPrimaryImages.acquire();
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
          __preparedStmtOfClearPrimaryImages.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object setPrimaryImage(final String imageId,
      final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfSetPrimaryImage.acquire();
        int _argIndex = 1;
        if (imageId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, imageId);
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
          __preparedStmtOfSetPrimaryImage.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object getImagesByProductId(final String productId,
      final Continuation<? super List<ProductImageEntity>> $completion) {
    final String _sql = "SELECT * FROM product_images WHERE product_id = ? ORDER BY sort_order ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ProductImageEntity>>() {
      @Override
      @NonNull
      public List<ProductImageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImageId = CursorUtil.getColumnIndexOrThrow(_cursor, "image_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfAltText = CursorUtil.getColumnIndexOrThrow(_cursor, "alt_text");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sort_order");
          final int _cursorIndexOfIsPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "is_primary");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<ProductImageEntity> _result = new ArrayList<ProductImageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductImageEntity _item;
            final String _tmpImageId;
            if (_cursor.isNull(_cursorIndexOfImageId)) {
              _tmpImageId = null;
            } else {
              _tmpImageId = _cursor.getString(_cursorIndexOfImageId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpAltText;
            if (_cursor.isNull(_cursorIndexOfAltText)) {
              _tmpAltText = null;
            } else {
              _tmpAltText = _cursor.getString(_cursorIndexOfAltText);
            }
            final int _tmpSortOrder;
            _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
            final boolean _tmpIsPrimary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPrimary);
            _tmpIsPrimary = _tmp != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ProductImageEntity(_tmpImageId,_tmpProductId,_tmpImageUrl,_tmpAltText,_tmpSortOrder,_tmpIsPrimary,_tmpCreatedAt);
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
  public Flow<List<ProductImageEntity>> getImagesByProductIdFlow(final String productId) {
    final String _sql = "SELECT * FROM product_images WHERE product_id = ? ORDER BY sort_order ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"product_images"}, new Callable<List<ProductImageEntity>>() {
      @Override
      @NonNull
      public List<ProductImageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImageId = CursorUtil.getColumnIndexOrThrow(_cursor, "image_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfAltText = CursorUtil.getColumnIndexOrThrow(_cursor, "alt_text");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sort_order");
          final int _cursorIndexOfIsPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "is_primary");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<ProductImageEntity> _result = new ArrayList<ProductImageEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final ProductImageEntity _item;
            final String _tmpImageId;
            if (_cursor.isNull(_cursorIndexOfImageId)) {
              _tmpImageId = null;
            } else {
              _tmpImageId = _cursor.getString(_cursorIndexOfImageId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpAltText;
            if (_cursor.isNull(_cursorIndexOfAltText)) {
              _tmpAltText = null;
            } else {
              _tmpAltText = _cursor.getString(_cursorIndexOfAltText);
            }
            final int _tmpSortOrder;
            _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
            final boolean _tmpIsPrimary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPrimary);
            _tmpIsPrimary = _tmp != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new ProductImageEntity(_tmpImageId,_tmpProductId,_tmpImageUrl,_tmpAltText,_tmpSortOrder,_tmpIsPrimary,_tmpCreatedAt);
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
  public Object getPrimaryImageByProductId(final String productId,
      final Continuation<? super ProductImageEntity> $completion) {
    final String _sql = "SELECT * FROM product_images WHERE product_id = ? AND is_primary = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ProductImageEntity>() {
      @Override
      @Nullable
      public ProductImageEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfImageId = CursorUtil.getColumnIndexOrThrow(_cursor, "image_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "image_url");
          final int _cursorIndexOfAltText = CursorUtil.getColumnIndexOrThrow(_cursor, "alt_text");
          final int _cursorIndexOfSortOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "sort_order");
          final int _cursorIndexOfIsPrimary = CursorUtil.getColumnIndexOrThrow(_cursor, "is_primary");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final ProductImageEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpImageId;
            if (_cursor.isNull(_cursorIndexOfImageId)) {
              _tmpImageId = null;
            } else {
              _tmpImageId = _cursor.getString(_cursorIndexOfImageId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpImageUrl;
            if (_cursor.isNull(_cursorIndexOfImageUrl)) {
              _tmpImageUrl = null;
            } else {
              _tmpImageUrl = _cursor.getString(_cursorIndexOfImageUrl);
            }
            final String _tmpAltText;
            if (_cursor.isNull(_cursorIndexOfAltText)) {
              _tmpAltText = null;
            } else {
              _tmpAltText = _cursor.getString(_cursorIndexOfAltText);
            }
            final int _tmpSortOrder;
            _tmpSortOrder = _cursor.getInt(_cursorIndexOfSortOrder);
            final boolean _tmpIsPrimary;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsPrimary);
            _tmpIsPrimary = _tmp != 0;
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new ProductImageEntity(_tmpImageId,_tmpProductId,_tmpImageUrl,_tmpAltText,_tmpSortOrder,_tmpIsPrimary,_tmpCreatedAt);
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
  public Object getPrimaryImageUrlByProductId(final String productId,
      final Continuation<? super String> $completion) {
    final String _sql = "SELECT image_url FROM product_images WHERE product_id = ? AND is_primary = 1 LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<String>() {
      @Override
      @Nullable
      public String call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final String _result;
          if (_cursor.moveToFirst()) {
            if (_cursor.isNull(0)) {
              _result = null;
            } else {
              _result = _cursor.getString(0);
            }
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
