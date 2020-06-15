package com.example.daggerapp.dagger;

import com.example.daggerapp.MainActivity;
import com.example.daggerapp.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@PerActivity
@Component(dependencies = DriverComponent.class,modules = {WheelModule.class,PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    // for multiple member variable
    void inject(MainActivity mainActivity);

    // full responsibility how our builder looks
    @Component.Builder
    interface Builder{
        @BindsInstance
        Builder horsePower(@Named("horse power")int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder driverComponent(DriverComponent driverComponent);
        ActivityComponent build();
    }
}
