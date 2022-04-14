package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * 年龄排序
 */
public class ComparatorByAge implements Comparator<Student> {
    @Override
    public int compara(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
