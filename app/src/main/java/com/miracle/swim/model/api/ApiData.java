package com.miracle.swim.model.api;

import com.miracle.swim.model.response.GetIpInfoResponse;
import com.miracle.swim.model.response.UserLoginResponse;
import com.miracle.swim.model.response.UserRegisterResponse;
import com.miracle.swim.model.response.VenueNearResponse;
import com.miracle.swim.utils.Constants;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public interface ApiData {
    @GET("service/getIpInfo.php")
    Observable<GetIpInfoResponse> getIpInfo(@Query("ip") String ip);

    @GET(Constants.UrlInfo.URL_LIST_NEAR)
    Observable<VenueNearResponse>  getVenueNearData(@QueryMap Map<String,String> params);

    @POST(Constants.UrlInfo.URL_USER_LOGIN)
    Observable<UserLoginResponse> getUserLoginData(@FieldMap Map<String,String> params);

    @POST(Constants.UrlInfo.URL_USER_REGISTER)
    Observable<UserRegisterResponse> getUserRegisterData(@FieldMap Map<String,String> params);

}
