package com.xiongzhi.practice;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.BlockingDeque;

public class LuckNumber {
    public static void main(String[] args) {
        int[] luckyNumber = createLuckyNumber();
        printArray(luckyNumber);
        int[] userNumber = userInputNumber();
        printArray(userNumber);
        judge(luckyNumber,userNumber);

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
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            // 不重复的前六个1-33的数字
            while(true){
                System.out.println("当前已经输入的数字有：");
                printArray1(userInput);
                System.out.println("请输入6个不同的红色球数字：");
                int number = sc.nextInt();
                boolean flag = true;
                if(number < 1 || number > 33){
                    System.out.println("您输入的数字有误！红球号码需在1-33范围内！");
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    if(number == userInput[j]){
                        flag = false;
                        System.out.println(userInput[j]+"已经存在！");
                        break;
                    }
                }
                if (flag){
                    userInput[i] = number;
                    break;
                }

            }

        }
        // 生成最后一个蓝色号码
        while(true){
            System.out.println("请输入最后一个1-16的蓝色号码：");
            int blueNum = sc.nextInt();
            if (blueNum > 16 || blueNum <1){
                System.out.println("您输入的数字有误！蓝球号码需在1-16范围内！");
                continue;
            }
            userInput[6] = blueNum;
            break;
        }
        return userInput;
    }

    public static void printArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length-1?a[i]:a[i] + ", ");
        }
        System.out.println("]");
    }
    //这个打印方法是给用户输入准备的，在用户每次继续输入之前提示已经输入的有哪些
    public static void printArray1(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (a[i]!=0){
                System.out.print(i == a.length-1?a[i]:a[i] + ", ");
            }
        }
        System.out.println("]");
    }
    // 判断中奖情况
    public static void judge(int[] a, int[] b){
        // a-中奖号码 ， b-用户号码
        int redBonus = 0, blueBonus = 0;
        for (int i = 0; i < b.length -1; i++) {
            for (int j = 0; j < a.length -1; j++) {
                if (b[i] == a[j]){
                    redBonus +=1;
                    break;
                }
            }
        }
        if(a[6] == b[6]){
            blueBonus +=1;
        }
        System.out.println("红球中了"+redBonus+"个！蓝球中了"+blueBonus+"个！");

        if (redBonus>=0 && redBonus<=3 && blueBonus ==1){
            System.out.println(redBonus==3?"奖金10元！":"奖金5元！");
        }else if (redBonus ==4){
            System.out.println(blueBonus == 1?"奖金200元！":"奖金10元！");
        }else if(redBonus == 5){
            System.out.println(blueBonus == 1?"奖金3000元！":"奖金200元！");
        }else if(redBonus == 6){
            System.out.println(blueBonus == 1?"奖金1000万元！":"奖金500万元！");
        }else {
            System.out.println("很抱歉，您没有获得奖金！");
        }
    }
}
