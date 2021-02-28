package com.iamyeong.androidcomponents;

import android.os.AsyncTask;

public class ServiceAsync extends AsyncTask<Integer, Integer, Integer> {

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected Integer doInBackground(Integer... integers) {
        return null;
    }
}
