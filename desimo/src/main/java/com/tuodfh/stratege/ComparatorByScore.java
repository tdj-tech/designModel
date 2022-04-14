package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * 分数排序
 */
public class ComparatorByScore implements Comparator<Student> {
    @Override
    public int compara(Student o1, Student o2) {
        return o1.getScore() - o2.getScore();
    }
}
