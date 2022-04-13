package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时，不会加载内部类，这样可以实现懒加载
 */
public class Singleton7 {

    private static class Singleton7Holder {
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance() {
        return Singleton7Holder.INSTANCE;
    }

}
