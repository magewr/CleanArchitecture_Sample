package com.example.wr.clientframework.ui.content.main;


import androidx.databinding.DataBindingUtil;

import com.example.wr.clientframework.R;
import com.example.wr.clientframework.data.remote.dto.SampleDTO;
import com.example.wr.clientframework.databinding.ActivityMainBinding;
import com.example.wr.clientframework.di.component.ActivityComponent;
import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.ui.base.BaseActivity;
import com.robinhood.ticker.TickerUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

/**
 * Created by WR on 2017-11-27.
 */

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;
    private ActivityComponent activityComponent;
    private ActivityMainBinding bnd;

    @Override
    protected void initDataBinding() {
        bnd = DataBindingUtil.setContentView(this, R.layout.activity_main);
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
        bnd.tickerView.setCharacterList(TickerUtils.getDefaultNumberList());
        bnd.currentTimeText.setCharacterList(TickerUtils.getDefaultNumberList());
        bnd.tickerView.setText("0");
    }

    @Override
    public void showSampleData(SampleDTO sampleDTO) {
        int price = (int)Double.parseDouble(sampleDTO.getLast());
        bnd.tickerView.setText(String.format("￦ %,10d", price), true);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String date = formatter.format(new Date());
        bnd.currentTimeText.setText(date);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dispose();
    }
}
