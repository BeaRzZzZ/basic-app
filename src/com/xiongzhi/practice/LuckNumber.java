package com.xiongzhi.practice;

import java.util.Random;

public class LuckNumber {
    public static void main(String[] args) {
        int[] luckyNumber = createLuckyNumber();
        printArray(luckyNumber);

    }
    public static int[] createLuckyNumber(){
        int[] numbers = new int[7];

        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            // 生成不重复的前六个1-33的数字

            while(true){
                int number = r.nextInt(33)+1;
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if(number == numbers[j]){
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    numbers[i] = number;
                    break;
                }

            }

        }
        numbers[numbers.length-1]= r.nextInt(16)+1;
        return numbers;
    }
    public static int[] userInputNumber(){
        int[] userInput = new int[7];
        return
    }
    public static void printArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length-1?a[i]:a[i] + ", ");
        }
        System.out.println("]");
    }
}
