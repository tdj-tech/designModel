package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Bord extends AbstractComputerPart {
    @Override
    double acceptVisitor(AbstractComputerVisitor visitor) {
        return visitor.visitBord(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}
