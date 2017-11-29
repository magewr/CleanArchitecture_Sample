package com.example.wr.clientframework.ui.content.splash;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.wr.clientframework.R;
import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;

public class SplashActivity extends BaseActivity implements SplashContract.View{

    @Inject
    SplashPresenter splashPresenter;

    @BindView(R.id.imgView)
    ImageView splashImageVIew;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void initDagger() {
        getApplicationComponent().activityComponent(new ActivityModule(this)).inject(this);
    }

    @Override
    protected void initPresenter() {
        super.presenter = splashPresenter;
        presenter.setView(this);
    }

    @Override
    public void moveToMainActivity() {

    }

    @Override
    public void loadSplashImage() {
        Glide.with(this).load(R.raw.mark_and_john).into(splashImageVIew);
    }
}
