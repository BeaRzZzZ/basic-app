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

    }
}
