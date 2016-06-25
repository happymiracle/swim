package com.miracle.swim;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class App extends Application {
    private static App mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        initFresco();
    }

    private void initFresco(){
        Fresco.initialize(this);
    }

    public static App getInstance() {
        return mInstance;
    }
}
