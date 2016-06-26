package com.miracle.swim.utils;

import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;

import com.miracle.swim.App;

import java.util.Map;
import java.util.UUID;

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

    public static String getUUID() {
        String strUUID = Settings.System.getString(App.getInstance().getContentResolver(), "com.miracle.swim");
        if (TextUtils.isEmpty(strUUID)) {
            strUUID = Settings.System.getString(App.getInstance().getContentResolver(),Settings.Secure.ANDROID_ID);
            if(TextUtils.isEmpty(strUUID) || "9774d56d682e549c".equals(strUUID)) {
                strUUID = UUID.randomUUID().toString();
                Settings.System.putString(App.getInstance().getContentResolver(), "com.miracle.swim", strUUID);
            }
        }
        Log.i("miracle","uuid =>" + strUUID);
        return strUUID;
    }
}
