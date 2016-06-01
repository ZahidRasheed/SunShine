package com.example.android.sunshine.app.data.entity.mapper;

import android.support.annotation.NonNull;

import com.example.android.sunshine.app.data.entity.WeatherResponseEntity;
import com.example.android.sunshine.app.domain.model.Location;
import com.example.android.sunshine.app.domain.model.Weather;

public class WeatherResponseMapper {

    public WeatherResponseMapper() {
    }

    public Weather[] mapResponse(@NonNull WeatherResponseEntity.ForecastList response[]) {
        Weather[] weatherArray = new Weather[response.length];
        WeatherResponseEntity.ForecastList aResponse;
        for (int i = 0; i < response.length; i++) {
            aResponse = response[i];
            weatherArray[i] = new Weather(
                    aResponse.getDateTime(),
                    aResponse.getPressure(),
                    aResponse.getHumidity(),
                    aResponse.getWindSpeed(),
                    aResponse.getWindDirection(),
                    aResponse.getTemp().getMax(),
                    aResponse.getTemp().getMin(),
                    aResponse.getWeather()[0].getDescription(),
                    aResponse.getWeather()[0].getWeatherId()
            );
            //Log.e(TAG,weatherArray[i].toString());
        }
        return weatherArray;
    }

    public Location mapResponse(@NonNull WeatherResponseEntity.City response) {
        return new Location(
                response.getName(),
                response.getCoord().getLat(),
                response.getCoord().getLon()
        );
    }
}
