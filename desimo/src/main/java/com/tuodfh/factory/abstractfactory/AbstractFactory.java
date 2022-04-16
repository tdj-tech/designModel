package com.tuodfh.factory.abstractfactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * 抽象工厂
 */
abstract class AbstractFactory {

    abstract AbstractVehicle createVehicle();

    abstract AbstractFood createFood();

    abstract AbstractWepon createWepon();

}
