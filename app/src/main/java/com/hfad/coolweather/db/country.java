package com.hfad.coolweather.db;

import org.litepal.crud.DataSupport;

public class country extends DataSupport {
    private int id;//每一个实体类都需有一个id
    private String countryName; //记录区县名称
    private int countryCode;//记录区县代码
    private int weatherId;//记录该区县的天气信息
    private int cityId;//该区县所属的市级代码
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countyName) {
        this.countryName = countryName;
    }
    public int getCountryCode() {
        return countryCode;
    }
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
    public int getWeatherId() {
        return weatherId;
    }
    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
    public int getCityId() {
        return cityId;
    }
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}