package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.TextInputLayout;

import com.miracle.swim.R;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public class LoginActivity extends BaseActivity {
    private TextInputLayout mUserNameWrapper;
    private TextInputLayout mPasswordWrapper;

    @Override
    public @LayoutRes int getLayoutId() {
        return R.layout.layout_login;
    }

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        mUserNameWrapper = (TextInputLayout) findViewById(R.id.til_username);
        mPasswordWrapper = (TextInputLayout) findViewById(R.id.til_password);
        mUserNameWrapper.setHint(getString(R.string.login_username_hint));
        mPasswordWrapper.setHint(getString(R.string.login_password_hint));
    }

    @Override
    public boolean isShowTitle() {
        return true;
    }

    @Override
    public String getTitleText() {
        return "登录";
    }
}
