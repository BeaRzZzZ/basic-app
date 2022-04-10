package com.xiongzhi._5_Array;

public class FindIndex {
    // 找到一个元素在数组中的位置
    public static void main(String[] args) {
        int[] arrs = {11,22,33,44,213,23,22};
        find(arrs, 100);
    }
    public static void find(int[] arrs, int a){
        int index = -1;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == a){
                System.out.println("元素'"+a+"'在第"+(i+1)+"位出现！");
                index = i;

            }
        }
        if(index ==-1){
            System.out.println("没有"+a+"这个元素！");
        }
    }

}
