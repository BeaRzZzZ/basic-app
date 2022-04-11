package com.xiongzhi.practice;

public class SuShu {
    public static void main(String[] args) {

        for (int i = 101; i <= 200; i++) {
            if(ifSu(i)){
                System.out.print(i+"\t");
            }

        }
    }
    public static boolean ifSu(int a){
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {//这里一定要<=，不然
            if(a % i == 0){ //不是素数
                flag = false;
                break;
            }
        }
        return flag == true;

    }
}
