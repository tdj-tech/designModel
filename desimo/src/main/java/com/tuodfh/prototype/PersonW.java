package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class PersonW implements Cloneable {

    int age;
    int sex;
    LocW loc;

    public PersonW() {
    }

    public PersonW(int age, int sex, LocW loc) {
        this.age = age;
        this.sex = sex;
        this.loc = loc;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PersonW personW = (PersonW) super.clone();
        personW.loc = (LocW) loc.clone();
        return personW;
    }

}

class LocW implements Cloneable {
    String stree;
    int no;

    public LocW() {
    }

    public LocW(String stree, int no) {
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
