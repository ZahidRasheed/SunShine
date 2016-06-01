package com.zahidrasheed.sunshine.app.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class WeatherResponseEntity {
    private City city;

    @SerializedName("list")
    private ForecastList[] forecastList; //list

    public WeatherResponseEntity(City city, ForecastList[] forecastList) {
        this.city = city;
        this.forecastList = forecastList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public ForecastList[] getForecastList() {
        return forecastList;
    }

    public void setForecastList(ForecastList[] forecastList) {
        this.forecastList = forecastList;
    }

    @Override
    public String toString() {
        return "WeatherResponseEntity{" +
                "city=" + city +
                ", forecastList=" + Arrays.toString(forecastList) +
                '}';
    }

    public class City {
        private String name;
        private Cords coord;

        public City(String name, Cords coord) {
            this.name = name;
            this.coord = coord;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Cords getCoord() {
            return coord;
        }

        public void setCoord(Cords coord) {
            this.coord = coord;
        }

        @Override
        public String toString() {
            return "City{" +
                    "name='" + name + '\'' +
                    ", coord=" + coord +
                    '}';
        }

        public class Cords {
            private double lon;
            private double lat;

            public Cords(double lon, double lat) {
                this.lon = lon;
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            @Override
            public String toString() {
                return "Cords{" +
                        "lon=" + lon +
                        ", lat=" + lat +
                        '}';
            }
        }
    }

    public class ForecastList {
        @SerializedName("dt")
        private long dateTime;
        private double pressure;
        private int humidity;
        @SerializedName("speed")
        private double windSpeed;
        @SerializedName("deg")
        private double windDirection;
        private Weather[] weather;
        private Temperature temp;

        public ForecastList(long dateTime, double pressure, int humidity, double windSpeed,
                            double windDirection, Weather[] weather, Temperature temp) {
            this.dateTime = dateTime;
            this.pressure = pressure;
            this.humidity = humidity;
            this.windSpeed = windSpeed;
            this.windDirection = windDirection;
            this.weather = weather;
            this.temp = temp;
        }

        public Weather[] getWeather() {
            return weather;
        }

        public void setWeather(Weather[] weather) {
            this.weather = weather;
        }

        public long getDateTime() {
            return dateTime;
        }

        public void setDateTime(long dateTime) {
            this.dateTime = dateTime;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getWindSpeed() {
            return windSpeed;
        }

        public void setWindSpeed(double windSpeed) {
            this.windSpeed = windSpeed;
        }

        public double getWindDirection() {
            return windDirection;
        }

        public void setWindDirection(double windDirection) {
            this.windDirection = windDirection;
        }

        public Temperature getTemp() {
            return temp;
        }

        public void setTemp(Temperature temp) {
            this.temp = temp;
        }

        @Override
        public String toString() {
            return "ForecastList{" +
                    "dateTime=" + dateTime +
                    ", pressure=" + pressure +
                    ", humidity=" + humidity +
                    ", windSpeed=" + windSpeed +
                    ", windDirection=" + windDirection +
                    ", weather=" + Arrays.toString(weather) +
                    ", temp=" + temp +
                    '}';
        }

        public class Temperature {

            private double max;
            private double min;

            public Temperature(double max, double min) {
                this.max = max;
                this.min = min;
            }

            public double getMax() {
                return max;
            }

            public void setMax(double max) {
                this.max = max;
            }

            public double getMin() {
                return min;
            }

            public void setMin(double min) {
                this.min = min;
            }

            @Override
            public String toString() {
                return "Temperature{" +
                        "max=" + max +
                        ", min=" + min +
                        '}';
            }
        }

        public class Weather {
            private String description;
            @SerializedName("id")
            private int weatherId; //id

            public Weather(String description, int weatherId) {
                this.description = description;
                this.weatherId = weatherId;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getWeatherId() {
                return weatherId;
            }

            public void setWeatherId(int weatherId) {
                this.weatherId = weatherId;
            }

            @Override
            public String toString() {
                return "Weather{" +
                        "description='" + description + '\'' +
                        ", weatherId=" + weatherId +
                        '}';
            }
        }
    }
}