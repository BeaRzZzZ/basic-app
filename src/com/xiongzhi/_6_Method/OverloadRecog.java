package com.xiongzhi._6_Method;

public class OverloadRecog {
    // 重载方法只关心方法名称是否相同，修饰符不同不影响它是重载
    public static void open(){}

    public static void open(int a){// 重载方法

    }
    static void open(int a, int b){} // 重载方法

    public static void open(double a, double b){} // 重载方法，行参列表不同

    public static void open(int a, double b){ // 重载方法
    }

    //public void open(int i, double d){} // 和上面冲突，因为形参只是名字不同，重要的是形参的类型不同

    public static void OPEN(){} // 区分大小写，并不是重载
}


