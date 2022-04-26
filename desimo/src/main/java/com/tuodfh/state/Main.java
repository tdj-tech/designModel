package com.tuodfh.state;

/**
 * @author tdj
 * 2022/4/26 0026
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        MM mm = new MM(new HappyState());
        mm.smile();
        mm.cry();
        mm.say();
        System.out.println("===================");
        MM mm1 = new MM(new SadState());
        mm1.smile();
        mm1.cry();
        mm1.say();
    }

}
