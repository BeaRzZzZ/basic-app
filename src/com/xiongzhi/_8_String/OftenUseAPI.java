package com.xiongzhi._8_String;

public class OftenUseAPI {
    // 常见String的API的使用
    public static void main(String[] args) {
        //1. 获取字符串长度
        String name = "我爱你中国！！";
        System.out.println(name.length()); // 7

        //2. 获取某个索引值对应的字符
        char c = name.charAt(1);
        System.out.println(c);

        System.out.print("遍历字符串中的每个字符：");
        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i)+", ");
        }

        //3. 把字符串转换成字符数组
        System.out.println();
        char[] c1 = name.toCharArray();
        System.out.println(c1); // 基本类型数组遍历直接输出就行，对象类型数组要用循环才能遍历

        //4. 字符串截取，包前不包后
        String name2 = "Java是最厉害的编程语言！";
        System.out.println(name2.substring(0,9)); // Java是最厉害的
        System.out.println(name2.substring(9,13));// 编程语言

        // 5. 从某个索引值开始截取一直到字符串末尾,包括那个索引
        System.out.println(name2.substring(4)); // 是最厉害的编程语言！

        // 6. 字符串替换(敏感词)
        String name3 = "cnm";
        String rs = name3.replace("cnm", "***");
        System.out.println(rs); // ****

        // 7. 是否包含某段字符(串)
        System.out.println(name3.contains("nm")); // true
        System.out.println(name3.contains("cnmd")); // false

        // 8. 是否以某段字符(串)开始的
        System.out.println(name3.startsWith("cn")); // true
        System.out.println(name3.startsWith("kao")); // false

        // 9. 以某个字符为分割点，把一个字符串分割成字符串数组返回
        // 前端返回的是一个字符串，到那时你得把内容分割以后才能用
        String name4 = "王宝强，贾乃亮，陈羽凡";
        String[] rs4 = name4.split(",");
        for (int i = 0; i < rs4.length; i++) {
            System.out.println(rs4[i]);
        }
    }
}
