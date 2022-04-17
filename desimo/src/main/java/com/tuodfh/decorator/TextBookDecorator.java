package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * 课本
 */
public class TextBookDecorator extends AbstractPerson {

    private AbstractPerson person;

    public TextBookDecorator(AbstractPerson person) {
        this.person = person;
    }

    @Override
    void intruduce() {
        person.intruduce();
        System.out.println("i take some textBooks.");
    }
}
