package com.xiongzhi.type;

public class TypeDemo2 {
    public static void main(String[] args) {
        //  强制类型转换
        int a = 20;
        byte b = (byte)a; /*byte的范围是[-128,127]，没有超出这个范围的强转没问题，
                        超出这个范围就会强制取后面的几位，根据强转后的类型定，第一位是符号位*/

        //强转导致的数据溢出
        int a1 = 1500;
        byte b1 = (byte)a1;//b1=-36
        System.out.println(b1);

        //浮点强转整型会直接丢掉小数部分，保留整数部分
        double score = 99.5;
        int it = (int)score;
        System.out.println(it);//it = 99
    }
}
