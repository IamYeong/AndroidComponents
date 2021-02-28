package com.iamyeong.androidcomponents;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private MediaPlayer mediaPlayer;

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");

        return null;

    }

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("Service onCreate");

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        new Thread() {

            @Override
            public void run() {
                mediaPlayer = MediaPlayer.create(MyService.this, R.raw.music);
                mediaPlayer.setLooping(true);
                mediaPlayer.start();


            }
        }.start();

        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        System.out.println("Service onDestroy");
        mediaPlayer.stop();
        super.onDestroy();

    }
}
