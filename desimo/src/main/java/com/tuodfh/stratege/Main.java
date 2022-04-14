package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * @desc
 */
public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student(1, 12, 120);
        students[1] = new Student(5, 17, 78);
        students[2] = new Student(2, 2, 96);
        students[3] = new Student(4, 30, 34);
        students[4] = new Student(3, 23, 110);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("====================");
        Sorter<Student> sorter = new Sorter<>();
        sorter.sort(students, new ComparatorById());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("====================");
        sorter.sort(students, new ComparatorByAge());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("====================");
        sorter.sort(students, new ComparatorByScore());
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

    }

}
