package com.example.wr.clientframework.data.remote.service;

import com.example.wr.clientframework.data.remote.dto.SampleDTO;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by WR on 2017-11-27.
 */

public interface SampleApiService {
    @GET("v1/ticker/detailed")
    Call<SampleDTO> getSampleData();
}
