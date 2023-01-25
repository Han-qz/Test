package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    private final String TAG = MainActivity4.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //在onCreate注册广播
        //动态使用java代码注册一个广播接收者
        CustomReceiver2 customReceiver2 = new CustomReceiver2();
        IntentFilter filter = new IntentFilter();
        filter.addAction(ActionUtils.ACTION_FLAG2);
        registerReceiver(customReceiver2, filter);
    }





    //静态发送广播给接收者
    public void sendAction2(View view) {
        Intent intent = new Intent();
        intent.setAction(ActionUtils.ACTION_FLAG);
        sendBroadcast(intent);
        Log.d(TAG, "广播已经发送");

    }

    //发送给动态注册的接收者
    public void sendAction1(View view) {
        Intent intent = new Intent();
        intent.setAction(ActionUtils.ACTION_FLAG2);
        sendBroadcast(intent);
        Log.d(TAG, "广播已经发送");
    }
}