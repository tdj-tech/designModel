package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可用通过加synchronized字段解决，但也带来效率下降
 */
public class Singleton5 {

    private static Singleton5 INSTANCE;

    private Singleton5() {};

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            // 妄图通过减小同步代码块的方式提高效率，然而不可行，多线程下，多个线程进入if条件，拿到锁后同样会创建多个对象
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }

}
