package com.sandbox.mitchellkelman.javasandbox.features;

import com.sandbox.mitchellkelman.javasandbox.ViewModel;


public class WeatherViewModel implements ViewModel {

    public WeatherViewModel() {

    }


//    public void init() {
//        try {
//            Response<List<String>> execute = weatherInformationService.getInfo().execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    private WeatherObject weatherObject;

//    public WeatherViewModel(WeatherObject weatherObject) {
//        this.weatherObject = weatherObject;
//    }

    public String getText() {
        return "blah balh";
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
