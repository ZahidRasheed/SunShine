package com.zahidrasheed.sunshine.app.internal.di.components;

import com.zahidrasheed.sunshine.app.internal.di.modules.ActivityModule;
import com.zahidrasheed.sunshine.app.internal.ActivityScope;
import com.zahidrasheed.sunshine.app.ui.detail.DetailFragment;
import com.zahidrasheed.sunshine.app.ui.adapters.ForecastAdapter;
import com.zahidrasheed.sunshine.app.ui.main.ForecastFragment;
import com.zahidrasheed.sunshine.app.ui.main.MainActivity;

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
