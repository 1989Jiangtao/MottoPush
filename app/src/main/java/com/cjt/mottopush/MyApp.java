package com.cjt.mottopush;

import android.app.Application;


import cn.jpush.android.api.JPushInterface;

/**
 * Created by CaoJiangtao on 2017/1/4.
 */

public class MyApp extends Application {

    private static MyApp mInstance;


    /****Application的单例模式***/
    public  static  MyApp getInstance(){
        return  mInstance ;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this ;
        JPushInterface.setDebugMode(true); // 极光推送允许调试模式
        JPushInterface.init(this); // 极光推送初始化
    }

}
