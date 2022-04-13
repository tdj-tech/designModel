package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * 跟singleton1是一个意思
 */
public class Singleton2 {

    private static final Singleton2 INSTANCE;

    static {
        INSTANCE = new Singleton2();
    }

    private Singleton2(){};

    public static Singleton2 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton21 = Singleton2.getInstance();
        System.out.println(singleton2 == singleton21);
    }

}
