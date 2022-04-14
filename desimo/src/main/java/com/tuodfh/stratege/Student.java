package com.tuodfh.stratege;

/**
 * @author tdj
 * 2022/4/14 0014
 * 学生类
 */
public class Student {

    /**
     * 序号
     */
    private int id;
    /**
     * 年龄
     */
    private int age;
    /**
     * 分数
     */
    private int score;

    public Student() {
    }

    public Student(int id, int age, int score) {
        this.id = id;
        this.age = age;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("id=").append(id);
        sb.append(", age=").append(age);
        sb.append(", score=").append(score);
        sb.append('}');
        return sb.toString();
    }

    public void setScore(int score) {
        this.score = score;
    }
}
