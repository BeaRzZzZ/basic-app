package com.xiongzhi._4_loop;

import java.util.Scanner;

public class DeadLoop {
    //死循环用while(true)比较专业，这里的案例让用户不断输入密码，直到密码正确才break
    // 这里如果把psw弄成int输入其他形式的密码会抛出异常，但是用==判断会导致问题，详见https://www.cnblogs.com/Dreamice/p/7809605.html
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入密码：");
            String psw = sc.next();
            if(psw.equals("520")){
                System.out.println("密码正确！");
                break;
            }
        }
    }


}

