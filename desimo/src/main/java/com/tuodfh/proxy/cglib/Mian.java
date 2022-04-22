package com.tuodfh.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author tdj
 * 2022/4/22 0022
 * cglib来生成动态代理，功能比jdk的代理强大，被代理类无需实现接口
 * 其缺点是如果代理类是final修饰的，那么cglib也代理不了
 */
public class Mian {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Car.class);
        enhancer.setCallback(new MethodInterceptor() {
            // obj就是cglib生成的代理类，它是car的子类
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println(obj.getClass().getSuperclass().getName());
                System.out.println("car is starting...");
                Object o = proxy.invokeSuper(obj, args);
                System.out.println("car is stop.");
                return o;
            }
        });
        Car car = (Car) enhancer.create();
        car.move();
    }

}
