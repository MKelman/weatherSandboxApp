package com.sandbox.mitchellkelman.javasandbox;

import android.app.Application;

import com.sandbox.mitchellkelman.javasandbox.di.AppModule;
import com.sandbox.mitchellkelman.javasandbox.di.DaggerDataComponent;
import com.sandbox.mitchellkelman.javasandbox.di.DataComponent;
import com.sandbox.mitchellkelman.javasandbox.di.DataModule;

import javax.inject.Inject;

public class App extends Application {

    @Inject DataComponent dataComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        dataComponent = DaggerDataComponent.builder()
                .appModule(new AppModule(this))
                .dataModule(new DataModule("https://weather.com"))
                .build();
    }


    public DataComponent getDataComponent() {
        return dataComponent;
    }
}
