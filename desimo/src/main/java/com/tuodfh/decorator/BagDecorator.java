package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * 书包构造器
 */
public class BagDecorator extends AbstractPerson {

    private AbstractPerson person;

    public BagDecorator(AbstractPerson person) {
        this.person = person;
    }

    @Override
    void intruduce() {
        person.intruduce();
        System.out.println("i have a bag.");
    }
}
