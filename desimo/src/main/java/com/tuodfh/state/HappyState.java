package com.tuodfh.state;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class HappyState extends MMState {
    @Override
    void smile() {
        System.out.println("happy smile");
    }

    @Override
    void cry() {
        System.out.println("happy cry");
    }

    @Override
    void say() {
        System.out.println("happy say");
    }
}
