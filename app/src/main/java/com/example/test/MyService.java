package com.example.test;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class MyService extends Service {

    private final String TAG = MyService.class.getSimpleName();


    @Override
    public void onCreate(){
        super.onCreate();
        Log.d(TAG, "onCrete()...");  //创建
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        Log.d(TAG, "onStartCommand()...");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,  "onDestroy()...");  //注销
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG,  "onBind()...");  //绑定
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.d(TAG,  "onUnbind()...");  //解绑
        return super.onUnbind(intent);
    }




}
