package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

/**
 * @author tdj
 * 2022/4/17 0017
 * 简单的一个过滤链，实际的客户端到服务端请求不是这样
 */
public class Main {

    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("我是tuo, :)，<div> 大家都是996。");
        FilterChain1 filterChain1 = new FilterChain1();
        filterChain1.addFilter(new HtmlFilter())
                .addFilter(new SensitiveFilter())
                .addFilter(new SpecialSymbolFilter());
        filterChain1.doFilter(msg);
        System.out.println(msg.getMsg());
    }


}
