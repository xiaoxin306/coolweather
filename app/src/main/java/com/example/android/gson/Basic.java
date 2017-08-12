package com.example.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by KevinShiny on 2017/8/11.
 */

public class Basic {
    //采用注解的方式让JSON字段和Java字段之间建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
