package com.example.daggerapp.dagger;

import com.example.daggerapp.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = DriverModule.class)
public interface DriverComponent {
    Driver getDriver();
}
