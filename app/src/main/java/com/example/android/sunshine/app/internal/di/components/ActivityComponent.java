package com.example.android.sunshine.app.internal.di.components;

import com.example.android.sunshine.app.internal.di.modules.ActivityModule;
import com.example.android.sunshine.app.internal.ActivityScope;
import com.example.android.sunshine.app.ui.detail.DetailFragment;
import com.example.android.sunshine.app.ui.adapters.ForecastAdapter;
import com.example.android.sunshine.app.ui.main.ForecastFragment;
import com.example.android.sunshine.app.ui.main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(
        dependencies = AppComponent.class,
        modules = {
                ActivityModule.class
        }
)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(ForecastFragment fragment);

    void inject(ForecastAdapter forecastAdapter);

    void inject(DetailFragment detailFragment);
}
