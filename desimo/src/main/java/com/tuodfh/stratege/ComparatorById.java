package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * id排序
 */
public class ComparatorById implements Comparator<Student> {

    @Override
    public int compara(Student o1, Student o2) {
        return o1.getId() - o2.getId();
    }
}
