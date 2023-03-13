package com.example.presswala.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.presswala.R;
import com.example.presswala.databinding.ActivityMyOrdersBinding;

public class MyOrdersActivity extends AppCompatActivity {
    ActivityMyOrdersBinding binding;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMyOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;
    }
}