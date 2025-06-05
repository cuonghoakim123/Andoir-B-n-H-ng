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
import com.shopapp.data.database.entity.OrderItemEntity;
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
public final class OrderItemDao_Impl implements OrderItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OrderItemEntity> __insertionAdapterOfOrderItemEntity;

  private final EntityDeletionOrUpdateAdapter<OrderItemEntity> __deletionAdapterOfOrderItemEntity;

  private final EntityDeletionOrUpdateAdapter<OrderItemEntity> __updateAdapterOfOrderItemEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderItemById;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderItemsByOrderId;

  public OrderItemDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderItemEntity = new EntityInsertionAdapter<OrderItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `order_items` (`order_item_id`,`order_id`,`product_id`,`product_name`,`product_image_url`,`unit_price`,`quantity`,`total_price`,`created_at`) VALUES (?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderItemEntity entity) {
        if (entity.getOrderItemId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderItemId());
        }
        if (entity.getOrderId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getOrderId());
        }
        if (entity.getProductId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getProductId());
        }
        if (entity.getProductName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getProductName());
        }
        if (entity.getProductImageUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getProductImageUrl());
        }
        statement.bindDouble(6, entity.getUnitPrice());
        statement.bindLong(7, entity.getQuantity());
        statement.bindDouble(8, entity.getTotalPrice());
        statement.bindLong(9, entity.getCreatedAt());
      }
    };
    this.__deletionAdapterOfOrderItemEntity = new EntityDeletionOrUpdateAdapter<OrderItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `order_items` WHERE `order_item_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderItemEntity entity) {
        if (entity.getOrderItemId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderItemId());
        }
      }
    };
    this.__updateAdapterOfOrderItemEntity = new EntityDeletionOrUpdateAdapter<OrderItemEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `order_items` SET `order_item_id` = ?,`order_id` = ?,`product_id` = ?,`product_name` = ?,`product_image_url` = ?,`unit_price` = ?,`quantity` = ?,`total_price` = ?,`created_at` = ? WHERE `order_item_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderItemEntity entity) {
        if (entity.getOrderItemId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderItemId());
        }
        if (entity.getOrderId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getOrderId());
        }
        if (entity.getProductId() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getProductId());
        }
        if (entity.getProductName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getProductName());
        }
        if (entity.getProductImageUrl() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getProductImageUrl());
        }
        statement.bindDouble(6, entity.getUnitPrice());
        statement.bindLong(7, entity.getQuantity());
        statement.bindDouble(8, entity.getTotalPrice());
        statement.bindLong(9, entity.getCreatedAt());
        if (entity.getOrderItemId() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getOrderItemId());
        }
      }
    };
    this.__preparedStmtOfDeleteOrderItemById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM order_items WHERE order_item_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteOrderItemsByOrderId = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM order_items WHERE order_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertOrderItem(final OrderItemEntity orderItem,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrderItemEntity.insert(orderItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object insertOrderItems(final List<OrderItemEntity> orderItems,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrderItemEntity.insert(orderItems);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOrderItem(final OrderItemEntity orderItem,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOrderItemEntity.handle(orderItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object updateOrderItem(final OrderItemEntity orderItem,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfOrderItemEntity.handle(orderItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOrderItemById(final String orderItemId,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderItemById.acquire();
        int _argIndex = 1;
        if (orderItemId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, orderItemId);
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
          __preparedStmtOfDeleteOrderItemById.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOrderItemsByOrderId(final String orderId,
      final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderItemsByOrderId.acquire();
        int _argIndex = 1;
        if (orderId == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, orderId);
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
          __preparedStmtOfDeleteOrderItemsByOrderId.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public Object getOrderItemsByOrderId(final String orderId,
      final Continuation<? super List<OrderItemEntity>> arg1) {
    final String _sql = "SELECT * FROM order_items WHERE order_id = ? ORDER BY created_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OrderItemEntity>>() {
      @Override
      @NonNull
      public List<OrderItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_item_id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_url");
          final int _cursorIndexOfUnitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "unit_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<OrderItemEntity> _result = new ArrayList<OrderItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderItemEntity _item;
            final String _tmpOrderItemId;
            if (_cursor.isNull(_cursorIndexOfOrderItemId)) {
              _tmpOrderItemId = null;
            } else {
              _tmpOrderItemId = _cursor.getString(_cursorIndexOfOrderItemId);
            }
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final String _tmpProductImageUrl;
            if (_cursor.isNull(_cursorIndexOfProductImageUrl)) {
              _tmpProductImageUrl = null;
            } else {
              _tmpProductImageUrl = _cursor.getString(_cursorIndexOfProductImageUrl);
            }
            final double _tmpUnitPrice;
            _tmpUnitPrice = _cursor.getDouble(_cursorIndexOfUnitPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpTotalPrice;
            _tmpTotalPrice = _cursor.getDouble(_cursorIndexOfTotalPrice);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OrderItemEntity(_tmpOrderItemId,_tmpOrderId,_tmpProductId,_tmpProductName,_tmpProductImageUrl,_tmpUnitPrice,_tmpQuantity,_tmpTotalPrice,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Flow<List<OrderItemEntity>> getOrderItemsByOrderIdFlow(final String orderId) {
    final String _sql = "SELECT * FROM order_items WHERE order_id = ? ORDER BY created_at ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"order_items"}, new Callable<List<OrderItemEntity>>() {
      @Override
      @NonNull
      public List<OrderItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_item_id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_url");
          final int _cursorIndexOfUnitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "unit_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<OrderItemEntity> _result = new ArrayList<OrderItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderItemEntity _item;
            final String _tmpOrderItemId;
            if (_cursor.isNull(_cursorIndexOfOrderItemId)) {
              _tmpOrderItemId = null;
            } else {
              _tmpOrderItemId = _cursor.getString(_cursorIndexOfOrderItemId);
            }
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final String _tmpProductImageUrl;
            if (_cursor.isNull(_cursorIndexOfProductImageUrl)) {
              _tmpProductImageUrl = null;
            } else {
              _tmpProductImageUrl = _cursor.getString(_cursorIndexOfProductImageUrl);
            }
            final double _tmpUnitPrice;
            _tmpUnitPrice = _cursor.getDouble(_cursorIndexOfUnitPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpTotalPrice;
            _tmpTotalPrice = _cursor.getDouble(_cursorIndexOfTotalPrice);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OrderItemEntity(_tmpOrderItemId,_tmpOrderId,_tmpProductId,_tmpProductName,_tmpProductImageUrl,_tmpUnitPrice,_tmpQuantity,_tmpTotalPrice,_tmpCreatedAt);
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
  public Object getOrderItemById(final String orderItemId,
      final Continuation<? super OrderItemEntity> arg1) {
    final String _sql = "SELECT * FROM order_items WHERE order_item_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderItemId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderItemId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<OrderItemEntity>() {
      @Override
      @Nullable
      public OrderItemEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_item_id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_url");
          final int _cursorIndexOfUnitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "unit_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final OrderItemEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpOrderItemId;
            if (_cursor.isNull(_cursorIndexOfOrderItemId)) {
              _tmpOrderItemId = null;
            } else {
              _tmpOrderItemId = _cursor.getString(_cursorIndexOfOrderItemId);
            }
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final String _tmpProductImageUrl;
            if (_cursor.isNull(_cursorIndexOfProductImageUrl)) {
              _tmpProductImageUrl = null;
            } else {
              _tmpProductImageUrl = _cursor.getString(_cursorIndexOfProductImageUrl);
            }
            final double _tmpUnitPrice;
            _tmpUnitPrice = _cursor.getDouble(_cursorIndexOfUnitPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpTotalPrice;
            _tmpTotalPrice = _cursor.getDouble(_cursorIndexOfTotalPrice);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new OrderItemEntity(_tmpOrderItemId,_tmpOrderId,_tmpProductId,_tmpProductName,_tmpProductImageUrl,_tmpUnitPrice,_tmpQuantity,_tmpTotalPrice,_tmpCreatedAt);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Object getOrderItemsByProductId(final String productId,
      final Continuation<? super List<OrderItemEntity>> arg1) {
    final String _sql = "SELECT * FROM order_items WHERE product_id = ? ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OrderItemEntity>>() {
      @Override
      @NonNull
      public List<OrderItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_item_id");
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "product_id");
          final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "product_name");
          final int _cursorIndexOfProductImageUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "product_image_url");
          final int _cursorIndexOfUnitPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "unit_price");
          final int _cursorIndexOfQuantity = CursorUtil.getColumnIndexOrThrow(_cursor, "quantity");
          final int _cursorIndexOfTotalPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "total_price");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final List<OrderItemEntity> _result = new ArrayList<OrderItemEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderItemEntity _item;
            final String _tmpOrderItemId;
            if (_cursor.isNull(_cursorIndexOfOrderItemId)) {
              _tmpOrderItemId = null;
            } else {
              _tmpOrderItemId = _cursor.getString(_cursorIndexOfOrderItemId);
            }
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpProductId;
            if (_cursor.isNull(_cursorIndexOfProductId)) {
              _tmpProductId = null;
            } else {
              _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
            }
            final String _tmpProductName;
            if (_cursor.isNull(_cursorIndexOfProductName)) {
              _tmpProductName = null;
            } else {
              _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
            }
            final String _tmpProductImageUrl;
            if (_cursor.isNull(_cursorIndexOfProductImageUrl)) {
              _tmpProductImageUrl = null;
            } else {
              _tmpProductImageUrl = _cursor.getString(_cursorIndexOfProductImageUrl);
            }
            final double _tmpUnitPrice;
            _tmpUnitPrice = _cursor.getDouble(_cursorIndexOfUnitPrice);
            final int _tmpQuantity;
            _tmpQuantity = _cursor.getInt(_cursorIndexOfQuantity);
            final double _tmpTotalPrice;
            _tmpTotalPrice = _cursor.getDouble(_cursorIndexOfTotalPrice);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new OrderItemEntity(_tmpOrderItemId,_tmpOrderId,_tmpProductId,_tmpProductName,_tmpProductImageUrl,_tmpUnitPrice,_tmpQuantity,_tmpTotalPrice,_tmpCreatedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, arg1);
  }

  @Override
  public Object getOrderItemCount(final String orderId, final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT COUNT(*) FROM order_items WHERE order_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
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
    }, arg1);
  }

  @Override
  public Object getOrderItemsTotal(final String orderId, final Continuation<? super Double> arg1) {
    final String _sql = "SELECT SUM(total_price) FROM order_items WHERE order_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Double>() {
      @Override
      @Nullable
      public Double call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Double _result;
          if (_cursor.moveToFirst()) {
            final Double _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getDouble(0);
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
    }, arg1);
  }

  @Override
  public Object getOrderItemsTotalQuantity(final String orderId,
      final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT SUM(quantity) FROM order_items WHERE order_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @Nullable
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
    }, arg1);
  }

  @Override
  public Object getProductOrderCount(final String productId,
      final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT COUNT(*) FROM order_items WHERE product_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
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
    }, arg1);
  }

  @Override
  public Object getProductTotalSold(final String productId,
      final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT SUM(quantity) FROM order_items WHERE product_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (productId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, productId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Integer>() {
      @Override
      @Nullable
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
    }, arg1);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
