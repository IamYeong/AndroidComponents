package com.iamyeong.androidcomponents;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface RoomDao {

    @Query("SELECT * FROM entities")
    List<RoomEntity> getAll();

    @Insert
    void insert(RoomEntity entity);

    @Update
    void update(RoomEntity entity);

    @Delete
    void delete(RoomEntity entity);

}
