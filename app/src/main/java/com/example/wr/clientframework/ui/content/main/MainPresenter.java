package com.example.wr.clientframework.ui.content.main;

import com.example.wr.clientframework.ui.base.Presenter;

import javax.inject.Inject;

/**
 * Created by WR on 2017-11-27.
 */

public class MainPresenter extends Presenter<MainContract.View> implements MainContract.Presenter {

    @Inject
    public MainPresenter(){}

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
