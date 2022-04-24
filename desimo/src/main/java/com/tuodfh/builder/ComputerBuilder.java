package com.tuodfh.builder;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public interface ComputerBuilder {

    ComputerBuilder buildMouse();
    ComputerBuilder buildKeyBoard();
    ComputerBuilder buildMonitor();
    Computer build();

}
