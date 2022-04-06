package com.xiongzhi._4_loop;

public class WhileCase {
    //while通常在不知道要循环多少次的情况下使用，for通常在知道次数
    //for和while重要区别！for(int i = 0;i < 3;i ++)中的i在for循环结束后是不存在的，而while结束循环后还在
    // 这里珠穆朗玛峰的案例用while，do...while会直接执行一次，而不会关条件是否成立
    public static void main(String[] args) {

        int count = 0;
        double Height = 0.1;
        while(Height< 8848860){
            Height = Height * 2;
            count ++;
        }
        System.out.println("需要折叠" + count +"次");

        //这里的do...while条件不符合还是执行了一次输出
        int x = 0;
        do{
            System.out.println("Hello");
        }while(x<0);
    }
}
