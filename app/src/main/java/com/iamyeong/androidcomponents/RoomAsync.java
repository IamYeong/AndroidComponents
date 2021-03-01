package com.iamyeong.androidcomponents;

import android.os.AsyncTask;

import java.lang.ref.WeakReference;

public abstract class RoomAsync extends AsyncTask<String, String, String> {

    private WeakReference<ContentProviderImpl> weakReference;

    public abstract void doingAsync();

    public RoomAsync(ContentProviderImpl context) {
        weakReference = new WeakReference<>(context);
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {

        ContentProviderImpl contentActivity = weakReference.get();
        if (contentActivity == null || contentActivity.isFinishing()) {
            return;
        }



    }

    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected String doInBackground(String... strings) {

        doingAsync();

        return null;
    }
}
