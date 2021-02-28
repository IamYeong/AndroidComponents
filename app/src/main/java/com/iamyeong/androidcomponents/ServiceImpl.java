package com.iamyeong.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ServiceImpl extends AppCompatActivity {

    private Intent intent;
    private Button btn_play, btn_stop;
    private ServiceAsync serviceAsync;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_impl);

        /*

        1. startService : play music to background native service
        2. stopService : stop service in background

         */


        intent = new Intent(this, MyService.class);

        btn_play = findViewById(R.id.btn_play);
        btn_stop = findViewById(R.id.btn_stop);

        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startService(intent);


            }
        });

        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                stopService(intent);

            }
        });

    }


}
