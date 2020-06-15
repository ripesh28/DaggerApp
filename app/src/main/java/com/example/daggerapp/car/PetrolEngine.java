package com.example.daggerapp.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG="Car";
    private int horsePower;
    private int  engineCapacity;
    @Override
    public void start() {
        Log.d(TAG,"Petrol Engine Loaded. " +
                "\nHorse Power : "+horsePower +
        "\nEngine Capacity : "+ engineCapacity);
    }
    @Inject
    public PetrolEngine(@Named("horse power") int horsePower, @Named("engine capacity") int engineCapacity){
        this.horsePower=horsePower;
        this.engineCapacity=engineCapacity;
    };
}
