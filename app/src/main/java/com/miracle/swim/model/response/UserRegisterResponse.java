package com.miracle.swim.model.response;

import com.miracle.swim.model.bean.UserLoginBean;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class UserRegisterResponse extends BaseResponse {
    public UserLoginBean record;

    @Override
    public String toString() {
        return record.toString();
    }
}
