package com.miracle.swim.model.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class VenueCommentBean implements Serializable {

    /**
     * id : 87165493115867136
     * venueId : 86443262760873984
     * content : @孤单北半球 这个场馆不贵哈，星期天人特别多
     * userId : 889220
     * createtime : 1462375078587
     * score : 4.5
     * repliedUserId : 456456
     * likes : []
     * likeCount : 0
     */

    private String id;
    private String venueId;
    private String content;
    private String userId;
    private String createtime;
    private String score;
    private String repliedUserId;
    private String likeCount;
    private List<?> likes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getRepliedUserId() {
        return repliedUserId;
    }

    public void setRepliedUserId(String repliedUserId) {
        this.repliedUserId = repliedUserId;
    }

    public String getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(String likeCount) {
        this.likeCount = likeCount;
    }

    public List<?> getLikes() {
        return likes;
    }

    public void setLikes(List<?> likes) {
        this.likes = likes;
    }
}
