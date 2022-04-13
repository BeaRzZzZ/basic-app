package com.xiongzhi._9_ArrayList;

import java.util.ArrayList;

public class Student {
    private String name;
    private String number;
    private int age;
    private String classInfo;

    public Student() {
    }

    public Student(String name, String number, int age, String classInfo) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.classInfo = classInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassInfo() {
        return classInfo;
    }

    public void setClassInfo(String classInfo) {
        this.classInfo = classInfo;
    }
}
