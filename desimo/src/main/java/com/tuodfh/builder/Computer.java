package com.tuodfh.builder;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Computer {

    Mouse mouse;
    KeyBoard keyBoard;
    Monitor monitor;

}

class Mouse{
    double price;

    public Mouse() {
    }

    public Mouse(double price) {
        this.price = price;
    }
}

class KeyBoard{
    double price;

    public KeyBoard() {
    }

    public KeyBoard(double price) {
        this.price = price;
    }
}

class Monitor{
    double price;

    public Monitor() {
    }

    public Monitor(double price) {
        this.price = price;
    }
}
