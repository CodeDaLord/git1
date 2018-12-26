package com.qf.sc.common;

import java.io.Serializable;

//业务异常
public class AppExeption extends RuntimeException {

    private Integer keycode;
    private String message;

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

    public AppExeption() {
    }

    public AppExeption(Integer keycode, String message) {
        this.keycode = keycode;
        this.message = message;
    }
}
