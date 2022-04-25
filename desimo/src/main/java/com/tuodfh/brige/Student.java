package com.tuodfh.brige;

/**
 * @author tdj
 * 2022/4/25 0025
 * @desc
 */
public class Student {

    public void sendGift(AbstractGift gift, Teacher teacher) {
        System.out.println("teacher get a " + gift.getName() + "礼物");
    }

}
