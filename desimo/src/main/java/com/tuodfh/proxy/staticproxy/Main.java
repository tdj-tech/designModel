package com.tuodfh.proxy.staticproxy;

/**
 * @author tdj
 * 2022/4/21 0021
 * 静态代理
 */
public class Main {

    public static void main(String[] args) {
        Moveble proxy = new LogProxy(new TimeProxy(new Car()));
        proxy.move();
        System.out.println("=============================");
        Moveble proxy2 = new TimeProxy(new LogProxy(new Car()));
        proxy2.move();
    }

}
