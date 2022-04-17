package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

/**
 * @author tdj
 * 2022/4/17 0017
 * 特殊符号过滤器
 */
public class SpecialSymbolFilter implements SimpleFilter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replaceAll(":\\)", "^v^");
        msg.setMsg(s);
        return false;
    }
}
