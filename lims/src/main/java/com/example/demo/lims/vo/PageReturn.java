package com.example.demo.lims.vo;

/*
@WeiJie
包装类3，用于包装返回给前台的数据
 */
public class PageReturn<T> {

    private int code;
    private Object data;
    private String msg;
    private Boolean success;


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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "PageSelectOne{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                ", success='" + success + '\'' +
                '}';
    }
}
