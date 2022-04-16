package com.tuodfh.factory.factorymethod;

import com.tuodfh.factory.simplefactory.Car;
import com.tuodfh.factory.simplefactory.Moveble;

/**
 * @author tdj
 * 2022/4/16 0016
 * 汽车工厂
 */
public class CarFactory {

    public Moveble create() {
        // 添加自己的处理逻辑，如加权限、修饰、日志等
        return new Car();
    }

}
