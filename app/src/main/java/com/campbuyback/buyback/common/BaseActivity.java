package com.campbuyback.buyback.common;

import android.content.Context;
import android.os.Bundle;

import com.campbuyback.buyback.customcontrols.CustomToast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    private final Context mContext = BaseActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        setLayout();
    }

    public abstract void init();

    public abstract void setLayout();

    public void setToast(int imageId, String toastMessage, boolean isLong) {
        CustomToast customToast = new CustomToast(mContext);
        customToast.showToast(imageId, toastMessage, isLong);
    }
}
