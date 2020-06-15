package com.example.daggerapp.dagger;

import com.example.daggerapp.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    @Singleton
    @Provides
    public Driver provideDriver(){
        return new Driver();
    }
}
