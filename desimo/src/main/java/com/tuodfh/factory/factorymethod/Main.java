package com.tuodfh.factory.factorymethod;

import com.tuodfh.factory.simplefactory.Moveble;

/**
 * @author tdj
 * 2022/4/16 0016
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        // 此时实现任意定制生产过程，新增生产过程，只需要new一个工厂即可
        Moveble vehicle = new CarFactory().create();
        vehicle.move();
    }

}
