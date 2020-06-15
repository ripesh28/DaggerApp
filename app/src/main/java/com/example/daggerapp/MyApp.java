package com.example.daggerapp;

import android.app.Application;

import com.example.daggerapp.dagger.DaggerDriverComponent;
import com.example.daggerapp.dagger.DriverComponent;

public class MyApp extends Application {
    private DriverComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        this.component= DaggerDriverComponent.create();
    }

    public DriverComponent getDriverComponent() {
        return component;
    }
}
