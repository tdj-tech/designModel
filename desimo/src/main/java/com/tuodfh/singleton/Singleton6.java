package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 * 可用通过加synchronized字段解决，但也带来效率下降
 */
public class Singleton6 {

    // 必须得加，原因时指令重排序，会导致对象先创建出来，而属性还未初始化
    private static volatile Singleton6 INSTANCE;

    private Singleton6() {};

    public static Singleton6 getInstance() {
        if (INSTANCE == null) {
            // 双重检查，这个即使多个线程进入if，在拿到锁后，再加个判断，这样就避免了创建
            synchronized (Singleton6.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton6();
                }
            }
        }
        return INSTANCE;
    }

}
