package com.xiongzhi._5_Array;

public class BubbleSort {

    public static void main(String[] args) {
        // 冒泡排序的思想：每一轮把最大的那个数放到最后面去
        // 最坏情况就是倒序：平均时间复杂度为 O(n2)
        int[] arr = {3,5,2,5,234,123,42,234,5,23,526,2342,7153,2342,6234,2332,2342,423442,234,23,3,24};

        for (int i = 0; i < arr.length-1; i++) { // 次数控制，这里是length-1, 因为2个数只要交换1轮，3个数个交换2轮
            for (int j = 0; j < arr.length -i -1; j++) {// index控制，
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
