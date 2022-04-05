package com.xiongzhi._2_operator;

public class OperatorDemo3 {
    public static void main(String[] args) {
        // 短路与和短路或, && 的第一个条件是false就直接不执行后面了，结果肯定为false，节省运算，｜｜第一个为true就不计算后面，结果肯定为true
        // 与 &  或 ｜ 就是初始版本，不管情况如何都运算
        int a = 10;
        int b = 20;
        System.out.println(a > 100 && ++b > 10); // b没有执行，也就是前面的条件没有达成后面就不运行，所以b还是20
        System.out.println(b);
        System.out.println(a > 100 & ++b > 10);
        System.out.println(b); // b = 21

        int i = 10;
        int j = 20;
        System.out.println(i > 2 || --j < 10); // true, 并且后者不运行，即j不会做自减运算
        System.out.println(j);

        // 三元运算符, 格式：条件表达式 ? 值1 : 值2   true返回值1，false返回值2

        int a1 = 10;
        int b1 = 2000;
        int c1 = a1 > b1 ? a1 : b1;
        System.out.println(c1);

        //得出三个数中的最大值
        int a2 = 10;
        int b2 = 20;
        int c2 = 30;
        int rs = a2 > b2 ? (a2 > c2 ? a2 : c2) :(b2 > c2 ? b2 : c2);
        System.out.println(rs);
    }
}
