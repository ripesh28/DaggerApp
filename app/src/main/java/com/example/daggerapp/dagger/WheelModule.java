package com.example.daggerapp.dagger;

import com.example.daggerapp.car.Rim;
import com.example.daggerapp.car.Tyre;
import com.example.daggerapp.car.Wheels;

import dagger.Module;
import dagger.Provides;

//Provider example
@Module
public class WheelModule {

    @Provides
    public Tyre provideTyre(){
        Tyre tyre=new Tyre();
        tyre.inflate();
        return tyre;
    }
    @Provides
    public Rim provideRim(){
        return new Rim();
    }

    @Provides
    public Wheels provideWheels(Tyre tyre, Rim rim){
        return new Wheels(tyre,rim);
    }
}
