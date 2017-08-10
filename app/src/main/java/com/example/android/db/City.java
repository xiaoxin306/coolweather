package com.example.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by KevinShiny on 2017/8/10.
 */

public class City extends DataSupport {
    private int id;//实体类的id
    private String cityName;//市的名称
    private int cityCode;//市的代号
    private int provinceId;//所属省份的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
