package com.sandbox.mitchellkelman.javasandbox.features;

import android.databinding.BaseObservable;
import android.os.Bundle;

import com.sandbox.mitchellkelman.javasandbox.ViewModel;
import com.sandbox.mitchellkelman.javasandbox.model.Post;
import com.sandbox.mitchellkelman.javasandbox.model.WeatherData;
import com.sandbox.mitchellkelman.javasandbox.model.WeatherInformationService;
import com.sandbox.mitchellkelman.javasandbox.model.WeatherResponse;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;


public class WeatherViewModel extends BaseObservable implements ViewModel {

    @Inject WeatherInformationService weatherInformationService;
    @Inject Retrofit retrofit;

    private final CompositeDisposable disposables = new CompositeDisposable();

    public WeatherViewModel() {
//        fetchWeatherData();
//        weatherInformationService.getWeatherInfo("Atlanta")
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .onErrorResumeNext(Flowable.<WeatherData>empty());

    }



    public String getText() {
        return "blah blah";
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {
        disposables.clear();
    }

    @Override
    public void restoreInstanceState(Bundle savedInstanceState) {

    }

    @Override
    public void saveInstanceState(Bundle outState) {

    }

    private void fetchWeatherData(String cityName) {
        // adding an Observable to the disposable


//        disposables.add(weatherInformationService.getWeatherInfo(cityName)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe());


//        compositeDisposible.add(repo.getBPI(artistName)
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .doOnError {
//            mutableText = "error"
//            notifyChange()
//        }
//                .subscribe {
//            mutableText = it.name
//            imageUrl = it.imageUrl
//            notifyChange()
//        })
    }

}
