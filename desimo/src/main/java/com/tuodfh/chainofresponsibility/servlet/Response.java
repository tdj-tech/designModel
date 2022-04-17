package com.tuodfh.chainofresponsibility.servlet;

/**
 * @author tdj
 * 2022/4/17 0017
 * 相应对象
 */
public class Response {

    private String respMsg;

    public Response() {
    }

    public Response(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }
}
