package com.example.android.gson;

/**
 * Created by KevinShiny on 2017/8/11.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
