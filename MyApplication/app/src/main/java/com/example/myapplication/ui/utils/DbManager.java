package com.example.myapplication.ui.utils;

import android.content.Context;

/**
 * 对数据操作的工具类
 * @author huangxr
 * @date 2020-12-17 21:32
 */
public class DbManager {

    private static SqliteHelper helper;

    public static SqliteHelper getInstance(Context context){
        if(null == helper){
            helper = new SqliteHelper(context);
        }
        return helper;
    }

}
