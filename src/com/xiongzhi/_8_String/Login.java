package com.xiongzhi._8_String;

import java.util.Scanner;

public class Login {
    // 登陆功能的简单实现
    public static void main(String[] args) {
        String okLoginName = "itheima";
        String okLoginPassword = "123456";
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String inputName = sc.next();
            System.out.println("请输入密码：");
            String inputPassword = sc.next();
            if (inputName.equals(okLoginName) && inputPassword.equals(okLoginPassword)){
                System.out.println("登录成功！");
                flag = true;
                break;
            }else {
                System.out.println("登录名或密码错误！");
            }
        }
        if(!flag){
            System.out.println("您已经错误三次！请联系客服！");
        }
    }

}
