package com.example.android.sunshine.app.domain.model;

public class Weather {
    private long dateTime;
    private double pressure;
    private int humidity;
    private double windSpeed;
    private double windDirection;
    private double high;
    private double low;
    private String description;
    private int weatherId;

    public Weather(long dateTime, double pressure, int humidity, double windSpeed, double windDirection, double high, double low, String description, int weatherId) {
        this.dateTime = dateTime;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.high = high;
        this.low = low;
        this.description = description;
        this.weatherId = weatherId;
    }

    public void setDateTime(long dateTime) {
        this.dateTime = dateTime;
    }

    public double getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getWindDirection() {
        return windDirection;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public String getDescription() {
        return description;
    }

    public int getWeatherId() {
        return weatherId;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "dateTime=" + dateTime +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", windDirection=" + windDirection +
                ", high=" + high +
                ", low=" + low +
                ", description='" + description + '\'' +
                ", weatherId=" + weatherId +
                '}';
    }
}
