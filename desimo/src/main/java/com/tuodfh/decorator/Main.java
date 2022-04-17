package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        AbstractPerson student = new Student();
        new RedScarfDecorator(new BagDecorator(new HatDecorator(student))).intruduce();
        System.out.println("====================");
        new BagDecorator(new RedScarfDecorator(new HatDecorator(student))).intruduce();
        System.out.println("====================");
        new HatDecorator(new BagDecorator(new TextBookDecorator(new Teacher()))).intruduce();
    }

}
