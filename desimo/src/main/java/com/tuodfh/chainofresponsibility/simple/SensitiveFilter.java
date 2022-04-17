package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

/**
 * @author tdj
 * 2022/4/17 0017
 * 敏感词过滤器
 */
public class SensitiveFilter implements SimpleFilter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replaceAll("996", "955");
        msg.setMsg(s);
        return true;
    }
}
