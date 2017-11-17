package com.sandbox.mitchellkelman.javasandbox.model;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface WeatherInformationService {

    //    @GET("rest/v1/all")

    @GET("/weather?q={townName}&APPID=097363c76973207891037ff09d642a73")
    Single<List<Post>> getWeatherInfo();



    //public Flowable<WeatherData> getWeatherInfo(@Path("townName") String townName);
//    Call<List<WeatherData>> getInfo();

}