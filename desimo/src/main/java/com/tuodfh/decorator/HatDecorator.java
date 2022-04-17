package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * 帽子
 */
public class HatDecorator extends AbstractPerson {

    private AbstractPerson person;

    public HatDecorator(AbstractPerson person) {
        this.person = person;
    }

    @Override
    void intruduce() {
        person.intruduce();
        System.out.println("i wear a hat.");
    }
}
