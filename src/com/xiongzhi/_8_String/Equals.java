package com.xiongzhi._8_String;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        // == 比较的是地址，equals比较的是内容,
        // == 使用场景：基本类型比较

        String okName = "itheima";
        String okPassword = "123456";

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号：");
        String name = sc.next(); // 这样子接受产生的name是变量，是在堆内存中的，所以地址肯定是和常量池中的不一样的
        System.out.println("请输入密码：");
        String password = sc.next();

        if(name.equals(okName)  && password.equals(okPassword)){ // 如果使用 == 判断比较的是内存地址，equals比较的是内容
            System.out.println("登录成功！");
        }else{
            System.out.println("账号或密码错误！");
        }

        // 验证码忽略大小写用 equalsIgnoreCase
        String code = "23Ghi";
        String code1 = "23ghi";
        System.out.println(code.equalsIgnoreCase(code1));

    }
}
