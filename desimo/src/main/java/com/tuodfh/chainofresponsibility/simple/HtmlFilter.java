package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

/**
 * @author tdj
 * 2022/4/17 0017
 * 网页过滤器
 */
public class HtmlFilter implements SimpleFilter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replaceAll("<", "[");
        s = s.replaceAll(">", "]");
        msg.setMsg(s);
        return true;
    }
}
