package com.qf.sc.result;

import java.io.Serializable;

// 同意 返回结果
public class AppResult implements Serializable{

    private boolean isSuccess;
    private Integer keycode;
    private String message;
    private Object Data;

    public AppResult() {

    }

    public AppResult(boolean isSuccess, Integer keycode, String message, Object data) {
        this.isSuccess = isSuccess;
        this.keycode = keycode;
        this.message = message;
        Data = data;
    }

    public boolean isSuccess() {

        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Integer getKeycode() {
        return keycode;
    }

    public void setKeycode(Integer keycode) {
        this.keycode = keycode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
