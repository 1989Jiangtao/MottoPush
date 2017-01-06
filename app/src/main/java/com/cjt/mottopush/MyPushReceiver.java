package com.cjt.mottopush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by CaoJiangtao on 2017/1/4.
 */

public class MyPushReceiver extends BroadcastReceiver {

    public static String PUSH_IMAGE_PATH_KEY = "pushImagePath" ;

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle bundle = intent.getExtras();
        String fileStr = bundle.getString(JPushInterface.EXTRA_RICHPUSH_HTML_RES);
        if(fileStr != null){
            String[] fileNames = fileStr.split(",");
            for (int i = 0; i < fileNames.length; i++) {
                Log.e("TAG","fileNames---"+fileNames[i]);
            }

            Intent main = new Intent(context,DialogActivity.class) ;
            main.putExtra(PUSH_IMAGE_PATH_KEY,fileNames[0]);
            main.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(main);
        }

    }
}
