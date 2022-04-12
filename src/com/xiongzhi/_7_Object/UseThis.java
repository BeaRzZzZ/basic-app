package com.xiongzhi._7_Object;

public class UseThis {
    // this主要用于：给对象的成员变量赋值和在对象的方法中使用, 为了区分方法括号内的相同名字
    String name;
    double price;

    public UseThis(String name, double price){
        this.name = name; // 前面this.name 指的是对象的成员变量，后面的name是调用对象时赋的值，把值赋给成员变量
        this.price = price;
    }
    public void runWith(String name){
        System.out.println(this.name+"正在和"+name+"进行比赛！");
    }
}
