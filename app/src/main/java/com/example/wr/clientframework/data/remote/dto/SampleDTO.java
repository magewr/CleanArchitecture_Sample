package com.example.wr.clientframework.data.remote.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by WR on 2017-11-27.
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SampleDTO {
    private long timestamp;
    private String last;
    private String bid;
    private String ask;
    private String low;
    private String high;
    private String volume;

}
