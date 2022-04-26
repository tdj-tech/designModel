package com.tuodfh.prototype;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class MainString {

    public static void main(String[] args) {
        LocBuffer loc = new LocBuffer(new StringBuffer("beijing"), 0);
        try {
            LocBuffer loc1 = (LocBuffer) loc.clone();
            // 此时string是new出来的，具有独立的内存空间去指向常量池，克隆对象指向同样内存空间
            System.out.println(loc.stree == loc1.stree);
            loc.stree.reverse();
            System.out.println(loc1.stree);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
