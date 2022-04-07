package com.xiongzhi._5_Array;

public class ArrayFAQ {
    public static void main(String[] args) {
        // 1. 数组是一个地址
        int[] arr1 = {11,22,33};
        System.out.println(arr1); // [I@4554617c
        /* 内存分配过程 1. 先把类和main方法加载到方法区中
                      2. 把main方法放入栈内存中运行
                      3. 其中，main方法中的基本数据直接在栈内存中分配，数组（对象类型）要在堆内存中分配
                      4. 把数组中的头节点的堆内存地址放到栈内存中
                      5. 之后对数组的操作都是根据堆内存的地址去找的
         */
        arr1[0] = 44;
        arr1[1] = 55;
        arr1[2] = 66;

        // 3. 把对象类型通过=传递给另一个变量并不会在堆内存中开辟新的一块一模一样的内存，只会让另一个变量在栈内存中一个指向
        //    原来的那个对象类型的地址，但是通过对新变量的操控也能改变原来对象的内容
        int arr2[] = arr1;
        arr2[1] = 99;
        System.out.println(arr1[1]);
        System.out.println(arr2[2]);

        // 4. arr1 = null会掐断栈内存和堆内存之间的指向，无法访问内容

    }
}
