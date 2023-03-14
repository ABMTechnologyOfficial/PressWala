package com.example.presswala.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.presswala.R;
import com.example.presswala.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding;
    private Activity activity;
    private static int SPLASH_SCREEN_TIME_OUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;


        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashActivity.this, RegisterActivity.class);
            startActivity(i);
            finish();
        }, SPLASH_SCREEN_TIME_OUT);

    }
}