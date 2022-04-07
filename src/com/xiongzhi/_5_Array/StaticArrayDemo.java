package com.xiongzhi._5_Array;

public class StaticArrayDemo {
    /* 静态初始化数组格式： 数据类型[] 数组名 = new 数据类型[]{元素1，元素2，元素3};
     double[] scores = new double[]{88,9,99.5,60.0};
     int[] age = new int[]{12,24,36};
    简化版本 int[] age = {12,24,36};
            int age[] = {12,24,36};也可以
    对象的内存地址是连续的，并且数组名称存储的数组 在内存中的地址，数组是引用类型（存的是地址），数据类型 存的是值
    */
    public static void main(String[] args) {
        int ages[] = {12,24,36};
        // 取值： 数据名称[索引]
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }
        ages[2] = 100;

        /*
        动态初始化数组:double[] scores = new double[3];
        动态初始化的元素默认值：整型-0(char-0), float-0.0, boolean-false, String-null
         */

    }
}
