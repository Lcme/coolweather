package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by c on 2017/7/31.
 */

public class County extends DataSupport {
    private int id;
    private String countuName;
    private String weather;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountuName() {
        return countuName;
    }

    public void setCountuName(String countuName) {
        this.countuName = countuName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
