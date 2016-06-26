package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutRegisterBinding;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2016/6/25 0025.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        ((LayoutRegisterBinding)mRootBinding).btnSend.setOnClickListener(this);
        ((LayoutRegisterBinding)mRootBinding).btnRegister.setOnClickListener(this);
        ((LayoutRegisterBinding)mRootBinding).topTitle.ivBack.setOnClickListener(this);
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
                //TODO:
                break;
            case R.id.iv_back:
                finish();
        }
    }
}
