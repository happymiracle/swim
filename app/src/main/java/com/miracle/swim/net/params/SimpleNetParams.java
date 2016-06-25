package com.miracle.swim.net.params;

import com.android.volley.Request;
import com.miracle.swim.interfaces.AbsNetRequestObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class SimpleNetParams implements AbsNetRequestObject {
    @Override
    public String baseUrl() {
        return "";
    }

    @Override
    public int getMethod() {
        return Request.Method.GET;
    }

    @Override
    public Map<String,String> paramsForPost() {
        return null;
    }

    @Override
    public Map<String,String> paramsForGet() {
        return null;
    }
}
