package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * lazy loading
 * 也称懒汉式
 * 虽然达到了按需初始化的目的，但却带来线程不安全的问题
 */
public class Singleton3 {

    private static Singleton3 INSTANCE;

    private Singleton3() {};

    public static Singleton3 getInstance() {
        // 多线程下，多个线程进入if条件，就会创建多个对象
        if (INSTANCE == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(Singleton3.getInstance().hashCode());
            }).start();
        }
    }

}
