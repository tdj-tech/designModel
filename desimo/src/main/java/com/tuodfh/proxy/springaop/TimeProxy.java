package com.tuodfh.proxy.springaop;

/**
 * @author tdj
 * 2022/4/22 0022
 * @desc
 */
public class TimeProxy {

    public void before() {
        System.out.println(System.currentTimeMillis());
    }

    public void after() {
        System.out.println(System.currentTimeMillis());
    }

}
