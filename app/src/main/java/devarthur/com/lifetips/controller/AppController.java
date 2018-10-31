package devarthur.com.lifetips.controller;

import android.app.Application;

import com.android.volley.RequestQueue;

public class AppController  extends Application {

    public static final String TAG = AppController.class
            .getSimpleName();
    private static AppController mInstance;
    private RequestQueue mRequestQueue;

    public static synchronized AppController getmInstance() {return  mInstance; }


}
