package com.example.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class CustomReceiver2 extends BroadcastReceiver {

    private static final String TAG = CustomReceiver2.class.getSimpleName();
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.e(TAG, "CustomReceiver onReceive 广播接收者");

    }
}
