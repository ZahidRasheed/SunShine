package com.example.android.sunshine.app.data.api;

import com.example.android.sunshine.app.data.entity.WeatherResponseEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppApiService {
    //TODO: Parameters should be passed here...
    @GET("daily?q=London&mode=json&units=metric&cnt=15")
    Call<WeatherResponseEntity> getDailyForecast(
            @Query("q") String city,
            @Query("mode") String mode,
            @Query("units") String units,
            @Query("cnt") String count
    );
}