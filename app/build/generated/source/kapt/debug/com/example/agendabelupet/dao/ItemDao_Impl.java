package com.example.agendabelupet.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.agendabelupet.models.entities.ItemEntity;
import java.lang.Class;
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
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ItemDao_Impl implements ItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ItemEntity> __insertionAdapterOfItemEntity;

  private final EntityDeletionOrUpdateAdapter<ItemEntity> __deletionAdapterOfItemEntity;

  private final EntityDeletionOrUpdateAdapter<ItemEntity> __updateAdapterOfItemEntity;

  private final SharedSQLiteStatement __preparedStmtOfUpdateItemById;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDateBiWeekly;

  private final SharedSQLiteStatement __preparedStmtOfUpdateDataQuinzenal;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllDb;

  private final SharedSQLiteStatement __preparedStmtOfUpdateToCollected;

  private final SharedSQLiteStatement __preparedStmtOfUpdateToNotCollected;

  private final SharedSQLiteStatement __preparedStmtOfDeleteItemById;

  public ItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfItemEntity = new EntityInsertionAdapter<ItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `ItemEntity` (`id`,`ownerName`,`name`,`race`,`weekDay`,`planType`,`value`,`phone`,`district`,`street`,`houseNumber`,`collected`,`dataQuinzenal`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getOwnerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwnerName());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getRace() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRace());
        }
        if (value.getWeekDay() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWeekDay());
        }
        if (value.getPlanType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPlanType());
        }
        stmt.bindLong(7, value.getValue());
        if (value.getPhone() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPhone());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDistrict());
        }
        if (value.getStreet() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStreet());
        }
        if (value.getHouseNumber() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getHouseNumber());
        }
        final int _tmp;
        _tmp = value.getCollected() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getDataQuinzenal() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDataQuinzenal());
        }
      }
    };
    this.__deletionAdapterOfItemEntity = new EntityDeletionOrUpdateAdapter<ItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ItemEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfItemEntity = new EntityDeletionOrUpdateAdapter<ItemEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `ItemEntity` SET `id` = ?,`ownerName` = ?,`name` = ?,`race` = ?,`weekDay` = ?,`planType` = ?,`value` = ?,`phone` = ?,`district` = ?,`street` = ?,`houseNumber` = ?,`collected` = ?,`dataQuinzenal` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ItemEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getOwnerName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getOwnerName());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getRace() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getRace());
        }
        if (value.getWeekDay() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getWeekDay());
        }
        if (value.getPlanType() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getPlanType());
        }
        stmt.bindLong(7, value.getValue());
        if (value.getPhone() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getPhone());
        }
        if (value.getDistrict() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDistrict());
        }
        if (value.getStreet() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getStreet());
        }
        if (value.getHouseNumber() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getHouseNumber());
        }
        final int _tmp;
        _tmp = value.getCollected() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        if (value.getDataQuinzenal() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getDataQuinzenal());
        }
        stmt.bindLong(14, value.getId());
      }
    };
    this.__preparedStmtOfUpdateItemById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ItemEntity  SET ownerName = ?, name = ?, race = ?,weekDay = ?,planType = ?, value = ?, phone = ?, district = ?, street = ?, houseNumber = ?, collected = ?, dataQuinzenal = ?  WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDateBiWeekly = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ItemEntity SET dataQuinzenal = ? WHERE Id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateDataQuinzenal = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ItemEntity SET dataQuinzenal = ? WHERE Id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteAllDb = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE  FROM ItemEntity";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateToCollected = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ItemEntity SET collected = 1 WHERE id =?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateToNotCollected = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ItemEntity SET collected = 0 WHERE id =?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteItemById = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ItemEntity WHERE id =?";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final ItemEntity item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfItemEntity.insert(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final ItemEntity item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfItemEntity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final ItemEntity item, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfItemEntity.handle(item);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateItemById(final int id, final String ownername, final String name,
      final String race, final String weekDay, final String planType, final String value,
      final String phone, final String district, final String street, final String houseNumber,
      final boolean collected, final String dataQuinzenal, final Continuation<? super Unit> p13) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateItemById.acquire();
        int _argIndex = 1;
        if (ownername == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, ownername);
        }
        _argIndex = 2;
        if (name == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, name);
        }
        _argIndex = 3;
        if (race == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, race);
        }
        _argIndex = 4;
        if (weekDay == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, weekDay);
        }
        _argIndex = 5;
        if (planType == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, planType);
        }
        _argIndex = 6;
        if (value == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, value);
        }
        _argIndex = 7;
        if (phone == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, phone);
        }
        _argIndex = 8;
        if (district == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, district);
        }
        _argIndex = 9;
        if (street == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, street);
        }
        _argIndex = 10;
        if (houseNumber == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, houseNumber);
        }
        _argIndex = 11;
        final int _tmp;
        _tmp = collected ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 12;
        if (dataQuinzenal == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, dataQuinzenal);
        }
        _argIndex = 13;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateItemById.release(_stmt);
        }
      }
    }, p13);
  }

  @Override
  public Object updateDateBiWeekly(final String newDate, final int id,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDateBiWeekly.acquire();
        int _argIndex = 1;
        if (newDate == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, newDate);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateDateBiWeekly.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object updateDataQuinzenal(final String dataQuinzenal, final int id,
      final Continuation<? super Unit> p2) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateDataQuinzenal.acquire();
        int _argIndex = 1;
        if (dataQuinzenal == null) {
          _stmt.bindNull(_argIndex);
        } else {
          _stmt.bindString(_argIndex, dataQuinzenal);
        }
        _argIndex = 2;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateDataQuinzenal.release(_stmt);
        }
      }
    }, p2);
  }

  @Override
  public Object deleteAllDb(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllDb.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllDb.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object updateToCollected(final int id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateToCollected.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateToCollected.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object updateToNotCollected(final int id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateToNotCollected.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfUpdateToNotCollected.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object deleteItemById(final int id, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteItemById.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteItemById.release(_stmt);
        }
      }
    }, p1);
  }

  @Override
  public Object getItemById(final int id, final Continuation<? super ItemEntity> p1) {
    final String _sql = "SELECT * FROM ItemEntity WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ItemEntity>() {
      @Override
      public ItemEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwnerName = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRace = CursorUtil.getColumnIndexOrThrow(_cursor, "race");
          final int _cursorIndexOfWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "weekDay");
          final int _cursorIndexOfPlanType = CursorUtil.getColumnIndexOrThrow(_cursor, "planType");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfHouseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "houseNumber");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "collected");
          final int _cursorIndexOfDataQuinzenal = CursorUtil.getColumnIndexOrThrow(_cursor, "dataQuinzenal");
          final ItemEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOwnerName;
            if (_cursor.isNull(_cursorIndexOfOwnerName)) {
              _tmpOwnerName = null;
            } else {
              _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpRace;
            if (_cursor.isNull(_cursorIndexOfRace)) {
              _tmpRace = null;
            } else {
              _tmpRace = _cursor.getString(_cursorIndexOfRace);
            }
            final String _tmpWeekDay;
            if (_cursor.isNull(_cursorIndexOfWeekDay)) {
              _tmpWeekDay = null;
            } else {
              _tmpWeekDay = _cursor.getString(_cursorIndexOfWeekDay);
            }
            final String _tmpPlanType;
            if (_cursor.isNull(_cursorIndexOfPlanType)) {
              _tmpPlanType = null;
            } else {
              _tmpPlanType = _cursor.getString(_cursorIndexOfPlanType);
            }
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDistrict;
            if (_cursor.isNull(_cursorIndexOfDistrict)) {
              _tmpDistrict = null;
            } else {
              _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpHouseNumber;
            if (_cursor.isNull(_cursorIndexOfHouseNumber)) {
              _tmpHouseNumber = null;
            } else {
              _tmpHouseNumber = _cursor.getString(_cursorIndexOfHouseNumber);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDataQuinzenal;
            if (_cursor.isNull(_cursorIndexOfDataQuinzenal)) {
              _tmpDataQuinzenal = null;
            } else {
              _tmpDataQuinzenal = _cursor.getString(_cursorIndexOfDataQuinzenal);
            }
            _result = new ItemEntity(_tmpId,_tmpOwnerName,_tmpName,_tmpRace,_tmpWeekDay,_tmpPlanType,_tmpValue,_tmpPhone,_tmpDistrict,_tmpStreet,_tmpHouseNumber,_tmpCollected,_tmpDataQuinzenal);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getItemsNotCollectedByWeekDay(final String weekDay,
      final Continuation<? super List<ItemEntity>> p1) {
    final String _sql = "SELECT * FROM ItemEntity WHERE weekDay = ? AND collected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (weekDay == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, weekDay);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemEntity>>() {
      @Override
      public List<ItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwnerName = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRace = CursorUtil.getColumnIndexOrThrow(_cursor, "race");
          final int _cursorIndexOfWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "weekDay");
          final int _cursorIndexOfPlanType = CursorUtil.getColumnIndexOrThrow(_cursor, "planType");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfHouseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "houseNumber");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "collected");
          final int _cursorIndexOfDataQuinzenal = CursorUtil.getColumnIndexOrThrow(_cursor, "dataQuinzenal");
          final List<ItemEntity> _result = new ArrayList<ItemEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOwnerName;
            if (_cursor.isNull(_cursorIndexOfOwnerName)) {
              _tmpOwnerName = null;
            } else {
              _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpRace;
            if (_cursor.isNull(_cursorIndexOfRace)) {
              _tmpRace = null;
            } else {
              _tmpRace = _cursor.getString(_cursorIndexOfRace);
            }
            final String _tmpWeekDay;
            if (_cursor.isNull(_cursorIndexOfWeekDay)) {
              _tmpWeekDay = null;
            } else {
              _tmpWeekDay = _cursor.getString(_cursorIndexOfWeekDay);
            }
            final String _tmpPlanType;
            if (_cursor.isNull(_cursorIndexOfPlanType)) {
              _tmpPlanType = null;
            } else {
              _tmpPlanType = _cursor.getString(_cursorIndexOfPlanType);
            }
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDistrict;
            if (_cursor.isNull(_cursorIndexOfDistrict)) {
              _tmpDistrict = null;
            } else {
              _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpHouseNumber;
            if (_cursor.isNull(_cursorIndexOfHouseNumber)) {
              _tmpHouseNumber = null;
            } else {
              _tmpHouseNumber = _cursor.getString(_cursorIndexOfHouseNumber);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDataQuinzenal;
            if (_cursor.isNull(_cursorIndexOfDataQuinzenal)) {
              _tmpDataQuinzenal = null;
            } else {
              _tmpDataQuinzenal = _cursor.getString(_cursorIndexOfDataQuinzenal);
            }
            _item = new ItemEntity(_tmpId,_tmpOwnerName,_tmpName,_tmpRace,_tmpWeekDay,_tmpPlanType,_tmpValue,_tmpPhone,_tmpDistrict,_tmpStreet,_tmpHouseNumber,_tmpCollected,_tmpDataQuinzenal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getAllItems(final Continuation<? super List<ItemEntity>> p0) {
    final String _sql = "SELECT * FROM ItemEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemEntity>>() {
      @Override
      public List<ItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwnerName = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRace = CursorUtil.getColumnIndexOrThrow(_cursor, "race");
          final int _cursorIndexOfWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "weekDay");
          final int _cursorIndexOfPlanType = CursorUtil.getColumnIndexOrThrow(_cursor, "planType");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfHouseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "houseNumber");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "collected");
          final int _cursorIndexOfDataQuinzenal = CursorUtil.getColumnIndexOrThrow(_cursor, "dataQuinzenal");
          final List<ItemEntity> _result = new ArrayList<ItemEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOwnerName;
            if (_cursor.isNull(_cursorIndexOfOwnerName)) {
              _tmpOwnerName = null;
            } else {
              _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpRace;
            if (_cursor.isNull(_cursorIndexOfRace)) {
              _tmpRace = null;
            } else {
              _tmpRace = _cursor.getString(_cursorIndexOfRace);
            }
            final String _tmpWeekDay;
            if (_cursor.isNull(_cursorIndexOfWeekDay)) {
              _tmpWeekDay = null;
            } else {
              _tmpWeekDay = _cursor.getString(_cursorIndexOfWeekDay);
            }
            final String _tmpPlanType;
            if (_cursor.isNull(_cursorIndexOfPlanType)) {
              _tmpPlanType = null;
            } else {
              _tmpPlanType = _cursor.getString(_cursorIndexOfPlanType);
            }
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDistrict;
            if (_cursor.isNull(_cursorIndexOfDistrict)) {
              _tmpDistrict = null;
            } else {
              _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpHouseNumber;
            if (_cursor.isNull(_cursorIndexOfHouseNumber)) {
              _tmpHouseNumber = null;
            } else {
              _tmpHouseNumber = _cursor.getString(_cursorIndexOfHouseNumber);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDataQuinzenal;
            if (_cursor.isNull(_cursorIndexOfDataQuinzenal)) {
              _tmpDataQuinzenal = null;
            } else {
              _tmpDataQuinzenal = _cursor.getString(_cursorIndexOfDataQuinzenal);
            }
            _item = new ItemEntity(_tmpId,_tmpOwnerName,_tmpName,_tmpRace,_tmpWeekDay,_tmpPlanType,_tmpValue,_tmpPhone,_tmpDistrict,_tmpStreet,_tmpHouseNumber,_tmpCollected,_tmpDataQuinzenal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getItemsNotCollected(final Continuation<? super List<ItemEntity>> p0) {
    final String _sql = "SELECT * FROM ItemEntity WHERE  collected = 0";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemEntity>>() {
      @Override
      public List<ItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwnerName = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRace = CursorUtil.getColumnIndexOrThrow(_cursor, "race");
          final int _cursorIndexOfWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "weekDay");
          final int _cursorIndexOfPlanType = CursorUtil.getColumnIndexOrThrow(_cursor, "planType");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfHouseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "houseNumber");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "collected");
          final int _cursorIndexOfDataQuinzenal = CursorUtil.getColumnIndexOrThrow(_cursor, "dataQuinzenal");
          final List<ItemEntity> _result = new ArrayList<ItemEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOwnerName;
            if (_cursor.isNull(_cursorIndexOfOwnerName)) {
              _tmpOwnerName = null;
            } else {
              _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpRace;
            if (_cursor.isNull(_cursorIndexOfRace)) {
              _tmpRace = null;
            } else {
              _tmpRace = _cursor.getString(_cursorIndexOfRace);
            }
            final String _tmpWeekDay;
            if (_cursor.isNull(_cursorIndexOfWeekDay)) {
              _tmpWeekDay = null;
            } else {
              _tmpWeekDay = _cursor.getString(_cursorIndexOfWeekDay);
            }
            final String _tmpPlanType;
            if (_cursor.isNull(_cursorIndexOfPlanType)) {
              _tmpPlanType = null;
            } else {
              _tmpPlanType = _cursor.getString(_cursorIndexOfPlanType);
            }
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDistrict;
            if (_cursor.isNull(_cursorIndexOfDistrict)) {
              _tmpDistrict = null;
            } else {
              _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpHouseNumber;
            if (_cursor.isNull(_cursorIndexOfHouseNumber)) {
              _tmpHouseNumber = null;
            } else {
              _tmpHouseNumber = _cursor.getString(_cursorIndexOfHouseNumber);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDataQuinzenal;
            if (_cursor.isNull(_cursorIndexOfDataQuinzenal)) {
              _tmpDataQuinzenal = null;
            } else {
              _tmpDataQuinzenal = _cursor.getString(_cursorIndexOfDataQuinzenal);
            }
            _item = new ItemEntity(_tmpId,_tmpOwnerName,_tmpName,_tmpRace,_tmpWeekDay,_tmpPlanType,_tmpValue,_tmpPhone,_tmpDistrict,_tmpStreet,_tmpHouseNumber,_tmpCollected,_tmpDataQuinzenal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getItemsCollected(final Continuation<? super List<ItemEntity>> p0) {
    final String _sql = "SELECT * FROM ItemEntity WHERE  collected = 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ItemEntity>>() {
      @Override
      public List<ItemEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfOwnerName = CursorUtil.getColumnIndexOrThrow(_cursor, "ownerName");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfRace = CursorUtil.getColumnIndexOrThrow(_cursor, "race");
          final int _cursorIndexOfWeekDay = CursorUtil.getColumnIndexOrThrow(_cursor, "weekDay");
          final int _cursorIndexOfPlanType = CursorUtil.getColumnIndexOrThrow(_cursor, "planType");
          final int _cursorIndexOfValue = CursorUtil.getColumnIndexOrThrow(_cursor, "value");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfDistrict = CursorUtil.getColumnIndexOrThrow(_cursor, "district");
          final int _cursorIndexOfStreet = CursorUtil.getColumnIndexOrThrow(_cursor, "street");
          final int _cursorIndexOfHouseNumber = CursorUtil.getColumnIndexOrThrow(_cursor, "houseNumber");
          final int _cursorIndexOfCollected = CursorUtil.getColumnIndexOrThrow(_cursor, "collected");
          final int _cursorIndexOfDataQuinzenal = CursorUtil.getColumnIndexOrThrow(_cursor, "dataQuinzenal");
          final List<ItemEntity> _result = new ArrayList<ItemEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ItemEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpOwnerName;
            if (_cursor.isNull(_cursorIndexOfOwnerName)) {
              _tmpOwnerName = null;
            } else {
              _tmpOwnerName = _cursor.getString(_cursorIndexOfOwnerName);
            }
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpRace;
            if (_cursor.isNull(_cursorIndexOfRace)) {
              _tmpRace = null;
            } else {
              _tmpRace = _cursor.getString(_cursorIndexOfRace);
            }
            final String _tmpWeekDay;
            if (_cursor.isNull(_cursorIndexOfWeekDay)) {
              _tmpWeekDay = null;
            } else {
              _tmpWeekDay = _cursor.getString(_cursorIndexOfWeekDay);
            }
            final String _tmpPlanType;
            if (_cursor.isNull(_cursorIndexOfPlanType)) {
              _tmpPlanType = null;
            } else {
              _tmpPlanType = _cursor.getString(_cursorIndexOfPlanType);
            }
            final int _tmpValue;
            _tmpValue = _cursor.getInt(_cursorIndexOfValue);
            final String _tmpPhone;
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _tmpPhone = null;
            } else {
              _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            }
            final String _tmpDistrict;
            if (_cursor.isNull(_cursorIndexOfDistrict)) {
              _tmpDistrict = null;
            } else {
              _tmpDistrict = _cursor.getString(_cursorIndexOfDistrict);
            }
            final String _tmpStreet;
            if (_cursor.isNull(_cursorIndexOfStreet)) {
              _tmpStreet = null;
            } else {
              _tmpStreet = _cursor.getString(_cursorIndexOfStreet);
            }
            final String _tmpHouseNumber;
            if (_cursor.isNull(_cursorIndexOfHouseNumber)) {
              _tmpHouseNumber = null;
            } else {
              _tmpHouseNumber = _cursor.getString(_cursorIndexOfHouseNumber);
            }
            final boolean _tmpCollected;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfCollected);
            _tmpCollected = _tmp != 0;
            final String _tmpDataQuinzenal;
            if (_cursor.isNull(_cursorIndexOfDataQuinzenal)) {
              _tmpDataQuinzenal = null;
            } else {
              _tmpDataQuinzenal = _cursor.getString(_cursorIndexOfDataQuinzenal);
            }
            _item = new ItemEntity(_tmpId,_tmpOwnerName,_tmpName,_tmpRace,_tmpWeekDay,_tmpPlanType,_tmpValue,_tmpPhone,_tmpDistrict,_tmpStreet,_tmpHouseNumber,_tmpCollected,_tmpDataQuinzenal);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getValues(final Continuation<? super List<Integer>> p0) {
    final String _sql = "SELECT value FROM ItemEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Integer>>() {
      @Override
      public List<Integer> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<Integer> _result = new ArrayList<Integer>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Integer _item;
            if (_cursor.isNull(0)) {
              _item = null;
            } else {
              _item = _cursor.getInt(0);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
