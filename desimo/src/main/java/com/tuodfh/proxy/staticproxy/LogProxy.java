package com.tuodfh.proxy.staticproxy;

/**
 * @author tdj
 * 2022/4/21 0021
 * @desc
 */
public class LogProxy implements Moveble {

    Moveble moveble;

    public LogProxy() {
    }

    public LogProxy(Moveble moveble) {
        this.moveble = moveble;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        moveble.move();
        System.out.println("moving end.");
    }
}
