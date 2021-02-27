package com.iamyeong.androidcomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    //@SuppressWarnings("FieldCanBeLocal")
    private Button btn_broadcast, btn_service, btn_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_broadcast = findViewById(R.id.btn_broadcast);
        btn_service = findViewById(R.id.btn_service);
        btn_content = findViewById(R.id.btn_contentprovider);


        btn_broadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BroadcastImpl.class);
                startActivity(intent);

            }
        });

        btn_content.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ContentProviderImpl.class);
                startActivity(intent);
            }
        });

        btn_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ServiceImpl.class);
                startActivity(intent);
            }
        });


    }


}
