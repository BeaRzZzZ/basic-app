package com.xiongzhi.type;


//此单元为变量类型的自动转换，范围小的变量类型可以转换为范围大的，反之不行
public class TypeDemo1 {
    public static void main(String[] args) {
        /* Java的4种整型（范围从小打大）：byte（字节数1），short（2），int（4），long（8）
        具体可以参考：https://blog.csdn.net/weixin_39806100/article/details/103940926
         */
        byte a = 10;
        int b = a;  //发生自动类型转换

        int age = 23;
        double c = age; // c = 23.0

        char ch = 'a';  //字符和字符串底层都是用二进制表示的，所以可以直接转换为int或者比int范围高的数据类型
        int code = ch;
        System.out.println(code);

        byte a1 = 10;
        int b1 = 20;
        double c1 = 30.0;
        double result = a1 + b1 + c1;   //这里不能用int或者byte，因为不同类型的变量运算结果要以范围最高的那个为结果
        System.out.println(result);

        //面试题
        byte a2 = 10;
        byte b2 = 20;
        int c2 = a2 + b2; //byte c2 = a2 + b2会报错因为byte, short, char在运算中是当int算的
        //因为单独赋值没问题，但是如果加在一起可能会会超过取值范围，为了避免直接升为int

    }
}
