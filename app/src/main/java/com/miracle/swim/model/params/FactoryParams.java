package com.miracle.swim.model.params;

import com.miracle.swim.utils.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class FactoryParams {
    public static Map<String,String> buildUserLoginParams(UserLoginParams inParams) {
        Map<String,String> outParams = new HashMap<>();
        outParams.put(Constants.Params.LOGIN_NAME,inParams.loginName);
        outParams.put(Constants.Params.PASSWORD,inParams.password);
        outParams.put(Constants.Params.UUID,inParams.uuid);
        return outParams;
    }

    public static Map<String,String> buildUserRegisterParams(UserRegisterParams inParams) {
        Map<String,String> outParams = new HashMap<>();
        outParams.put(Constants.Params.NICK_NAME,inParams.nickName);
        outParams.put(Constants.Params.MOBILE,inParams.mobile);
        outParams.put(Constants.Params.UUID,inParams.uuid);
        outParams.put(Constants.Params.PASSWORD,inParams.password);
        return outParams;
    }


    public String loginName;
    public String password;

    public static Map<String,String> buildVenueNearParams(VenueNearParams inParams) {
        Map<String,String> outParams = new HashMap<>();
        outParams.put(Constants.Params.CITY_ID,inParams.cityId);
        outParams.put(Constants.Params.LAITITUDE,inParams.laititude);
        outParams.put(Constants.Params.LONGITUDE,inParams.longitude);
        return outParams;
    }


}
