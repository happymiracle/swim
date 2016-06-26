package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.repacked.antlr.v4.codegen.model.ExceptionClause;
import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutLoginBinding;
import com.miracle.swim.databinding.LayoutRegisterBinding;
import com.miracle.swim.model.api.ApiData;
import com.miracle.swim.model.params.FactoryParams;
import com.miracle.swim.model.params.UserRegisterParams;
import com.miracle.swim.model.response.UserLoginResponse;
import com.miracle.swim.model.response.UserRegisterResponse;
import com.miracle.swim.utils.Constants;
import com.miracle.swim.utils.ToastUtils;
import com.miracle.swim.utils.Utils;

import org.w3c.dom.Text;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Administrator on 2016/6/25 0025.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "RegisterActivity";
    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        ((LayoutRegisterBinding) mRootBinding).btnSend.setOnClickListener(this);
        ((LayoutRegisterBinding) mRootBinding).btnRegister.setOnClickListener(this);
        ((LayoutRegisterBinding) mRootBinding).topTitle.ivBack.setOnClickListener(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_register;
    }

    @Override
    public String getTitleText() {
        return "注册";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_send:
                //TODO:

                break;
            case R.id.btn_register:
                if (!checkInputValid()) {
                    return;
                }
                UserRegisterParams params = new UserRegisterParams();
                params.nickName = ((LayoutRegisterBinding) mRootBinding).etUsername.getText().toString();
                params.mobile = ((LayoutRegisterBinding) mRootBinding).etMobile.getText().toString();
                params.password = ((LayoutRegisterBinding) mRootBinding).etPassword.getText().toString();
                params.uuid = Utils.getUUID();
                processRegisterRequest(params);
                break;
            case R.id.iv_back:
                finish();
        }
    }

    private boolean checkInputValid() {
        boolean result = true;
        String strUserName = ((LayoutRegisterBinding) mRootBinding).etUsername.getText().toString();
        if (TextUtils.isEmpty(strUserName)) {
            ToastUtils.showToast("用户名不能为空");
            return false;
        }

        String strMobile = ((LayoutRegisterBinding) mRootBinding).etMobile.getText().toString();
        if (TextUtils.isEmpty(strMobile)) {
            ToastUtils.showToast("手机号不能为空");
            return false;
        }

        String strPassword = ((LayoutRegisterBinding) mRootBinding).etPassword.getText().toString();
        if (TextUtils.isEmpty(strPassword)) {
            ToastUtils.showToast("密码不能为空");
            return false;
        }
        return result;
    }

    private void processRegisterRequest(UserRegisterParams params) {
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
        api.getUserRegisterData(FactoryParams.buildUserRegisterParams(params))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<UserRegisterResponse>() {
                    @Override
                    public void onCompleted() {
                        Log.i(TAG, "onCompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "t =>" + e.getMessage());

                    }

                    @Override
                    public void onNext(UserRegisterResponse resp) {
                        Log.i(TAG, "resp =>" + resp.toString());

                    }
                });

    }
}
