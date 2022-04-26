package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * 必须得实现cloneable接口，不实现虽然不会报错，但运行会抛异常
 */
public class Person implements Cloneable {

    int age;
    int sex;
    Loc loc;

    public Person() {
    }

    public Person(int age, int sex, Loc loc) {
        this.age = age;
        this.sex = sex;
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Loc {
    String stree;
    int no;

    public Loc() {
    }

    public Loc(String stree, int no) {
        this.stree = stree;
        this.no = no;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Loc{");
        sb.append("stree='").append(stree).append('\'');
        sb.append(", no=").append(no);
        sb.append('}');
        return sb.toString();
    }
}
