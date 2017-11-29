package com.example.wr.clientframework.ui.content.main;

import com.example.wr.clientframework.di.component.ActivityComponent;
import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.ui.base.BaseActivity;

import javax.inject.Inject;

/**
 * Created by WR on 2017-11-27.
 */

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;
    private ActivityComponent activityComponent;

    @Override
    protected int getLayoutId() {
        return 0;
    }

    @Override
    protected void initDagger() {
        activityComponent = getApplicationComponent().activityComponent(new ActivityModule(this));
        activityComponent.inject(this);
    }

    @Override
    protected void initPresenter() {
        super.presenter = presenter;
        presenter.setView(this);
    }
}
