package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.miracle.swim.R;
import com.miracle.swim.databinding.LayoutUserinfoBinding;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class UserInfoActivity extends BaseActivity implements View.OnClickListener {
    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        ((LayoutUserinfoBinding)mRootBinding).llLogout.setOnClickListener(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_userinfo;
    }

    @Override
    public String getTitleText() {
        return "个人信息";
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_logout:
                break;
        }
    }
}
