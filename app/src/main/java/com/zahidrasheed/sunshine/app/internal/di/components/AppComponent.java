package com.zahidrasheed.sunshine.app.internal.di.components;

import android.content.SharedPreferences;

import com.zahidrasheed.sunshine.app.internal.di.modules.DataModule;
import com.zahidrasheed.sunshine.app.data.api.AppApiService;
import com.zahidrasheed.sunshine.app.internal.di.modules.NetModule;
import com.zahidrasheed.sunshine.app.data.sync.SunshineSyncAdapter;
import com.zahidrasheed.sunshine.app.internal.di.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, DataModule.class, NetModule.class})
public interface AppComponent {

    void inject(SunshineSyncAdapter syncAdapter);

    AppApiService appApiService();

    SharedPreferences sharedPreferences();
}