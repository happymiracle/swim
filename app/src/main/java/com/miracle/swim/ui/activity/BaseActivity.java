package com.miracle.swim.ui.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.miracle.swim.R;

/**
 * Created by Administrator on 2016/6/25 0025.
 */
public abstract class BaseActivity extends AppCompatActivity {
    private TextView mTvTitle;
    private ImageView mIvBack;

    protected ViewDataBinding mRootBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mRootBinding = DataBindingUtil.setContentView(this,getLayoutId());
        if(isShowTitle()) {
            mTvTitle = (TextView) mRootBinding.getRoot().findViewById(R.id.tv_title);
            mIvBack = (ImageView) mRootBinding.getRoot().findViewById(R.id.iv_back);
            if(!TextUtils.isEmpty(getTitleText())) {
                mTvTitle.setText(getTitleText());
            }
        }

        afterOnCreate(savedInstanceState);
    }

    public abstract  @LayoutRes int getLayoutId();

    public abstract void afterOnCreate(Bundle savedInstanceState);

    public boolean isShowTitle() {
        return true;
    }

    public String getTitleText() {
        return "";
    }

    public TextView getTitleTextView() {
        if(isShowTitle()) {
            return mTvTitle;
        } else {
            throw new RuntimeException("cannot access mTvTitle for title is not visible");
        }
    }

    public ImageView getBackImg() {
        if(isShowTitle()) {
            return mIvBack;
        } else {
            throw new RuntimeException("cannot access mIvBack for title is not visible");
        }
    }
}
