package com.tuodfh.factory.simplefactory;

/**
 * @author tdj
 * 2022/4/16 0016
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        // 此时实现任意定制交通工具，新增交通工具，实现Moveble接口即可
        Moveble moveble = new Car();
        moveble.move();
    }

}
