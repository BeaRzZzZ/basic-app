package com.xiongzhi._4_loop;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    // 主要用一下随机函数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(); // 生成随机数对象
        int x = r.nextInt(100); //0-99（n-1），如果想1-100，可以直接在后面+1
        int count = 0;
        while(true){
            System.out.println("请输入你猜的数字：");
            int y = sc.nextInt();
            if (y == x){
                System.out.println("恭喜猜对了！");
                System.out.println("共猜了"+count+"次");
                break;
            }else if(y>x){
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
            count ++;
        }
    }
}
