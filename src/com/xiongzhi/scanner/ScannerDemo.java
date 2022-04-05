package com.xiongzhi.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您输入的年龄为：" + age);
        System.out.println("请继续输入您的名字：");
        String name = sc.next();
        System.out.println("欢迎" + age + "岁的" + name);
    }
}
