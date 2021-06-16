package com.guireis.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer statusCode;
    private String msg;
    private Long timeStapam;

    public StandardError(Integer statusCode, String msg, Long timeStapam) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.timeStapam = timeStapam;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Long getTimeStapam() {
        return this.timeStapam;
    }

    public void setTimeStapam(Long timeStapam) {
        this.timeStapam = timeStapam;
    }

}
