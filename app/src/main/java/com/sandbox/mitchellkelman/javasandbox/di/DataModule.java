package com.sandbox.mitchellkelman.javasandbox.di;


import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class DataModule {


    private String baseUrl;

    public DataModule(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @Singleton
    @Provides
    public SharedPreferences sharedPreferences(Application application) {
        return PreferenceManager.getDefaultSharedPreferences(application);
    }



//    @Singleton
//    @Provides
//    public OkHttpClient providesOkHttp(HttpLoggingInterceptor httpLoggingInterceptor) {
//        return new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
//    }
//
//    @Provides
//    @Singleton
//    Gson provideGson() {
//        GsonBuilder gsonBuilder = new GsonBuilder();
//        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
//        return gsonBuilder.create();
//    }



//    @Singleton
//    @Provides
//    public HttpLoggingInterceptor providesHttpLogging() {
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        return loggingInterceptor;
//    }
//
//    @Singleton
//    @Provides
//    public Retrofit provideRetrofit(Gson gson, OkHttpClient oktHttpClient) {
//        return new Retrofit.Builder()
//                .client(oktHttpClient)
//                .baseUrl(baseUrl)
//                .addConverterFactory(GsonConverterFactory.create(gson))
//                .build();
//    }

}