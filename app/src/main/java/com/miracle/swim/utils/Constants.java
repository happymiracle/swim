package com.miracle.swim.utils;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Constants {
    public interface UrlInfo {
        String BASE_PIC_URL = "http://swim-images.oss-cn-beijing.aliyuncs.com/";
        String BASE_URL = "http://api.swim.pics/";

        String URL_USER_LOGIN = "v1/user/login";
        String URL_USER_REGISTER = "v1/user/register";

        String URL_LIST_NEAR = "v1/venue/list/near";
        String URL_VENUE_DETAIL = "v1/venue/detail/";

        String URL_VENUE_COMMENT = "v1/venue/comment";
    }

    public interface Params {
        String CITY_ID = "cityid";
        String LAITITUDE = "laititude";
        String LONGITUDE =  "longitude";

        String NICK_NAME = "nickName";
        String MOBILE = "mobile";
        String UUID = "uuid";
        String PASSWORD = "password";

        String LOGIN_NAME = "loginName";

    }
}
