package com.tuodfh.proxy.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tdj
 * 2022/4/22 0022
 * 注解切面
 */
public class Main1 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app1.xml");
        Car car = (Car) context.getBean("car");
        car.move();
    }

}
