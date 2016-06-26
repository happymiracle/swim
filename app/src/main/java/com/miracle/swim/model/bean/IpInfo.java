package com.miracle.swim.model.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/26 0026.
 */
public class IpInfo implements Serializable {
    private String country;
    public String country_id;
    public String area;
    public String area_id;
    public String ip;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

