package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
abstract class AbstractComputerVisitor {

    abstract double visitCPU(CPU cpu);

    abstract double visitBord(Bord bord);

    abstract double visitMemory(Memory memory);

}
