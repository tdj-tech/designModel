package com.tuodfh.singleton;

/**
 * @author tdj
 * 2022/4/13 0013
 * 饿汉模式
 * 类加载到内存后，就实例化一个实例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管用到与否，类加载时就完成实例化（话说你要是不用，你装载它干啥）
 */
public class Singleton1 {

    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){};

    public static Singleton1 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }

}






