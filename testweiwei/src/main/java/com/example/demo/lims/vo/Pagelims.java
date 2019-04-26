package com.example.demo.lims.vo;

import java.util.List;

public class Pagelims<T> {

    //当前页数
    private int code;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PageBean [code=" + code + ", data=" + data + "]";
    }
}
