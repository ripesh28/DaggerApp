package com.example.daggerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggerapp.car.Car;
import com.example.daggerapp.car.Driver;
import com.example.daggerapp.dagger.ActivityComponent;
import com.example.daggerapp.dagger.DaggerActivityComponent;
import com.example.daggerapp.dagger.DriverComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DriverComponent component= ((MyApp)getApplication()).getDriverComponent();
        ActivityComponent activityComponent= DaggerActivityComponent.builder()
                .horsePower(150)
                .engineCapacity(140)
                .driverComponent(component)
                .build();
    activityComponent.inject(MainActivity.this);
    car1.drive();
    car2.drive();
    }
}
