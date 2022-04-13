package com.xiongzhi._8_String;

public class mianshi {
    public static void main(String[] args) {
        // 常见面试题1：
        String s2 = new String("abc"); // 创建了两个对象，"abc"是存在常量池的，new出来的对象放在堆内存

        String s1 = "abc"; // 这个是指向常量池的
        System.out.println(s1==s2); // false，s2是指向堆内存的

        // 常见面试题2：
        System.out.println("===============");
        String ss1 = "abc"; // 位于常量池
        String ss2 = "ab"; // 位于常量池
        String ss3 = ss2 + "c"; // 只要不是""直接给出来的，都是放在堆内存中进行计算生成新的对象
        System.out.println(ss1 == ss3); // false

        // 常见面试题3：
        System.out.println("===============");
        String sss1 = "abc"; // 位于常量池
        String sss2 = "a" + "b" + "c"; // 这个在赋值阶段和上面的情况不同，java的编译优化会直接把=右边的转成"abc"（提高效率）
        System.out.println(sss1 == sss2); // true

        //涉及到变量的运算，编译器不能确定具体的值，要真正运行之后，在内存中分配之后才知道，但是在赋值阶段如果都是确定，那就没必要
        //在运行的时候再消耗资源

    }
}
