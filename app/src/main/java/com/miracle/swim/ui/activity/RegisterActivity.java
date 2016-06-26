package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.miracle.swim.R;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2016/6/25 0025.
 */

public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private EditText mEtUserName;
    private EditText mEtPassword;
    private EditText mEtCode;
    private TextView mBtnSend;
    private TextView mBtnRegister;

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        mEtUserName = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mEtCode = (EditText) findViewById(R.id.et_code);
        mBtnSend = (TextView) findViewById(R.id.btn_send);
        mBtnRegister = (TextView) findViewById(R.id.btn_register);

        mBtnSend.setOnClickListener(this);
        mBtnRegister.setOnClickListener(this);
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
        }
    }
}
