package com.tuodfh.chainofresponsibility.servlet;

/**
 * @author tdj
 * 2022/4/17 0017
 * 过滤器
 */
public interface Filter {

    void doFilter(Request request, Response response, FilterChain filter);

}
