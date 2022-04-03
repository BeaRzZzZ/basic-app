package com.xiongzhi._2_operator;

public class OperatorDemo1 {
    //  主要是讨论一下Java中的除法，其实运算结果总是以运算数范围大的那个作为结果（防止溢出），所以10/3=3
    public static void main(String[] args) {
        int a = 10, b = 3;
        System.out.println(a/b); // 3
        System.out.println(a*1.0/b); // 如果想保留小数可以这样
        System.out.println(a/b * 1.0); //这样前面的运算已经导致数据的丢失了，后面已经没有了 - 3.0


        // 应用：三位数的个/十/百
        int x = 589;
        int ge = x%10;
        int shi = x / 10 % 10;
        int bai = x / 100;
        System.out.println("百位:"+bai+"\n十位:"+shi+"\n个位:"+ge);
    }
}
