package com.campbuyback.buyback.activity;

import android.content.Context;
import android.os.Bundle;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.common.BaseActivity;
import com.campbuyback.buyback.databinding.ActivityOtpBinding;
import com.campbuyback.buyback.handler.OTPActivityHandler;

import androidx.databinding.DataBindingUtil;

public class OTPActivity extends BaseActivity {

    private final String TAG = OTPActivity.class.getSimpleName();
    private Context mContext = OTPActivity.this;
    private ActivityOtpBinding binding;
    private OTPActivityHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_otp);

        handler = new OTPActivityHandler(mContext);
        binding.setHandler(handler);
    }

    @Override
    public void init() {

    }

    @Override
    public void setLayout() {

    }
}
