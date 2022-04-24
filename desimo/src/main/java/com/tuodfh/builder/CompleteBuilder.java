package com.tuodfh.builder;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class CompleteBuilder implements ComputerBuilder {

    Computer computer = new Computer();

    @Override
    public ComputerBuilder buildMouse() {
        computer.mouse = new Mouse();
        return this;
    }

    @Override
    public ComputerBuilder buildKeyBoard() {
        computer.keyBoard = new KeyBoard();
        return this;
    }

    @Override
    public ComputerBuilder buildMonitor() {
        computer.monitor = new Monitor();
        return this;
    }

    @Override
    public Computer build() {
        return computer;
    }
}
