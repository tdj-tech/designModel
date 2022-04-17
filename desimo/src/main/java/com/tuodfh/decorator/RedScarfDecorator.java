package com.tuodfh.decorator;

/**
 * @author tdj
 * 2022/4/17 0017
 * 红领巾
 */
public class RedScarfDecorator extends AbstractPerson {

    private AbstractPerson person;

    public RedScarfDecorator(AbstractPerson person) {
        this.person = person;
    }

    @Override
    void intruduce() {
        person.intruduce();
        System.out.println("i wear a red scarf.");
    }
}
