package com.campbuyback.buyback.handler;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.campbuyback.buyback.activity.OTPActivity;

public class LoginActivityHandler {

    private Context mContext;

    public LoginActivityHandler(Context mContext) {
        this.mContext = mContext;
    }

    public void onVerifyButtonClick(View view) {
        mContext.startActivity(new Intent(mContext, OTPActivity.class));
    }
}
