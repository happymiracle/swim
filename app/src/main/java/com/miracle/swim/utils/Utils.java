package com.miracle.swim.utils;

import android.net.Uri;

import java.util.Map;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class Utils {
    public static String getUrl(String strUrl,Map<String,String> params) {
        Uri.Builder uriBuilder = Uri.parse(strUrl).buildUpon();
        for(String strKey : params.keySet()) {
                String strValue = params.get(strKey);
                uriBuilder.appendQueryParameter(strKey,strValue);
        }
        return uriBuilder.toString();
    }
}
