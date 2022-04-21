package com.tuodfh.proxy.dynamicproxy;

import com.tuodfh.proxy.staticproxy.Car;
import com.tuodfh.proxy.staticproxy.Moveble;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author tdj
 * 2022/4/21 0021
 * 动态代理
 */
public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Moveble proxy = (Moveble) Proxy.newProxyInstance(Car.class.getClassLoader(),
                new Class[]{Moveble.class},
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("method " + method.getName() + " start...");
                        Object o = method.invoke(car, args);
                        System.out.println("method " + method.getName() + " end.");
                        return o;
                    }
                });
        proxy.move();
    }

}
