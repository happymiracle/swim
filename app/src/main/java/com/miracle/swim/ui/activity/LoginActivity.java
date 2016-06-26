package com.miracle.swim.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutLoginBinding;
import com.miracle.swim.databinding.LayoutTestRetrofitBinding;
import com.miracle.swim.model.api.ApiData;
import com.miracle.swim.model.bean.UserRegisterBean;
import com.miracle.swim.model.params.FactoryParams;
import com.miracle.swim.model.params.UserLoginParams;
import com.miracle.swim.model.params.UserRegisterParams;
import com.miracle.swim.model.response.GetIpInfoResponse;
import com.miracle.swim.model.response.UserLoginResponse;
import com.miracle.swim.model.response.UserRegisterResponse;
import com.miracle.swim.utils.Constants;
import com.miracle.swim.utils.ToastUtils;
import com.miracle.swim.utils.Utils;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public @LayoutRes int getLayoutId() {
        return R.layout.layout_login;
    }

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        ((LayoutLoginBinding)mRootBinding).btnLogin.setOnClickListener(this);
        ((LayoutLoginBinding)mRootBinding).btnRegister.setOnClickListener(this);
    }

    @Override
    public String getTitleText() {
        return "登录";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                if(checkInputValid()) {
                    UserLoginParams params = new UserLoginParams();
                    params.loginName = ((LayoutLoginBinding)mRootBinding).etUsername.getText().toString();
                    params.password = ((LayoutLoginBinding)mRootBinding).etPassword.getText().toString();
                    params.uuid = Utils.getUUID();
                    processLoginRequest(params);
                }
                break;
            case R.id.btn_register:
                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
                break;
        }
    }

    private boolean checkInputValid() {
        boolean result = true;
        String strUserName = ((LayoutLoginBinding)mRootBinding).etUsername.getText().toString();
        if(TextUtils.isEmpty(strUserName)) {
            ToastUtils.showToast("用户名不能为空");
            return false;
        }
        String strPassword = ((LayoutLoginBinding)mRootBinding).etPassword.getText().toString();
        if(TextUtils.isEmpty(strPassword)) {
            ToastUtils.showToast("密码不能为空");
            return false;
        }
        return result;
    }

    private void processLoginRequest(UserLoginParams params) {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl(Constants.UrlInfo.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ApiData api = retrofit.create(ApiData.class);
        api.getUserLoginData(FactoryParams.buildUserLoginParams(params))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<UserLoginResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.i("miracle","onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i("miracle","onError " + e.getMessage().toString());
                    }

                    @Override
                    public void onNext(UserLoginResponse response) {
                        Log.i("miracle","response :" + response.toString());
                    }
                });
    }
}
