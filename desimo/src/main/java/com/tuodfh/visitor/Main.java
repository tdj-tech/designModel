package com.tuodfh.visitor;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        AbstractComputerPart computer = new Computer();
        System.out.println("电脑原价：" + computer.getPrice() + "元");
        double studentPrice = computer.acceptVisitor(new StudentVisitor());
        System.out.println("电脑学生价：" + studentPrice + "元");
        double workerPrice = computer.acceptVisitor(new WorkerVisitor());
        System.out.println("电脑上班族价：" + workerPrice + "元");
    }

}
