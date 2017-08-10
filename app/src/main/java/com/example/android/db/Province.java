package com.example.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by KevinShiny on 2017/8/10.
 */

public class Province extends DataSupport {
    private int id;//实体类的id
    private String provinceName;//省份的名称
    private int provinceCode;//省份的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
