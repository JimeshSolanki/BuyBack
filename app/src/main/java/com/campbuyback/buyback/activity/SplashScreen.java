package com.campbuyback.buyback.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.common.BaseActivity;

public class SplashScreen extends BaseActivity {

    protected TextView tv_copyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tv_copyright = findViewById(R.id.tv_copyright);

        tv_copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashScreen.this, LoginActivity.class));

//                setToast(AppConstant.TOAST_SUCCESS, "This is Success Message", true);
//                setToast(AppConstant.TOAST_INFO, "This is Information Message", true);
//                setToast(AppConstant.TOAST_WARNING, "This is Warning Message", true);
//                setToast(AppConstant.TOAST_ERROR, "This is Error Message", true);
            }
        });
    }

    @Override
    public void init() {
    }

    @Override
    public void setLayout() {

    }
}
