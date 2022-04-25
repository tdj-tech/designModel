package com.tuodfh.brige;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        AbstractGift coldGift = new ColdGift(new Car());
        student.sendGift(coldGift, teacher);
        System.out.println("=================");
        AbstractGift wormGift = new WormGift(new Flower());
        student.sendGift(wormGift, teacher);
    }

}
