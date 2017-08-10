package com.example.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by KevinShiny on 2017/8/10.
 */

public class County extends DataSupport {
    private int id;//县区的id
    private String contyName;//县区的名称
    private String weatherId;//县区对应的天气代号
    private int cityId;//所属的市代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContyName() {
        return contyName;
    }

    public void setContyName(String contyName) {
        this.contyName = contyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
