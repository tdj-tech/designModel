package com.tuodfh.chainofresponsibility.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tdj
 * 2022/4/17 0017
 * 过滤链
 */
public class FilterChain implements Filter {

    List<Filter> filters = new ArrayList<>();

    int index = 0;

    @Override
    public void doFilter(Request request, Response response, FilterChain filterChain) {
        if (index == filters.size()) {
            return;
        }
        Filter filter1 = filters.get(index);
        index++;
        filter1.doFilter(request, response, this);
    }

    public FilterChain addFilter(Filter filter) {
        filters.add(filter);
        return this;
    }


    public FilterChain removeFilter(Filter filter) {
        filters.remove(filter);
        return this;
    }

}
