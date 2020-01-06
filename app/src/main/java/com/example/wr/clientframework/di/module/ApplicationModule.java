package com.example.wr.clientframework.di.module;

import android.content.Context;

import com.example.wr.clientframework.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by WR on 2017-11-29.
 */

@Module
public class ApplicationModule {
    private final App application;

    public ApplicationModule(App application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext() {
        return this.application;
    }
}
