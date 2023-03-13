package com.example.presswala.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import com.example.presswala.R;
import com.example.presswala.databinding.ActivityOrderPlacedBinding;

public class OrderPlacedActivity extends AppCompatActivity {
    ActivityOrderPlacedBinding binding;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOrderPlacedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;
    }
}