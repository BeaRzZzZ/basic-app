package com.xiongzhi._4_loop;

public class BreakContinue {
    // break: 跳出并结束当前所在循环的执行
    // continue: 跳出当前循环的这一次执行，并进行到下一次循环
    public static void main(String[] args) {
        int count1 = 0;//这礼拜洗碗次数
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                break;
            }
            count1 ++;
        }
        System.out.println("坚持到了礼拜三，共洗了"+count1+"次");
        int count2 = 0;
        for (int i = 0; i < 5; i++) {
            if(i == 3){
                continue;
            }
            count2 ++; // i = 3 的那次没有执行这条语句
        }
        System.out.println("礼拜三懒了一天，共洗了"+count2+"次");
    }
}
