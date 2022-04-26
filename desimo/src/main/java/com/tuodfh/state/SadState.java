package com.tuodfh.state;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class SadState extends MMState {
    @Override
    void smile() {
        System.out.println("sad smile");
    }

    @Override
    void cry() {
        System.out.println("sad cry");
    }

    @Override
    void say() {
        System.out.println("sad say");
    }
}
