package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * 浅克隆
 */
public class Main {

    public static void main(String[] args) {
        Loc loc = new Loc("ces", 12);
        Person person = new Person(12, 2, loc);
        try {
            Person person1 = (Person) person.clone();
            System.out.println(person == person1);
            System.out.println(person.age == person1.age);
            System.out.println(person.sex == person1.sex);
            // loc对象是同一个
            System.out.println(person.loc == person1.loc);
            System.out.println(person.loc.stree == person1.loc.stree);
            // 此时改变loc对象的属性值，克隆对象里的loc也跟着改变
            System.out.println("=================");
            person.loc.stree = "ggg";
            System.out.println(person1.loc.stree);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
