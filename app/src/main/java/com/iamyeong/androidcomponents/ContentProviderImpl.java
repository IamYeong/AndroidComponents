package com.iamyeong.androidcomponents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ContentProviderImpl extends AppCompatActivity {

    private EditText edit;
    private TextView tv;
    private Button btn;
    private RoomDatabase db;
    private RoomAsync async;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_provider_impl);

        edit = findViewById(R.id.et_content);
        tv = findViewById(R.id.tv_content);
        btn = findViewById(R.id.btn_content);

        initialData();




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db.dao().insert(new RoomEntity(edit.getText().toString()));

                tv.setText(notificationData(db));

            }
        });

    }

    private String notificationData(RoomDatabase db) {

        if (db.dao().getAll().toString() == null) {
            db.dao().insert(new RoomEntity("EMPTY"));
        }

        return db.dao().getAll().toString();

    }

    private void initialData() {

        db = RoomDatabase.getInstance(ContentProviderImpl.this);

    }

    private void insertData() {

        async = new RoomAsync(this) {
            @Override
            public void doingAsync() {
                db.dao().insert(new RoomEntity("A"));
            }
        };

        async.execute();


    }

    private void selectAllData() {

    }





}
