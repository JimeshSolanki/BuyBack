package com.campbuyback.buyback.activity;

import android.os.Bundle;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.databinding.ActivityLoginBinding;
import com.campbuyback.buyback.handler.LoginActivityHandler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public class LoginActivity extends AppCompatActivity {

    LoginActivityHandler handler;
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);


        handler = new LoginActivityHandler(this);

        binding.setHandler(handler);
    }
}
