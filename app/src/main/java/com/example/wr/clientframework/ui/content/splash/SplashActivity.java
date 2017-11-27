package com.example.wr.clientframework.ui.content.splash;

import com.example.wr.clientframework.R;
import com.example.wr.clientframework.ui.base.BaseActivity;

import javax.inject.Inject;

public class SplashActivity extends BaseActivity implements SplashContract.View{

    @Inject
    SplashPresenter splashPresenter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initDagger() {

    }

    @Override
    protected void initPresenter() {
        super.presenter = splashPresenter;
        presenter.setView(this);
    }

    @Override
    public void moveToMainActivity() {

    }
}
