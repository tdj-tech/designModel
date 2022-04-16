package com.tuodfh.factory.abstractfactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * 魔法工厂
 */
public class MagicFactory extends AbstractFactory {
    @Override
    AbstractVehicle createVehicle() {
        // 添加自己的处理逻辑，如加权限、修饰、日志等
        return new Broom();
    }

    @Override
    AbstractFood createFood() {
        return new Mushroom();
    }

    @Override
    AbstractWepon createWepon() {
        return new Rod();
    }
}
