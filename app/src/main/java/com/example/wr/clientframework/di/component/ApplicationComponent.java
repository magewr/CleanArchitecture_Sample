package com.example.wr.clientframework.di.component;

import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.di.module.ApiModule;
import com.example.wr.clientframework.di.module.ApplicationModule;
import com.example.wr.clientframework.ui.base.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by WR on 2017-11-29.
 */

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    ActivityComponent activityComponent(ActivityModule activityModule);
}
