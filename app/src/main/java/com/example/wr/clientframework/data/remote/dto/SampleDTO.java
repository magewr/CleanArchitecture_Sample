package com.example.wr.clientframework.data.remote.dto;

/**
 * Created by WR on 2017-11-27.
 */

public class SampleDTO {
    private String volume;
    private String last;
    private String timestamp;
    private String high;
    private String low;
    private String currency;
    private String result;
    private String errorCode;

    public SampleDTO(String volume, String last, String timestamp, String high, String low, String currency, String result, String errorCode) {
        this.volume = volume;
        this.last = last;
        this.timestamp = timestamp;
        this.high = high;
        this.low = low;
        this.currency = currency;
        this.result = result;
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
