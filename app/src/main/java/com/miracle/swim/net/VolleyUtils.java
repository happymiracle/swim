package com.miracle.swim.net;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.miracle.swim.App;
import com.miracle.swim.utils.Utils;

import java.util.Map;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class VolleyUtils {
    private Context mContext;
    private final RequestQueue mRequestQueue;

    private static VolleyUtils mInstance;

    public interface  VolleyListener<T> {
        void onGetData(T t);
        void onError(VolleyError err);
    }

    static class Nested {
        private static VolleyUtils mInstance = new VolleyUtils();
    }
    private VolleyUtils() {
        mContext = App.getInstance();
        mRequestQueue = Volley.newRequestQueue(mContext);
    }

    public VolleyUtils getInstance() {
        return Nested.mInstance;
    }

    private void addRequestToQueue(Request request) {
        mRequestQueue.add(request);
    }

    public <T> void netGetRequest(String url,Class<T> tClass,Map<String,String> params,final VolleyListener<T> convertedListener) {
            String completeUrl = Utils.getUrl(url,params);
            GsonRequest<T> gsonRequest = new GsonRequest<T>(completeUrl,tClass,new Response.Listener<T>() {
                @Override
                public void onResponse(T t) {
                    if(convertedListener != null) {
                            convertedListener.onGetData(t);
                    }
                }
            },new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError volleyError) {
                    if(convertedListener != null) {
                            convertedListener.onError(volleyError);
                    }
                }
            });

    }

    public <T> void netPostRequest(String url,Class<T> tClass,Map<String,String> postParams,final VolleyListener<T> convertedListener) {
        GsonRequest<T> gsonRequest = new GsonRequest<T>(url,Request.Method.POST,postParams,tClass,new Response.Listener<T>() {
            @Override
            public void onResponse(T t) {
                if(convertedListener != null) {
                    convertedListener.onGetData(t);
                }
            }
        },new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                if(convertedListener != null) {
                    convertedListener.onError(volleyError);
                }
            }
        });

    }
}
