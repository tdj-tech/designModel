package com.tuodfh.proxy.staticproxy;

/**
 * @author tdj
 * 2022/4/21 0021
 * @desc
 */
public class TimeProxy implements Moveble {

    Moveble moveble;

    public TimeProxy() {
    }

    public TimeProxy(Moveble moveble) {
        this.moveble = moveble;
    }

    @Override
    public void move() {
        System.out.println(System.currentTimeMillis());
        moveble.move();
        System.out.println(System.currentTimeMillis());
    }
}
