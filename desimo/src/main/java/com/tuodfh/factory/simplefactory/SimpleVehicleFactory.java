package com.tuodfh.factory.simplefactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * 简单工场可扩展性不好，每新增交通工具，都得新增一个方法，并且里面的处理逻辑也被写死
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        // 添加自己的处理逻辑，如加权限、修饰、日志等
        return new Car();
    }

    public Plane createPlane() {
        // 添加自己的处理逻辑，如加权限、修饰、日志等
        return new Plane();
    }

}
