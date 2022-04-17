package com.tuodfh.chainofresponsibility.servlet;

/**
 * @author tdj
 * 2022/4/17 0017
 * 请求对象
 */
public class Request {

    private String reqMsg;

    public Request() {
    }

    public Request(String reqMsg) {
        this.reqMsg = reqMsg;
    }

    public String getReqMsg() {
        return reqMsg;
    }

    public void setReqMsg(String reqMsg) {
        this.reqMsg = reqMsg;
    }
}
