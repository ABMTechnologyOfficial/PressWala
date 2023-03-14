package com.example.presswala.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.presswala.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {
    ActivityLoginBinding binding;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        activity = this;


        binding.cardLogin.setOnClickListener(view -> {
            if (binding.edtEmail.getText().toString().equals("admin@gmail.com"))
            startActivity(new Intent(activity, HomeActivity.class));
            else
            startActivity(new Intent(activity, HomeActivity.class));
        });

    }
}