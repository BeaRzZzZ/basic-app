package com.xiongzhi._6_Method;

public class MethodTrans {
    // 方法中的参数传递是把值传递过去，如果是方法内部对基本类型修改并不会修改main中的实参进行改变，但是引用数据类型
    // 例如数组的传递，因为传递的是地址，所以方法对数组这类引用类型的修改会在main中也生效
    public static void main(String[] args) {
        int[] arrs = {10,20,30};

        change(arrs);
        System.out.println(arrs[1]); // 222
    }
    public static void change(int[] arrs){
        System.out.println(arrs[1]); //20
        arrs[1] = 222;
        System.out.println(arrs[1]); //222
    }
}
