package com.cm.gsonmodel;

import java.util.List;

public class UserGsonListModel<T> {
    private int result;
    private String resultMsg;
    private List<T> list;

    public UserGsonListModel() {
    }

    public UserGsonListModel(int result, String resultMsg) {
        this.result = result;
        this.resultMsg = resultMsg;
    }

    public UserGsonListModel(int result, String resultMsg, List<T> list) {
        this.result = result;
        this.resultMsg = resultMsg;
        this.list = list;
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

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
