package com.tuodfh.factory.simplefactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * 飞机
 */
public class Plane implements Moveble {
    @Override
    public void move() {
        System.out.println("fly......");
    }
}
