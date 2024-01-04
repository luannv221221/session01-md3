package com.ra.session01.model;

public class Student {
    private String studentCode;
    private String studentName;
    private int age;
    private boolean sex;

    public Student() {
    }

    public Student(String studentCode, String studentName, int age, boolean sex) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
