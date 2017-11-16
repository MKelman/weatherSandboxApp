package com.sandbox.mitchellkelman.javasandbox.di;

import com.sandbox.mitchellkelman.javasandbox.MainActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules={AppModule.class, DataModule.class})
public interface DataComponent {
    void inject(MainActivity mainActivity);
}
