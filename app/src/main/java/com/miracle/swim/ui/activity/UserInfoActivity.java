package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.miracle.swim.R;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class UserInfoActivity extends BaseActivity {
    private TextView mTvUserName;
    private SimpleDraweeView mSdvHead;
    private TextView mTvLocation;
    private EditText mEtLocation;
    private TextView mTvSchool;
    private EditText mEtSchool;
    private TextView mTvJob;
    private EditText mEtJob;
    private TextView mTvBirthday;
    private TextView mTvBirtydayDesc;
    private TextView mTvLove;
    private EditText mEtLove;

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        mTvUserName = (TextView) findViewById(R.id.tv_name);
        mSdvHead = (SimpleDraweeView) findViewById(R.id.sdv_head);
        mTvLocation = (TextView) findViewById(R.id.tv_location_title);
        mEtLocation = (EditText) findViewById(R.id.et_location_desc);
        mTvSchool = (TextView) findViewById(R.id.tv_school_title);
        mEtSchool = (EditText) findViewById(R.id.et_school_desc);
        mTvJob = (TextView) findViewById(R.id.tv_job_title);
        mEtJob = (EditText) findViewById(R.id.et_job_desc);
        mTvBirthday = (TextView) findViewById(R.id.tv_birthday_title);
        mTvBirtydayDesc = (TextView) findViewById(R.id.tv_birthday_des);
        mTvLove = (TextView) findViewById(R.id.tv_love_title);
        mEtLove = (EditText) findViewById(R.id.et_love_desc);

    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_userinfo;
    }

    @Override
    public String getTitleText() {
        return "个人信息";
    }
}
