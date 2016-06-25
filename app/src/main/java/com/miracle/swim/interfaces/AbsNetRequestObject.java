package com.miracle.swim.interfaces;

import java.util.Map;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public interface AbsNetRequestObject {
    public String baseUrl();

    public int getMethod();

    public Map<String,String> paramsForPost();
    public Map<String,String> paramsForGet();
}
