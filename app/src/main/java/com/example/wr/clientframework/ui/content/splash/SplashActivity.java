package com.example.wr.clientframework.ui.content.splash;

import android.content.Intent;
import android.os.Handler;

import androidx.databinding.DataBindingUtil;

import com.bumptech.glide.Glide;
import com.example.wr.clientframework.R;
import com.example.wr.clientframework.databinding.ActivitySplashBinding;
import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.ui.base.BaseActivity;
import com.example.wr.clientframework.ui.content.main.MainActivity;

import javax.inject.Inject;


public class SplashActivity extends BaseActivity implements SplashContract.View{

    @Inject
    SplashPresenter splashPresenter;

    private ActivitySplashBinding bnd;

    @Override
    protected void initDataBinding() {
        bnd = DataBindingUtil.setContentView(this, R.layout.activity_splash);
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
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 5000);
    }

    @Override
    public void loadSplashImage() {
        Glide.with(this).load(R.raw.mark_and_john).into(bnd.imgView);
    }
}
