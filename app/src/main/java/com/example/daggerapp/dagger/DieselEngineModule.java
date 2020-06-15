package com.example.daggerapp.dagger;


import com.example.daggerapp.car.DieselEngine;
import com.example.daggerapp.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public int provideHorsePower(){
        return horsePower;
    }
    @Provides
    public Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
