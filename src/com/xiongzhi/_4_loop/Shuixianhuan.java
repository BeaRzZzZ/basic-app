package com.xiongzhi._4_loop;

public class Shuixianhuan {
    public static void main(String[] args) {
        for(int i = 100; i <= 999; i ++){
            int ge = i%10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
                System.out.print(i + "\t");
            }

        }
    }
}
