package com.xiongzhi._2_operator;

import static java.lang.Character.getType;

public class OperatorDemo2 {
    public static void main(String[] args) {
        //  + 号作为连接符的一些情况, 原则为：能在数量上加则加，不能加则连接
         int a = 5;
        System.out.println("abc"+ 'a'); //abca
        System.out.println("abc" + a); //abc5
        System.out.println(5+a); // 10
        System.out.println("abc" + 5 + 'a'); // abc5a
        System.out.println(a + 'a'); //102
        System.out.println(a + "" + 'a'); // 5a

        byte x = 10;
        byte y = 20;
        x += y;
        System.out.println(getType(x));
    }

    public static String getType(Object o){
        return o.getClass().toString();
    }
}
