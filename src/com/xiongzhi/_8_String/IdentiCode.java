package com.xiongzhi._8_String;

import java.util.Random;
import java.util.Scanner;

public class IdentiCode {
    public static void main(String[] args) {
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 生成验证验证码, 就是在上面这个字符串范围内的随机数，然后把对应的索引输出就好了
        // 这个会写法会导致数字出现的概率降低，因为如果按照之前的方法，3种类型的出现概率差不多，但是现在数字数量少，所以概率低了
        System.out.println("请输入要生成的验证码长度：");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Random r = new Random();
        String code = "";
        for (int i = 0; i < length; i++) {
            int x = r.nextInt(datas.length()); // 0-（字符串长度-1）的索引，然后按照索引找到值
                code += datas.charAt(x);
            }

        System.out.println(code);
    }
}
