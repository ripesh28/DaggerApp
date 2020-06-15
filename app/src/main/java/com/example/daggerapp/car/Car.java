package com.example.daggerapp.car;

import android.util.Log;

import com.example.daggerapp.dagger.PerActivity;

import javax.inject.Inject;
@PerActivity
public class Car {
    private static final String TAG="Car";
    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver,Engine engine,Wheels wheels)
    {
        this.engine=engine;
        this.wheels=wheels;
        this.driver=driver;
    }
    public void drive()
    {
        engine.start();
        Log.d(TAG,"Driving...."+driver+" by  "+this);
    }
}
