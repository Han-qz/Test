package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    //启动服务
    public void startService(View view) {
        startService(new Intent(this,MyService.class));
    }

    //停止服务
    public void stopService(View view) {
        stopService(new Intent(this,MyService.class));
    }

    //绑定
    public void bindService(View view) {
        bindService(new Intent(this, MyService.class), connection, Context.BIND_AUTO_CREATE);
    }

    //解绑
    public void unbindService(View view) {
        unbindService(connection);
    }
    

    //Activity 与MyService之间的桥梁
    private ServiceConnection connection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    //一般写法：当此activity被销毁的时候，自动解绑服务
//    @Override
//    protected void onDestroy(){
//        super.onDestroy();
//        unbindService(connection);
//    }
}