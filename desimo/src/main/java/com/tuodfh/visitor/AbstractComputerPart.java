package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
abstract class AbstractComputerPart {

    abstract double acceptVisitor(AbstractComputerVisitor visitor);

    abstract double getPrice();
}
