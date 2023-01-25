package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

//默认的activity，必须继承系统提供的AppCompatActivity才是一个activity，否则就是一个普通的类
public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, TAG + "---->onCrate()");  //创建
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, TAG + "---->onStart()");  //启动
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, TAG + "---->onRestart()");  //重新启动
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, TAG + "---->onResume()");  //准备和用户交互
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, TAG + "---->onPause()");  //暂停
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, TAG + "---->onStop()");  //停止
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, TAG + "---->onDestroy()");  //销毁
    }

    //创立点击事件，跳转到第二个activiy
    public void startActivity2(View view) {
        startActivity(new Intent(this, MainActivity2.class));
    }
}