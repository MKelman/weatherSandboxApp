package com.sandbox.mitchellkelman.javasandbox;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sandbox.mitchellkelman.javasandbox.databinding.ActivityMainBinding;
import com.sandbox.mitchellkelman.javasandbox.features.WeatherViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((App) getApplication()).getDataComponent().inject(this);

        setContentView(R.layout.activity_main);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        WeatherViewModel weatherViewModel = new WeatherViewModel();
        activityMainBinding.setViewModel(weatherViewModel);
    }

}
