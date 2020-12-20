package com.example.myapplication.ui.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

/**
 * 操作 Sqlite数据工具类
 * 1.提供 onCreate()、onUpgrade()等创建更新数据库的方法
 * 2.提供获取数据库对象的函数
 * @author huangxr
 * @date 2020-12-16 23:14
 */
public class SqliteHelper extends SQLiteOpenHelper {

    /***
     * 构造函数
     * @param context   上下文对象
     * @param name       当前创建数据的名称
     * @param factory   游标工厂
     * @param version   当前创建数据的版本 >= 1
     */
    public SqliteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public SqliteHelper(Context context) {
        super(context, Constant.DATABASE_NAME, null,Constant.DATABASE_VERSION);
    }

    /**
     * 当数据库创建时回调的函数
     * @param db 数据库对象
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("tag","====================onCreate=============");
        String sql = "create table pserson (_id Integer primary key,name varchar(20),age Integer(20))";
        db.execSQL(sql);
    }

    /**
     * 当数据有版本更新时创建的函数
     * @param db            数据库读对象
     * @param oldVersion    数据库旧对象
     * @param newVersion    数据库新对象
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.i("tag","====================onUpgrade=============");
    }

    /**
     * 当数据库打开时回调的函数
     * @param db 数据库读对象
     */
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
}
