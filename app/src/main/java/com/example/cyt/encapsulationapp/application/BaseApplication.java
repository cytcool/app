package com.example.cyt.encapsulationapp.application;

import android.app.Application;

/**
 * Created by CYT on 2018/5/13.
 */

public class BaseApplication extends Application {

    private static BaseApplication mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static BaseApplication getInstance(){
        return mApplication;
    }
}
