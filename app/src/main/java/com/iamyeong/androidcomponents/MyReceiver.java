package com.iamyeong.androidcomponents;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        System.out.println("onReceive ");

        String action = intent.getAction();
        Toast.makeText(context, "ACTION =>" + action, Toast.LENGTH_SHORT).show();

    }
}
