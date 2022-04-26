package com.tuodfh.templatemethod;

/**
 * @author tdj
 * 2022/4/26 0026
 * 模板方法
 */
public class Main {

    public static void main(String[] args) {
        // 即是钩子函数暴露出来让你重写,其内部某个方法里调用了该钩子函数，当条件满足时，
        // 系统就会调用该方法从而触发钩子函数
        GG gg = new GG();
        gg.m();
    }

}

abstract class F {
    // 我定义好了一个模板方法m，里面先调p1,再调用p2，然而我没有写实现，任何实现了该方法的
    // 子类，将来在调用m方法的时候，该方法都会被执行到，这就是所谓的钩子函数
    void m(){
        p1();
        p2();
    }

    abstract void p1();
    abstract void p2();

}

class GG extends F {

    @Override
    void p1() {
        System.out.println("p1");
    }

    @Override
    void p2() {
        System.out.println("p2");
    }
}
