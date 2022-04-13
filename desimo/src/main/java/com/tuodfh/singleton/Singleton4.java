package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可用通过加synchronized字段解决，但也带来效率下降
 */
public class Singleton4 {

    private static Singleton4 INSTANCE;

    private Singleton4() {};

    /**
     * 多线程的情况下，多个线程等待拿锁，不停的拿锁，释放锁，效率下降
     * @return Singleton4
     */
    public static synchronized Singleton4 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }

}
