package com.xiongzhi._7_Object;

public class Test {
    public static void main(String[] args) {
            /*
            对象就和数组一样，因为在栈内存中存的都是地址，如果你不new一个新对象，只是简单的=另一个对象，那就只是给了那个对象的地址
            ，所以你对新生成的修改就会修改原来的，因为堆内存中只有一个对象
            堆内存中的对象如果没有变量引用的话（你定义了一个数组，或者对象，之后你把栈内存和堆内存之间的联系切断了）
            就会被垃圾回收机制当成垃圾，之后会被回收
             */
            Student s1 = new Student();
            s1.name = "张三";
            s1.sex = '男';
            s1.hobby = "吃饭";

            Student s2 = s1;
            s2.hobby = "睡觉";
            s2.study();

            // UseThis的案例
            System.out.println("========================================");
            UseThis car1 = new UseThis("宝马",30);
            UseThis car2 = new UseThis("奔驰",40);
            car1.runWith(car2.name);

            // 封装的案例
            System.out.println("========================================");
            FengZhuang f1 = new FengZhuang();
            f1.setAge(24); // 如果输入不在0-200之间的数就会报错
            System.out.println(f1.getAge());
            f1.setPhone("15394218862"); // 如果输出不是11位的手机号就会报错
            System.out.println(f1.getPhone()); // 输出是153****8862，体现了封装的控制性

            // JavaBean
            //1. 通过无参构造器常见对象封装一个用户信息
            System.out.println("========================================");
            JavaBean u1 = new JavaBean();
            u1.setName("吴彦祖");
            u1.setHeight(176);
            u1.setSalary(20000);
            System.out.println("身高"+u1.getHeight()+"的"+u1.getName()+"工资是"+u1.getSalary());

            //2. 通过you can构造器常见对象封装一个用户信息
            JavaBean u2 = new JavaBean("陈奕迅", 180, 25000);
            System.out.println("身高"+u2.getHeight()+"的"+u2.getName()+"工资是"+u2.getSalary());

    }
}
