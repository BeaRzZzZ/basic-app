package com.xiongzhi._7_Object;

public class JavaBean {
    // JavaBean的书写要求：1. 成员变量private 2. 必须位成员变量提供setter和getter方法 3. 要求提供无参构造器，有参构造器是可选的

    private String name;
    private double height;
    private double salary;

    // 无参构造器（必有）
    public JavaBean() {
    }

    // 有参构造器（可以没有）
    public JavaBean(String name, double height, double salary) {
        this.name = name;
        this.height = height;
        this.salary = salary;
    }

    // 所有成员变量的setter和getter方法，在实际开发中可以不用考虑数据合法性，因为网页中通常已经限制了
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
