package com.tuodfh.builder;

import javax.lang.model.type.ErrorType;

/**
 * @author tdj
 * 2022/4/24 0024
 * @desc
 */
public class Person {
    long id;
    String name;
    int age;
    int sex;
    int height;
    int weight;
    Loc loc;

    private Person(){}

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", loc=").append(loc);
        sb.append('}');
        return sb.toString();
    }

    public static class PersonBuilder{

        private Person person = new Person();

        PersonBuilder baseInfo(String name, int age, int sex) {
            person.name = name;
            person.age = age;
            person.sex = sex;
            return this;
        }

        PersonBuilder height(int height) {
            person.height = height;
            return this;
        }

        PersonBuilder weight(int weight) {
            person.weight = weight;
            return this;
        }

        PersonBuilder loc(String street, int streetNo) {
            person.loc = new Loc(street, streetNo);
            return this;
        }

        Person build() {
            return person;
        }
    }

}

class Loc{
    String street;
    int streetNo;

    public Loc() {
    }

    public Loc(String street, int streetNo) {
        this.street = street;
        this.streetNo = streetNo;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Loc{");
        sb.append("street='").append(street).append('\'');
        sb.append(", streetNo=").append(streetNo);
        sb.append('}');
        return sb.toString();
    }
}