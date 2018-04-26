package com.example.wannnasitchaiphinan.bindingsample.main;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crashlytics.android.Crashlytics;
import com.example.wannnasitchaiphinan.bindingsample.R;
import com.example.wannnasitchaiphinan.bindingsample.card.CardActivity;
import com.example.wannnasitchaiphinan.bindingsample.databinding.ActivityMainBinding;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.buttonViewCard.setOnClickListener(v -> startActivity(new Intent(this, CardActivity.class)));
    }
}
