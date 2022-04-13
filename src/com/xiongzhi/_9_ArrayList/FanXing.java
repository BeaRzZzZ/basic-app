package com.xiongzhi._9_ArrayList;

import java.util.ArrayList;

public class FanXing {
    // 为了规范ArrayList规范，使用范型来约束集合操作的数据类型
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(); // 从JDK1.7开始，后面的<>里面的类型就可以不用写了
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");
//        list.add(23); 这两种数据不是String类型，就会报错！
//        list.add(23.3);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(23);
        // list2.add(23.3); 报错
        // list2.add("Java"); 报错

        // ArrayList常用API
        // 1. 获取某个索引对应的元素值
        String e3 = list.get(3);
        System.out.println(list.get(3)); // MyBatis-类型String

        // 2. 获取集合的大小
        System.out.println(list.size()); // 5

        // 3. 集合的遍历
        System.out.println(list); // [Java, Java, MySQL, MyBatis, HTML]
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 4. 删除某个索引的元素，并返回被删除的元素值
        String d = list.remove(1);
        System.out.println(d); // Java
        System.out.println(list); // [Java, MySQL, MyBatis, HTML]

        // 5. 按照元素的值删除，如果成功返回true，如果失败返回false, 如果删除的内容有两个或以上，只会删除第一个
        System.out.println(list.remove("Java")); // 返回true
        System.out.println(list); // [MySQL, MyBatis, HTML]

        // 6. 修改某个索引处的值,并返回修改前的值

        String before = list.set(1, "HelloWorld"); // 把索引为1的MyBatis替换成HelloWorld
        System.out.println(before); // MyBatis
        System.out.println(list); // [MySQL, HelloWorld, HTML]

    }
}
