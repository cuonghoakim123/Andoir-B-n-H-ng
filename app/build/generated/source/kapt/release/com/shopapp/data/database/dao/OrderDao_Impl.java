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
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.shopapp.data.database.entity.OrderEntity;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
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
public final class OrderDao_Impl implements OrderDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OrderEntity> __insertionAdapterOfOrderEntity;

  private final EntityDeletionOrUpdateAdapter<OrderEntity> __deletionAdapterOfOrderEntity;

  private final EntityDeletionOrUpdateAdapter<OrderEntity> __updateAdapterOfOrderEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteOrderById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateOrderStatus;

  private final SharedSQLiteStatement __preparedStmtOfUpdatePaymentStatus;

  private final SharedSQLiteStatement __preparedStmtOfMarkOrderAsDelivered;

  public OrderDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOrderEntity = new EntityInsertionAdapter<OrderEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `orders` (`order_id`,`user_id`,`order_number`,`status`,`subtotal`,`shipping_fee`,`tax_amount`,`discount_amount`,`total_amount`,`payment_method`,`payment_status`,`customer_name`,`customer_phone`,`delivery_address`,`notes`,`created_at`,`updated_at`,`delivered_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderEntity entity) {
        if (entity.getOrderId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderId());
        }
        if (entity.getUserId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUserId());
        }
        if (entity.getOrderNumber() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOrderNumber());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStatus());
        }
        statement.bindDouble(5, entity.getSubtotal());
        statement.bindDouble(6, entity.getShippingFee());
        statement.bindDouble(7, entity.getTaxAmount());
        statement.bindDouble(8, entity.getDiscountAmount());
        statement.bindDouble(9, entity.getTotalAmount());
        if (entity.getPaymentMethod() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getPaymentMethod());
        }
        if (entity.getPaymentStatus() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getPaymentStatus());
        }
        if (entity.getCustomerName() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getCustomerName());
        }
        if (entity.getCustomerPhone() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getCustomerPhone());
        }
        if (entity.getDeliveryAddress() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getDeliveryAddress());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getNotes());
        }
        statement.bindLong(16, entity.getCreatedAt());
        statement.bindLong(17, entity.getUpdatedAt());
        if (entity.getDeliveredAt() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getDeliveredAt());
        }
      }
    };
    this.__deletionAdapterOfOrderEntity = new EntityDeletionOrUpdateAdapter<OrderEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `orders` WHERE `order_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderEntity entity) {
        if (entity.getOrderId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderId());
        }
      }
    };
    this.__updateAdapterOfOrderEntity = new EntityDeletionOrUpdateAdapter<OrderEntity>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `orders` SET `order_id` = ?,`user_id` = ?,`order_number` = ?,`status` = ?,`subtotal` = ?,`shipping_fee` = ?,`tax_amount` = ?,`discount_amount` = ?,`total_amount` = ?,`payment_method` = ?,`payment_status` = ?,`customer_name` = ?,`customer_phone` = ?,`delivery_address` = ?,`notes` = ?,`created_at` = ?,`updated_at` = ?,`delivered_at` = ? WHERE `order_id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final OrderEntity entity) {
        if (entity.getOrderId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindString(1, entity.getOrderId());
        }
        if (entity.getUserId() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getUserId());
        }
        if (entity.getOrderNumber() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getOrderNumber());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getStatus());
        }
        statement.bindDouble(5, entity.getSubtotal());
        statement.bindDouble(6, entity.getShippingFee());
        statement.bindDouble(7, entity.getTaxAmount());
        statement.bindDouble(8, entity.getDiscountAmount());
        statement.bindDouble(9, entity.getTotalAmount());
        if (entity.getPaymentMethod() == null) {
          statement.bindNull(10);
        } else {
          statement.bindString(10, entity.getPaymentMethod());
        }
        if (entity.getPaymentStatus() == null) {
          statement.bindNull(11);
        } else {
          statement.bindString(11, entity.getPaymentStatus());
        }
        if (entity.getCustomerName() == null) {
          statement.bindNull(12);
        } else {
          statement.bindString(12, entity.getCustomerName());
        }
        if (entity.getCustomerPhone() == null) {
          statement.bindNull(13);
        } else {
          statement.bindString(13, entity.getCustomerPhone());
        }
        if (entity.getDeliveryAddress() == null) {
          statement.bindNull(14);
        } else {
          statement.bindString(14, entity.getDeliveryAddress());
        }
        if (entity.getNotes() == null) {
          statement.bindNull(15);
        } else {
          statement.bindString(15, entity.getNotes());
        }
        statement.bindLong(16, entity.getCreatedAt());
        statement.bindLong(17, entity.getUpdatedAt());
        if (entity.getDeliveredAt() == null) {
          statement.bindNull(18);
        } else {
          statement.bindLong(18, entity.getDeliveredAt());
        }
        if (entity.getOrderId() == null) {
          statement.bindNull(19);
        } else {
          statement.bindString(19, entity.getOrderId());
        }
      }
    };
    this.__preparedStmtOfDeleteOrderById = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM orders WHERE order_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateOrderStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE orders SET status = ?, updated_at = ? WHERE order_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdatePaymentStatus = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE orders SET payment_status = ?, updated_at = ? WHERE order_id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkOrderAsDelivered = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "UPDATE orders SET status = ?, delivered_at = ?, updated_at = ? WHERE order_id = ?";
        return _query;
      }
    };
  }

  @Override
  public Object insertOrder(final OrderEntity order, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOrderEntity.insert(order);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOrder(final OrderEntity order, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfOrderEntity.handle(order);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object updateOrder(final OrderEntity order, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfOrderEntity.handle(order);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public Object deleteOrderById(final String orderId, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteOrderById.acquire();
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
          __preparedStmtOfDeleteOrderById.release(_stmt);
        }
      }
    }, arg1);
  }

  @Override
  public Object updateOrderStatus(final String orderId, final String status, final long updatedAt,
      final Continuation<? super Unit> arg3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateOrderStatus.acquire();
        int _argIndex = 1;
        if (status == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, status);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 3;
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
          __preparedStmtOfUpdateOrderStatus.release(_stmt);
        }
      }
    }, arg3);
  }

  @Override
  public Object updatePaymentStatus(final String orderId, final String paymentStatus,
      final long updatedAt, final Continuation<? super Unit> arg3) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdatePaymentStatus.acquire();
        int _argIndex = 1;
        if (paymentStatus == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, paymentStatus);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 3;
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
          __preparedStmtOfUpdatePaymentStatus.release(_stmt);
        }
      }
    }, arg3);
  }

  @Override
  public Object markOrderAsDelivered(final String orderId, final String status,
      final long deliveredAt, final long updatedAt, final Continuation<? super Unit> arg4) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfMarkOrderAsDelivered.acquire();
        int _argIndex = 1;
        if (status == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, status);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, deliveredAt);
        _argIndex = 3;
        _stmt.bindLong(_argIndex, updatedAt);
        _argIndex = 4;
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
          __preparedStmtOfMarkOrderAsDelivered.release(_stmt);
        }
      }
    }, arg4);
  }

  @Override
  public Object getOrderById(final String orderId, final Continuation<? super OrderEntity> arg1) {
    final String _sql = "SELECT * FROM orders WHERE order_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderId);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<OrderEntity>() {
      @Override
      @Nullable
      public OrderEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final OrderEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _result = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
  public Flow<List<OrderEntity>> getOrdersByUserId(final String userId) {
    final String _sql = "SELECT * FROM orders WHERE user_id = ? ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"orders"}, new Callable<List<OrderEntity>>() {
      @Override
      @NonNull
      public List<OrderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderEntity _item;
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _item = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
  public Flow<List<OrderEntity>> getOrdersByStatus(final String status) {
    final String _sql = "SELECT * FROM orders WHERE status = ? ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"orders"}, new Callable<List<OrderEntity>>() {
      @Override
      @NonNull
      public List<OrderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderEntity _item;
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _item = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
  public Flow<List<OrderEntity>> getOrdersByPaymentStatus(final String paymentStatus) {
    final String _sql = "SELECT * FROM orders WHERE payment_status = ? ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (paymentStatus == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, paymentStatus);
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"orders"}, new Callable<List<OrderEntity>>() {
      @Override
      @NonNull
      public List<OrderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderEntity _item;
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _item = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
  public Flow<List<OrderEntity>> getAllOrders() {
    final String _sql = "SELECT * FROM orders ORDER BY created_at DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"orders"}, new Callable<List<OrderEntity>>() {
      @Override
      @NonNull
      public List<OrderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderEntity _item;
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _item = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
  public Flow<List<OrderEntity>> getOrdersByUserAndStatuses(final String userId,
      final List<String> statuses) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM orders WHERE user_id = ");
    _stringBuilder.append("?");
    _stringBuilder.append(" AND status IN (");
    final int _inputSize = statuses.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(") ORDER BY created_at DESC");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 1 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
    }
    _argIndex = 2;
    for (String _item : statuses) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex++;
    }
    return CoroutinesRoom.createFlow(__db, false, new String[] {"orders"}, new Callable<List<OrderEntity>>() {
      @Override
      @NonNull
      public List<OrderEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final List<OrderEntity> _result = new ArrayList<OrderEntity>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final OrderEntity _item_1;
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _item_1 = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
            _result.add(_item_1);
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
  public Object getOrderCountByUser(final String userId, final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT COUNT(*) FROM orders WHERE user_id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
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
  public Object getOrderCountByStatus(final String status,
      final Continuation<? super Integer> arg1) {
    final String _sql = "SELECT COUNT(*) FROM orders WHERE status = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (status == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, status);
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
  public Object getTotalSpentByUser(final String userId, final Continuation<? super Double> arg1) {
    final String _sql = "SELECT SUM(total_amount) FROM orders WHERE user_id = ? AND payment_status = 'PAID'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userId);
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
  public Object getOrderByNumber(final String orderNumber,
      final Continuation<? super OrderEntity> arg1) {
    final String _sql = "SELECT * FROM orders WHERE order_number = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (orderNumber == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, orderNumber);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<OrderEntity>() {
      @Override
      @Nullable
      public OrderEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfOrderId = CursorUtil.getColumnIndexOrThrow(_cursor, "order_id");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
          final int _cursorIndexOfOrderNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "order_number");
          final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
          final int _cursorIndexOfSubtotal = CursorUtil.getColumnIndexOrThrow(_cursor, "subtotal");
          final int _cursorIndexOfShippingFee = CursorUtil.getColumnIndexOrThrow(_cursor, "shipping_fee");
          final int _cursorIndexOfTaxAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "tax_amount");
          final int _cursorIndexOfDiscountAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "discount_amount");
          final int _cursorIndexOfTotalAmount = CursorUtil.getColumnIndexOrThrow(_cursor, "total_amount");
          final int _cursorIndexOfPaymentMethod = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_method");
          final int _cursorIndexOfPaymentStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "payment_status");
          final int _cursorIndexOfCustomerName = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_name");
          final int _cursorIndexOfCustomerPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "customer_phone");
          final int _cursorIndexOfDeliveryAddress = CursorUtil.getColumnIndexOrThrow(_cursor, "delivery_address");
          final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "created_at");
          final int _cursorIndexOfUpdatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "updated_at");
          final int _cursorIndexOfDeliveredAt = CursorUtil.getColumnIndexOrThrow(_cursor, "delivered_at");
          final OrderEntity _result;
          if (_cursor.moveToFirst()) {
            final String _tmpOrderId;
            if (_cursor.isNull(_cursorIndexOfOrderId)) {
              _tmpOrderId = null;
            } else {
              _tmpOrderId = _cursor.getString(_cursorIndexOfOrderId);
            }
            final String _tmpUserId;
            if (_cursor.isNull(_cursorIndexOfUserId)) {
              _tmpUserId = null;
            } else {
              _tmpUserId = _cursor.getString(_cursorIndexOfUserId);
            }
            final String _tmpOrderNumber;
            if (_cursor.isNull(_cursorIndexOfOrderNumber)) {
              _tmpOrderNumber = null;
            } else {
              _tmpOrderNumber = _cursor.getString(_cursorIndexOfOrderNumber);
            }
            final String _tmpStatus;
            if (_cursor.isNull(_cursorIndexOfStatus)) {
              _tmpStatus = null;
            } else {
              _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
            }
            final double _tmpSubtotal;
            _tmpSubtotal = _cursor.getDouble(_cursorIndexOfSubtotal);
            final double _tmpShippingFee;
            _tmpShippingFee = _cursor.getDouble(_cursorIndexOfShippingFee);
            final double _tmpTaxAmount;
            _tmpTaxAmount = _cursor.getDouble(_cursorIndexOfTaxAmount);
            final double _tmpDiscountAmount;
            _tmpDiscountAmount = _cursor.getDouble(_cursorIndexOfDiscountAmount);
            final double _tmpTotalAmount;
            _tmpTotalAmount = _cursor.getDouble(_cursorIndexOfTotalAmount);
            final String _tmpPaymentMethod;
            if (_cursor.isNull(_cursorIndexOfPaymentMethod)) {
              _tmpPaymentMethod = null;
            } else {
              _tmpPaymentMethod = _cursor.getString(_cursorIndexOfPaymentMethod);
            }
            final String _tmpPaymentStatus;
            if (_cursor.isNull(_cursorIndexOfPaymentStatus)) {
              _tmpPaymentStatus = null;
            } else {
              _tmpPaymentStatus = _cursor.getString(_cursorIndexOfPaymentStatus);
            }
            final String _tmpCustomerName;
            if (_cursor.isNull(_cursorIndexOfCustomerName)) {
              _tmpCustomerName = null;
            } else {
              _tmpCustomerName = _cursor.getString(_cursorIndexOfCustomerName);
            }
            final String _tmpCustomerPhone;
            if (_cursor.isNull(_cursorIndexOfCustomerPhone)) {
              _tmpCustomerPhone = null;
            } else {
              _tmpCustomerPhone = _cursor.getString(_cursorIndexOfCustomerPhone);
            }
            final String _tmpDeliveryAddress;
            if (_cursor.isNull(_cursorIndexOfDeliveryAddress)) {
              _tmpDeliveryAddress = null;
            } else {
              _tmpDeliveryAddress = _cursor.getString(_cursorIndexOfDeliveryAddress);
            }
            final String _tmpNotes;
            if (_cursor.isNull(_cursorIndexOfNotes)) {
              _tmpNotes = null;
            } else {
              _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
            }
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            final long _tmpUpdatedAt;
            _tmpUpdatedAt = _cursor.getLong(_cursorIndexOfUpdatedAt);
            final Long _tmpDeliveredAt;
            if (_cursor.isNull(_cursorIndexOfDeliveredAt)) {
              _tmpDeliveredAt = null;
            } else {
              _tmpDeliveredAt = _cursor.getLong(_cursorIndexOfDeliveredAt);
            }
            _result = new OrderEntity(_tmpOrderId,_tmpUserId,_tmpOrderNumber,_tmpStatus,_tmpSubtotal,_tmpShippingFee,_tmpTaxAmount,_tmpDiscountAmount,_tmpTotalAmount,_tmpPaymentMethod,_tmpPaymentStatus,_tmpCustomerName,_tmpCustomerPhone,_tmpDeliveryAddress,_tmpNotes,_tmpCreatedAt,_tmpUpdatedAt,_tmpDeliveredAt);
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
