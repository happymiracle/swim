package com.miracle.swim.utils;

import android.support.annotation.StringRes;
import android.widget.Toast;

import com.miracle.swim.App;

/**
 * Created by Administrator on 2016/6/25 0025.
 */

public class ToastUtils {
    private static Toast mToast;

    public static void showToast(String msg) {
        if(mToast == null) {
            mToast = Toast.makeText(App.getInstance().getApplicationContext(),msg,Toast.LENGTH_LONG);
        }

        mToast.setText(msg);
        mToast.show();
    }

    public static void showToast(@StringRes int resId) {
        if(mToast == null) {
                mToast = Toast.makeText(App.getInstance().getApplicationContext(),resId,Toast.LENGTH_SHORT);
        }

        mToast.setText(resId);
        mToast.show();
    }
}
