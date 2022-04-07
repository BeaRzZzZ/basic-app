package com.xiongzhi._5_Array;

import java.util.Random;
import java.util.Scanner;

public class OUTDemo {
    // 结束在while循环中的for循环中结束整个while循环的方法：OUT
    public static void main(String[] args) {

        int[] arr = new int[5];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20) + 1; // 1-20
        }
        OUT:
        while(true){
            System.out.println("请输入您猜的一个1-20之间的整数:");
            Scanner sc = new Scanner(System.in);
            int guessNumber = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if(guessNumber == arr[i]){
                    System.out.println("您猜对了！该数据索引是：" + i);
                    break OUT; // 这里如果直接break就只会跳出for循环，配合while一开始的OUT可以直接跳出整个while
                }
            }
            System.out.println("没有这个数哦！");
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
