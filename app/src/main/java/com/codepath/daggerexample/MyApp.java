package com.codepath.daggerexample;

import com.codepath.daggerexample.di.components.AppComponent;

import android.app.Application;

public class MyApp extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        // specify the full namespace of the component
        // Dagger_xxxx (where xxxx = component name)
        mAppComponent = com.codepath.daggerexample.di.components.DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}