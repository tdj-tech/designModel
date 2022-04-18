package com.tuodfh.observer;

import java.awt.Event;

/**
 * @author tdj
 * 2022/4/18 0018
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.addObserver(new Dad());
        ObserverChain chain = new ObserverChain();
        chain.addObserver(new Mother())
                .addObserver(new Sister());
        child.addObserver(chain);
        child.wakeUp();
    }

}
