package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * 上班一族
 */
public class WorkerVisitor extends AbstractComputerVisitor {
    @Override
    double visitCPU(CPU cpu) {
        return cpu.getPrice() * 0.95;
    }

    @Override
    double visitBord(Bord bord) {
        return bord.getPrice() * 0.9;
    }

    @Override
    double visitMemory(Memory memory) {
        return memory.getPrice() * 0.85;
    }
}
