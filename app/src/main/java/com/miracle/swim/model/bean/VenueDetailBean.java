package com.miracle.swim.model.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class VenueDetailBean {

    /**
     * images : ["venue/1462202884162.jpg"]
     * contributorUserId : 100000
     * defaultComments : [{"score":"0.0","createtime":"1462205653609","userId":"889220","content":"测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试"},{"score":"0.0","createtime":"1462205726669","userId":"889220","content":"测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试"}]
     * latitude : 39.99139
     * cityId : 010
     * isGym : false
     * isOutdoor : false
     * venueName : 国家游泳中心
     * priceInfo : 40￥/2小时
     * isGymFree : false
     * currentUser : 0
     * isPark : true
     * textInfo : 国家级游泳馆，设施齐全，水质一流，更衣室、沐浴区、卫生间都非常干净，另有VIP方便携带儿童更衣、冲淋，人性化服务。场馆设有深水区、浅水区、儿童练习池。管理严格，深水区必须深水证方可入池，不可通融。深水证可以现场考，20元人民币，并且考试可以延长30分钟，考试主要是双手过顶踩踩水，然后游个2、300米即可，立刻发北京市深水证。场馆还有医生、救生员，各司其职，管理到位。孩子学游泳的地方最热闹，孩子的岁数也越来越小的趋势，看来干什么，一切都要趁早啊！游泳券除了游泳还附带参观功能，参观是不限时的，里面也有很多速食店，米饭、炒菜、面条、薯条、汉堡、咖啡、奶茶、果汁一应俱全。
     * contributor : 0
     * isWifi : false
     * venueId : 86443262760873984
     * contributorAvatar :
     * waterQuality : 良好
     * contactPhoneNumber :
     * location : 北京市朝阳区天辰东路11号国家游泳中心
     * longitude : 116.38416000000007
     */

    private String contributorUserId;
    private String latitude;
    private String cityId;
    private boolean isGym;
    private boolean isOutdoor;
    private String venueName;
    private String priceInfo;
    private boolean isGymFree;
    private String currentUser;
    private boolean isPark;
    private String textInfo;
    private String contributor;
    private boolean isWifi;
    private String venueId;
    private String contributorAvatar;
    private String waterQuality;
    private String contactPhoneNumber;
    private String location;
    private String longitude;
    private List<String> images;
    /**
     * score : 0.0
     * createtime : 1462205653609
     * userId : 889220
     * content : 测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试测试
     */

    private List<DefaultCommentsBean> defaultComments;

    public String getContributorUserId() {
        return contributorUserId;
    }

    public void setContributorUserId(String contributorUserId) {
        this.contributorUserId = contributorUserId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public boolean isIsGym() {
        return isGym;
    }

    public void setIsGym(boolean isGym) {
        this.isGym = isGym;
    }

    public boolean isIsOutdoor() {
        return isOutdoor;
    }

    public void setIsOutdoor(boolean isOutdoor) {
        this.isOutdoor = isOutdoor;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }

    public boolean isIsGymFree() {
        return isGymFree;
    }

    public void setIsGymFree(boolean isGymFree) {
        this.isGymFree = isGymFree;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public boolean isIsPark() {
        return isPark;
    }

    public void setIsPark(boolean isPark) {
        this.isPark = isPark;
    }

    public String getTextInfo() {
        return textInfo;
    }

    public void setTextInfo(String textInfo) {
        this.textInfo = textInfo;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public boolean isIsWifi() {
        return isWifi;
    }

    public void setIsWifi(boolean isWifi) {
        this.isWifi = isWifi;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getContributorAvatar() {
        return contributorAvatar;
    }

    public void setContributorAvatar(String contributorAvatar) {
        this.contributorAvatar = contributorAvatar;
    }

    public String getWaterQuality() {
        return waterQuality;
    }

    public void setWaterQuality(String waterQuality) {
        this.waterQuality = waterQuality;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<DefaultCommentsBean> getDefaultComments() {
        return defaultComments;
    }

    public void setDefaultComments(List<DefaultCommentsBean> defaultComments) {
        this.defaultComments = defaultComments;
    }

    public static class DefaultCommentsBean {
        private String score;
        private String createtime;
        private String userId;
        private String content;

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
