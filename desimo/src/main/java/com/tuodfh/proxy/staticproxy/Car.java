package com.tuodfh.proxy.staticproxy;

/**
 * @author tdj
 * 2022/4/21 0021
 * @desc
 */
public class Car implements Moveble {
    @Override
    public void move() {
        System.out.println("i am a car , i am moving!");
    }
}
