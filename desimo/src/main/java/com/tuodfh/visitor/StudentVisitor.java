package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * 学生一族
 */
public class StudentVisitor extends AbstractComputerVisitor {
    @Override
    double visitCPU(CPU cpu) {
        return cpu.getPrice() * 0.9;
    }

    @Override
    double visitBord(Bord bord) {
        return bord.getPrice() * 0.8;
    }

    @Override
    double visitMemory(Memory memory) {
        return memory.getPrice() * 0.7;
    }
}
