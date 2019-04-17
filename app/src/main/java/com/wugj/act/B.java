package com.wugj.act;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/4/11
 * </br>
 * version:
 */
public class B  extends AppCompatActivity {

    String tag = B.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Log.e(tag,"onCreate");

    }

    public void startC(View v){
        startActivity(new Intent(B.this,C.class));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(tag,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(tag,"onResume");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.e(tag,"onNewIntent");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(tag,"onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(tag,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(tag,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(tag,"onDestroy");
    }
}
