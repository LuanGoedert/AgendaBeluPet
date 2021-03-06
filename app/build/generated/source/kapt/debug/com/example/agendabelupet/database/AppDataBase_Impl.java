package com.example.agendabelupet.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.agendabelupet.dao.ItemDao;
import com.example.agendabelupet.dao.ItemDao_Impl;
import com.example.agendabelupet.dao.UserDao;
import com.example.agendabelupet.dao.UserDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile UserDao _userDao;

  private volatile ItemDao _itemDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ItemEntity` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `ownerName` TEXT NOT NULL, `name` TEXT NOT NULL, `race` TEXT NOT NULL, `weekDay` TEXT NOT NULL, `planType` TEXT NOT NULL, `value` INTEGER NOT NULL, `phone` TEXT NOT NULL, `district` TEXT NOT NULL, `street` TEXT NOT NULL, `houseNumber` TEXT NOT NULL, `collected` INTEGER NOT NULL, `dataQuinzenal` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserEntity` (`userId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userName` TEXT NOT NULL, `userEmail` TEXT NOT NULL, `userPhotoUri` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7a1a2b4424572a715a56bf1b790eee32')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `ItemEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `UserEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsItemEntity = new HashMap<String, TableInfo.Column>(13);
        _columnsItemEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("ownerName", new TableInfo.Column("ownerName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("race", new TableInfo.Column("race", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("weekDay", new TableInfo.Column("weekDay", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("planType", new TableInfo.Column("planType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("value", new TableInfo.Column("value", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("phone", new TableInfo.Column("phone", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("district", new TableInfo.Column("district", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("street", new TableInfo.Column("street", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("houseNumber", new TableInfo.Column("houseNumber", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("collected", new TableInfo.Column("collected", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsItemEntity.put("dataQuinzenal", new TableInfo.Column("dataQuinzenal", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysItemEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesItemEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoItemEntity = new TableInfo("ItemEntity", _columnsItemEntity, _foreignKeysItemEntity, _indicesItemEntity);
        final TableInfo _existingItemEntity = TableInfo.read(_db, "ItemEntity");
        if (! _infoItemEntity.equals(_existingItemEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "ItemEntity(com.example.agendabelupet.models.entities.ItemEntity).\n"
                  + " Expected:\n" + _infoItemEntity + "\n"
                  + " Found:\n" + _existingItemEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsUserEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsUserEntity.put("userId", new TableInfo.Column("userId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("userEmail", new TableInfo.Column("userEmail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("userPhotoUri", new TableInfo.Column("userPhotoUri", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserEntity = new TableInfo("UserEntity", _columnsUserEntity, _foreignKeysUserEntity, _indicesUserEntity);
        final TableInfo _existingUserEntity = TableInfo.read(_db, "UserEntity");
        if (! _infoUserEntity.equals(_existingUserEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "UserEntity(com.example.agendabelupet.models.entities.UserEntity).\n"
                  + " Expected:\n" + _infoUserEntity + "\n"
                  + " Found:\n" + _existingUserEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "7a1a2b4424572a715a56bf1b790eee32", "ee14e473c9e205d542f4e95930cb3fef");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "ItemEntity","UserEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `ItemEntity`");
      _db.execSQL("DELETE FROM `UserEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ItemDao.class, ItemDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
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
  public ItemDao itemDao() {
    if (_itemDao != null) {
      return _itemDao;
    } else {
      synchronized(this) {
        if(_itemDao == null) {
          _itemDao = new ItemDao_Impl(this);
        }
        return _itemDao;
      }
    }
  }
}
