package com.iamyeong.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class BroadcastImpl extends AppCompatActivity {

    private MyReceiver broadcastReceiver;
    private IntentFilter intentFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_impl);

        /*
        1. onResume in Activity lifecycle.
        2. registered action to broadcast receiver.
        3. start action
        4. event receive.
        5. broadcasting.
         */


    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(broadcastReceiver);

    }

    @Override
    protected void onResume() {
        super.onResume();

        broadcastReceiver = new MyReceiver();
        intentFilter = new IntentFilter();

        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        //IntentFilter(String action) and intentFilter.addAction(String action) is same behavior.

        this.registerReceiver(broadcastReceiver, intentFilter);

    }
}
