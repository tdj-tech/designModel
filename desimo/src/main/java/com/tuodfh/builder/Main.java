package com.tuodfh.builder;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Computer computer = new CompleteBuilder()
                .buildMouse()
                .buildKeyBoard()
                .buildMonitor()
                .build();
        System.out.println(computer);
        System.out.println("===================");
        Person person = new Person.PersonBuilder().baseInfo("张三", 28, 1)
                .height(180)
                .weight(150)
                .loc("乐园路", 86)
                .build();
        System.out.println(person);
    }

}
