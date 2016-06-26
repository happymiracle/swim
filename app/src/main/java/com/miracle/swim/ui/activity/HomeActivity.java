package com.miracle.swim.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;

import com.miracle.swim.R;

/**
 * Created by Administrator on 2016/6/26 0026.
 */

public class HomeActivity extends BaseActivity implements View.OnClickListener {
    private static final int INDEX_NATATORIA = 0;
    private static final int INDEX_FOUND = 1;
    private static final int INDEX_ME = 2;

    private ViewPager mViewPager;
    private LinearLayout mTabNatatoria,mTabFound,mTabMe;

    @Override
    public void afterOnCreate(Bundle savedInstanceState) {
        mViewPager = (ViewPager) findViewById(R.id.viewpager_content);
        mTabNatatoria= (LinearLayout) findViewById(R.id.ll_tab_natatoria);
        mTabFound = (LinearLayout) findViewById(R.id.ll_tab_found);
        mTabMe = (LinearLayout) findViewById(R.id.ll_tab_me);

        mTabNatatoria.setOnClickListener(this);
        mTabFound.setOnClickListener(this);
        mTabMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_tab_natatoria:
                selectTab(INDEX_NATATORIA);
                break;
            case R.id.ll_tab_found:
                selectTab(INDEX_FOUND);
                break;
            case R.id.ll_tab_me:
                selectTab(INDEX_ME);
                break;
        }
    }

    @Override
    public int getLayoutId() {
        return R.layout.layout_home;
    }

    @Override
    public boolean isShowTitle() {
        return false;
    }

    private void selectTab(int index) {
        switch (index) {
            case INDEX_NATATORIA:
                mTabNatatoria.setSelected(true);
                mTabFound.setSelected(false);
                mTabMe.setSelected(false);
                break;
            case INDEX_FOUND:
                mTabNatatoria.setSelected(false);
                mTabFound.setSelected(true);
                mTabMe.setSelected(false);
                break;
            case INDEX_ME:
                mTabNatatoria.setSelected(false);
                mTabFound.setSelected(false);
                mTabMe.setSelected(true);
                break;
        }
    }
}
