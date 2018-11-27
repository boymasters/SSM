package com.cm.gsonmodel;

import java.util.List;

public class UserGsonModel<T> {
    private int result;
    private String resultMsg;
    private T model;

    public UserGsonModel() {
    }

    public UserGsonModel(int result, String resultMsg) {
        this.result = result;
        this.resultMsg = resultMsg;
    }

    public UserGsonModel(int result, String resultMsg, T model) {
        this.result = result;
        this.resultMsg = resultMsg;
        this.model = model;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}
