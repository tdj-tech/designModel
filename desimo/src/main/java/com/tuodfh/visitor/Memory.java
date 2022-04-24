package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Memory extends AbstractComputerPart {
    @Override
    double acceptVisitor(AbstractComputerVisitor visitor) {
        return visitor.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 600;
    }
}
