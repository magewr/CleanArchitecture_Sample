package com.example.wr.clientframework.ui.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.wr.clientframework.App;
import com.example.wr.clientframework.di.component.ApplicationComponent;


/**
 * Created by WR on 2017-11-27.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView{

    protected abstract void initDataBinding();
    protected abstract void initDagger();
    protected abstract void initPresenter();

    protected Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initDataBinding();
        initDagger();
        initPresenter();

        if (presenter != null)
            presenter.onCreatePresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (presenter != null)
            presenter.onStartPresenter();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null)
            presenter.onStopPresenter();
    }

    protected ApplicationComponent getApplicationComponent() {
        return App.get(this).getApplicationComponent();
    }
}
