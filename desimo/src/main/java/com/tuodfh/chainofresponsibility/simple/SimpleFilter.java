package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

/**
 * @author tdj
 * 2022/4/17 0017
 * 简单过滤器
 */
public interface SimpleFilter {

    boolean doFilter(Msg msg);

}
