package com.example.android.sunshine.app;

import android.app.Application;

import com.facebook.stetho.Stetho;

public class SunshineApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Stetho.initializeWithDefaults(this);
    }
}
