package com.tuodfh.factory.factorymethod;

import com.tuodfh.factory.simplefactory.Moveble;
import com.tuodfh.factory.simplefactory.Plane;

/**
 * @author tdj
 * 2022/4/16 0016
 * 飞机工厂
 */
public class PlaneFactory {

    public Moveble create() {
        return new Plane();
    }

}
