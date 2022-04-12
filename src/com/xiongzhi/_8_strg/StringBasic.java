package com.xiongzhi._8_strg;

public class StringBasic {
    public static void main(String[] args) {
        // String对象是不可变字符串，这里每次修改都指向了堆内存中的新的字符串对象（每次拼接新生成了一个String对象）
        String name = "点对点"; // 左边是推荐方式，还可以通过构造器生成
        name+="教育";
        name+="集团";
        name+="！";
        System.out.println(name);

        String s1 = new String("我是中国人！");

        char[] chars = {'a','b','中','国'};
        String s2 = new String(chars); // 会遍历char数组中的值并全部输出
        System.out.println(s2);

        byte[] bytes = {97,98,99,65,66,67};
        String s4 = new String(bytes); // 会把这些全部转换为对饮的字符
        System.out.println(s4);

        // 以 String name1 = "点对点"; String name2 = "点对点";因为内容形同，在堆内存中只会生成一个对象，
        // 两个变量名都指向同一个对象的地址，但是new生成的话就是两个
    }
}
