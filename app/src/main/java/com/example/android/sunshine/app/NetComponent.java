package com.example.android.sunshine.app;

import com.example.android.sunshine.app.data.sync.SunshineSyncAdapter;
import com.example.android.sunshine.app.detail.DetailFragment;
import com.example.android.sunshine.app.main.ForecastAdapter;
import com.example.android.sunshine.app.main.ForecastFragment;
import com.example.android.sunshine.app.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    void inject(MainActivity activity);

    void inject(SunshineSyncAdapter syncAdapter);

    void inject(ForecastFragment fragment);

    void inject(ForecastAdapter forecastAdapter);

    void inject(DetailFragment detailFragment);
}