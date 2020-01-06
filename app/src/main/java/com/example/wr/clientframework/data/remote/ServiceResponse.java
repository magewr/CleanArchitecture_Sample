package com.example.wr.clientframework.data.remote;


/**
 * Created by WR on 2017-12-06.
 */

public class ServiceResponse {
    private int code;
    private Object data;
    private ServiceError ServiceError;

    public ServiceResponse(int code, Object response) {
        this.code = code;
        this.data = response;
    }

    public ServiceResponse(ServiceError ServiceError) {
        this.ServiceError = ServiceError;
    }

    public ServiceResponse(Object response) {
        this.data = response;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public com.example.wr.clientframework.data.remote.ServiceError getServiceError() {
        return ServiceError;
    }

    public void setServiceError(com.example.wr.clientframework.data.remote.ServiceError serviceError) {
        ServiceError = serviceError;
    }
}
