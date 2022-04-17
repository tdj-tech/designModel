package com.tuodfh.chainofresponsibility;

/**
 * @author tdj
 * 2022/4/17 0017
 * 消息对象
 */
public class Msg {

    private String msg;

    private String name;

    public Msg() {
    }

    public Msg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Msg{");
        sb.append("msg='").append(msg).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
