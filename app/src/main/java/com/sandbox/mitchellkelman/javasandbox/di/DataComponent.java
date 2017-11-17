package com.sandbox.mitchellkelman.javasandbox.di;

import android.content.SharedPreferences;

import com.sandbox.mitchellkelman.javasandbox.MainActivity;
import com.squareup.okhttp.OkHttpClient;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;


@Singleton
@Component(modules={AppModule.class, DataModule.class})
public interface DataComponent {
    void inject(MainActivity mainActivity);
//    Retrofit retrofit();
//    OkHttpClient okHttpClient();
//    SharedPreferences sharedPreferences();
}
