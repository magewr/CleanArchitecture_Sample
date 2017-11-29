package com.example.wr.clientframework.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.wr.clientframework.App;
import com.example.wr.clientframework.di.component.ApplicationComponent;

import butterknife.ButterKnife;

/**
 * Created by WR on 2017-11-27.
 */

public abstract class BaseActivity extends AppCompatActivity implements BaseView{

    protected abstract int getLayoutId();
    protected abstract void initDagger();
    protected abstract void initPresenter();

    protected Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.setDebug(true);
        ButterKnife.bind(this);

        initDagger();
        initPresenter();

        if (presenter != null)
            presenter.onCreate();
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
            presenter.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (presenter != null)
            presenter.onStop();
    }

    protected ApplicationComponent getApplicationComponent() {
        return App.get(this).getApplicationComponent();
    }
}
