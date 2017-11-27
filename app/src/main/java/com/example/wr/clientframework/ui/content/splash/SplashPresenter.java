package com.example.wr.clientframework.ui.content.splash;

import com.example.wr.clientframework.ui.base.Presenter;

import javax.inject.Inject;

/**
 * Created by WR on 2017-11-27.
 */

public class SplashPresenter extends Presenter<SplashContract.View> implements SplashContract.Presenter {

    @Inject
    public SplashPresenter() {
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
