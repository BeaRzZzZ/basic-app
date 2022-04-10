package com.xiongzhi._6_Method;

public class Return {
    // return 只会结束所在方法，不会结束别的，这里的main就没被结束 ,break是结束循环
    public static void main(String[] args) {
        int a =10, b =0;
        divide(a,b);
    }
    public static void divide(int a, int b){
        if(b == 0){
            System.err.println("被除数不能为0！");
            return;
        }else {
            System.out.println(a+"/"+b+"的结果是:"+a/b);
        }
    }

}
