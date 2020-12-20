package com.example.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.utils.DbManager;
import com.example.myapplication.ui.utils.SqliteHelper;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private SqliteHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helper = DbManager.getInstance(this);
    }


    /**
     * 点击按钮创建函数
     * @param view
     */
    public void createDb(View view){
//        getWritableDatabase() , getReadableDatabase() 创建或者打开数据库
//        如果数据库不存在则创建，如果数据库存在则直接打开数据库
//        默认情况下两个函数都表示打开或者创建可读可写的数据库对象，
//        如果磁盘已满或者是数据库本身权限下等情况，getReadableDatabase()打开的是只读数据库
        SQLiteDatabase db = helper.getWritableDatabase();
    }

}