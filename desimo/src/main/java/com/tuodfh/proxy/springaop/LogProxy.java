package com.tuodfh.proxy.springaop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author tdj
 * 2022/4/22 0022
 * @desc
 */
@Aspect
public class LogProxy {

    @Before("execution(void com.tuodfh.proxy.springaop.Car.move())")
    public void before() {
        System.out.println("start moving...");
    }

    @After("execution(void com.tuodfh.proxy.springaop.Car.move())")
    public void after() {
        System.out.println("end moving.");
    }

}
