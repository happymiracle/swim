package com.miracle.swim.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutLoginBinding;
import com.miracle.swim.utils.ToastUtils;

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
                    //TODO:
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
}
