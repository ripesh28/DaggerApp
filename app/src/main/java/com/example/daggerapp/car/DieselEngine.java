package com.example.daggerapp.car;

import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;

public class DieselEngine implements Engine {
    private int horsePower;
    private static final String TAG="Car";
    @Override
    public void start() {
        Log.d(TAG,"Diesel Engine Loaded. Horse Power: "+horsePower);
    }

    @Inject
    public DieselEngine(int horsePower){
        this.horsePower=horsePower;
    }
}
