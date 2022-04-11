package com.xiongzhi.practice;

import java.util.Scanner;

public class GiveScore {
    // 评委打分，去掉最高和最低分并得出平均分
    public static void main(String[] args) {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i+1)+"个分数：");
            scores[i] = sc.nextInt();
        }
       // result(scores);
        reverseArray(scores);

    }
    public static void printArray(int[] a){
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(i == a.length-1?a[i]:a[i] + ", ");
        }
        System.out.println("]");
    }
    public static void result(int[] a){
        int min = a[0];
        int max = a[0];
        float result = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
            result += a[i];
        }
        result = (result - min - max)/(a.length-2);
        System.out.println("去掉一个最高分:" + max +"，去掉一个最低分:" + min +"，该选手的最终得分为：" +result);
    }
    public static void reverseArray(int[] a){ // 逆序打印，不改变原数组内容，如果要把原数组倒序，用两个标志，一头一尾，交换值，相遇停下来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[a.length - i -1]+",");
        }
    }
}
