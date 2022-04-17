package com.tuodfh.chainofresponsibility.simple;

import com.tuodfh.chainofresponsibility.Msg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tdj
 * 2022/4/17 0017
 * 过滤链
 */
public class FilterChain1 implements SimpleFilter {

    List<SimpleFilter> filters = new ArrayList<>();

    @Override
    public boolean doFilter(Msg msg) {
        for (SimpleFilter filter : filters) {
            if (!filter.doFilter(msg)) {
                break;
            }
        }
        return true;
    }

    public FilterChain1 addFilter(SimpleFilter filter) {
        filters.add(filter);
        return this;
    }

    public FilterChain1 removeFilter(SimpleFilter filter) {
        filters.remove(filter);
        return this;
    }

}
