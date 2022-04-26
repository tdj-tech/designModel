package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * 深克隆
 */
public class Mainw {

    public static void main(String[] args) {
        LocW locW = new LocW("深克隆", 22);
        PersonW personW = new PersonW(12, 0, locW);
        try {
            PersonW personW1 = (PersonW) personW.clone();
            // 此时两个对象的loc分别指向不同的内存空间
            System.out.println(personW.loc == personW1.loc);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
