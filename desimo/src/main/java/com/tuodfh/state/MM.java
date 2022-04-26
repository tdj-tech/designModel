package com.tuodfh.state;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class MM {

    MMState state;

    public MM() {
    }

    public MM(MMState state) {
        this.state = state;
    }

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }

}
