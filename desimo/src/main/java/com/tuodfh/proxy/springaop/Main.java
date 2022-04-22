package com.tuodfh.proxy.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tdj
 * 2022/4/22 0022
 * 配置文件切面
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Car car = (Car) context.getBean("carc");
        car.move();
    }

}
