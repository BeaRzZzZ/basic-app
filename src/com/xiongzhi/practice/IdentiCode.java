package com.xiongzhi.practice;

import java.util.Random;

public class IdentiCode {
    // 验证码
    public static void main(String[] args) {
        System.out.println(createCode(5));

    }
    public static String createCode(int n){
        //n代表验证码长度，也就是循环次数，每次循环在字符串后面加上
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3); // 0,1,2分别代表三种字符
            switch (type){
                case 0:
                    // 大写字符 (A 65 - Z 65+25)(0-25) + 65
                    char ch1 = (char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 1:
                    // 小写字符 (a 97 - z 97+25)(0-25) + 97
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
                case 2:
                    // 数字
                    int x = r.nextInt(10);
                    code += x;
                    break;
            }
        }
        return code;
    }
}
