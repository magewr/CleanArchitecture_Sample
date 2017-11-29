package com.example.wr.clientframework;

import android.app.Application;
import android.content.Context;

import com.example.wr.clientframework.di.component.ApplicationComponent;
import com.example.wr.clientframework.di.component.DaggerApplicationComponent;
import com.example.wr.clientframework.di.module.ApiModule;
import com.example.wr.clientframework.di.module.ApplicationModule;

/**
 * Created by WR on 2017-11-27.
 */

public class App extends Application {

    private ApplicationComponent applicationComponent;
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .apiModule(new ApiModule())
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    public static App get(Context context) {
        return (App)context.getApplicationContext();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
