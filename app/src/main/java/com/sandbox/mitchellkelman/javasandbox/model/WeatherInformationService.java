package com.sandbox.mitchellkelman.javasandbox.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface WeatherInformationService {

    @GET
    Call<List<String>> getInfo();

}