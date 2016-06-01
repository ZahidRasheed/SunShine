package com.example.android.sunshine.app;

import android.app.Application;
import android.content.Context;

import com.example.android.sunshine.app.internal.di.components.AppComponent;
import com.example.android.sunshine.app.internal.di.components.DaggerAppComponent;
import com.example.android.sunshine.app.internal.di.modules.AppModule;
import com.example.android.sunshine.app.internal.di.modules.DataModule;
import com.example.android.sunshine.app.internal.di.modules.NetModule;
import com.facebook.stetho.Stetho;

public class SunshineApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        Stetho.initializeWithDefaults(this);

        mAppComponent = DaggerAppComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(this))
                .dataModule(new DataModule())
                .netModule(new NetModule("http://api.openweathermap.org/data/2.5/forecast/"))
                .build();

        // If a Dagger 2 component does not have any constructor arguments for any of its modules,
        // then we can use .create() as a shortcut instead:
        //  mAppComponent = com.codepath.dagger.components.DaggerAppComponent.create();
    }

    public static AppComponent getComponent(Context context) {
        return ((SunshineApplication) context.getApplicationContext()).mAppComponent;
    }
}
