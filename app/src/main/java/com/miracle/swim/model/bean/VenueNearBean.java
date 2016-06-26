package com.miracle.swim.model.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class VenueNearBean implements Serializable {

    /**
     * currentUser : 0
     * distance : 4629.05
     * image : venue/1462091090785.jpg
     * isOutdoor : false
     * name : 水立方
     * priceinfo : 40￥/2小时
     * venueId : 85974365347704832
     */

    private String currentUser;
    private String distance;
    private String image;
    private boolean isOutdoor;
    private String name;
    private String priceinfo;
    private String venueId;

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isIsOutdoor() {
        return isOutdoor;
    }

    public void setIsOutdoor(boolean isOutdoor) {
        this.isOutdoor = isOutdoor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriceinfo() {
        return priceinfo;
    }

    public void setPriceinfo(String priceinfo) {
        this.priceinfo = priceinfo;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }
}
