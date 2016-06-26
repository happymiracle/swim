package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.util.Log;

import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutTestRetrofitBinding;
import com.miracle.swim.model.api.ApiData;
import com.miracle.swim.model.response.GetIpInfoResponse;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class TestRetrofitActivity extends BaseActivity {
    private static final String BASE_URL = "http://ip.taobao.com";

    @Override
    public int getLayoutId() {
        return R.layout.layout_test_retrofit;
    }

    @Override
    public String getTitleText() {
        return "测试Retrofit";
    }

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        ((LayoutTestRetrofitBinding)mRootBinding).tvTest.setText("Test start");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiData api = retrofit.create(ApiData.class);
        api.getIpInfo("63.223.108.42")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<GetIpInfoResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.i("miracle","onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("miracle","onError " + e.getMessage().toString());
                    }

                    @Override
                    public void onNext(GetIpInfoResponse getIpInfoResponse) {
                        ((LayoutTestRetrofitBinding)mRootBinding).tvTest.setText(getIpInfoResponse.data.getCountry());
                    }
                });
    }
}
