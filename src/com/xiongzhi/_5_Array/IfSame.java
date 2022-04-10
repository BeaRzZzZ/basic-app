package com.xiongzhi._5_Array;

public class IfSame {
    // 比较两个数组内容是否相同
    public static void main(String[] args) {
        int[] arrs1 = {1,2,3,4};
        int[] arrs2 = {1,3,3,4};
        compare(arrs1,arrs2);

    }
    public static void compare(int[] a, int[] b){
        boolean index = true; //用于标记是否相同
        int position = 0; //不同的首个元素的位置
        if(a.length != b.length){
            System.out.println("两个数组长度不一致！");
        }else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]){
                    index = false;
                    position = i +1;
                    break;
                }
            }
            System.out.println(index == true?"两个数组相同！":"两个数组不同！首个不同元素为第"+position+"个！");
        }

    }
}
