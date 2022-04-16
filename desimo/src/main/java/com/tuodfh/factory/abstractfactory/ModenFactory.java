package com.tuodfh.factory.abstractfactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * 现代工厂，生产现代产品
 */
public class ModenFactory extends AbstractFactory {
    @Override
    AbstractVehicle createVehicle() {
        // 添加自己的处理逻辑，如加权限、修饰、日志等
        return new Car();
    }

    @Override
    AbstractFood createFood() {
        return new Bread();
    }

    @Override
    AbstractWepon createWepon() {
        return new AK47();
    }
}
