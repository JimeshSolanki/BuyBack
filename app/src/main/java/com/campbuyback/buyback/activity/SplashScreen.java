package com.campbuyback.buyback.activity;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.campbuyback.buyback.R;

public class SplashScreen extends AppCompatActivity {

    protected TextView tv_copyright;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tv_copyright = findViewById(R.id.tv_copyright);

        tv_copyright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
            }
        });
    }
}
