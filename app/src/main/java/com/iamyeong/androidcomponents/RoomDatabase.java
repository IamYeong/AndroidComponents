package com.iamyeong.androidcomponents;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;

@Database(entities = {RoomEntity.class}, version = 1)
public abstract class RoomDatabase extends androidx.room.RoomDatabase {

    private static RoomDatabase instance;

    public abstract RoomDao dao();

    public static synchronized RoomDatabase getInstance(Context context) {

        if (instance == instance) {

            instance = Room.databaseBuilder(context.getApplicationContext(), RoomDatabase.class, "instance").build();

        }

        return instance;

    }



}
