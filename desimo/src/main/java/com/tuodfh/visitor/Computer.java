package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Computer extends AbstractComputerPart {

    AbstractComputerPart cpu = new CPU();
    AbstractComputerPart bord = new Bord();
    AbstractComputerPart memory = new Memory();

    @Override
    double acceptVisitor(AbstractComputerVisitor visitor) {
        double cpuPrice = cpu.acceptVisitor(visitor);
        double bordPrice = bord.acceptVisitor(visitor);
        double memoryPrice = memory.acceptVisitor(visitor);
        return cpuPrice + bordPrice + memoryPrice;
    }

    @Override
    double getPrice() {
        double cpuPrice = cpu.getPrice();
        double bordPrice = bord.getPrice();
        double memoryPrice = memory.getPrice();
        return cpuPrice + bordPrice + memoryPrice;
    }
}
