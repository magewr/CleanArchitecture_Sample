package com.example.wr.clientframework.ui.content.main;

import android.view.Gravity;
import android.view.animation.OvershootInterpolator;
import android.widget.TextView;

import com.example.wr.clientframework.R;
import com.example.wr.clientframework.data.remote.dto.SampleDTO;
import com.example.wr.clientframework.di.component.ActivityComponent;
import com.example.wr.clientframework.di.module.ActivityModule;
import com.example.wr.clientframework.ui.base.BaseActivity;
import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * Created by WR on 2017-11-27.
 */

public class MainActivity extends BaseActivity implements MainContract.View {

    @Inject
    MainPresenter presenter;
    private ActivityComponent activityComponent;

    @BindView(R.id.tickerView)
    TickerView tickerView;

    @BindView(R.id.currentTimeText)
    TickerView timeTextView;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
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
        tickerView.setCharacterList(TickerUtils.getDefaultNumberList());
        timeTextView.setCharacterList(TickerUtils.getDefaultNumberList());
        tickerView.setText("0");
    }

    @Override
    public void showSampleData(SampleDTO sampleDTO) {
        int price = Integer.parseInt(sampleDTO.getLast());
        tickerView.setText(String.format("￦ %,10d", price), true);
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String date = formatter.format(new Date());
        timeTextView.setText(date);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dispose();
    }
}
