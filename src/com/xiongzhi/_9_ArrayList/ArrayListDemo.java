package com.xiongzhi._9_ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    // 数组中的元素种类和元素个数在初始化之后就确定了，实际开发中许多需求都是需要动态变化的数组，
    // ArrayList就是元素种类和元素个数可以不用确定的数组
    // 数组通常使用在{东,南,西,北}，{Jan,Feb,Mar,...}
    public static void main(String[] args) {
        // 1. 使用无参构造器new一个新的ArrayList对象
        ArrayList list = new ArrayList();

        // 2. 添加数据, 可以添加任何类型数据
        list.add("Java");
        list.add(23);
        list.add(23.3);
        list.add('中'); // 有返回值，成功-true，失败-false
        System.out.println(list);

        // 3. 在制定位置插入元素
        list.add(1,"哈哈"); // 在第二个位置插入"哈哈"
        System.out.println(list);
    }
}
