package com.example.daggerapp.dagger;


import com.example.daggerapp.car.Engine;
import com.example.daggerapp.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    public abstract Engine bindEngine(PetrolEngine engine);
}
