package com.example.wr.clientframework.ui.content.main;

import com.example.wr.clientframework.data.remote.dto.SampleDTO;
import com.example.wr.clientframework.ui.base.BaseView;
import com.example.wr.clientframework.ui.base.Presenter;

/**
 * Created by WR on 2017-11-27.
 */

public interface MainContract{

    interface View extends BaseView {
        void showSampleData(SampleDTO sampleDTO);
    }

    interface Presenter {
        void getSampleData();
    }
}
