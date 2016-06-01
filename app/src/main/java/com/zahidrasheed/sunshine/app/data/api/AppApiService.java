package com.zahidrasheed.sunshine.app.data.api;

import com.zahidrasheed.sunshine.app.data.entity.WeatherResponseEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface AppApiService {
    @GET("daily")
    Call<WeatherResponseEntity> getDailyForecast(
            @Query("q") String city,
            @Query("mode") String mode,
            @Query("units") String units,
            @Query("cnt") String count
    );
}