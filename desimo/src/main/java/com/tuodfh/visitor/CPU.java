package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class CPU extends AbstractComputerPart {

    @Override
    double acceptVisitor(AbstractComputerVisitor visitor) {
        return visitor.visitCPU(this);
    }

    @Override
    double getPrice() {
        return 1500;
    }
}
