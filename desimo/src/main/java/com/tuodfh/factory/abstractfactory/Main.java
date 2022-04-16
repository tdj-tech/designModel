package com.tuodfh.factory.abstractfactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        // 此时实现任意定制产品一族，新增一族时，只需换个工厂即可
        AbstractFactory factory = new MagicFactory();
        AbstractVehicle vehicle = factory.createVehicle();
        vehicle.move();
        AbstractFood food = factory.createFood();
        food.eat();
        AbstractWepon wepon = factory.createWepon();
        wepon.shoot();
    }

}
