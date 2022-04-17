package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * 学生
 */
public class Student extends AbstractPerson {

    @Override
    void intruduce() {
        System.out.println("i am a student.");
    }
}
