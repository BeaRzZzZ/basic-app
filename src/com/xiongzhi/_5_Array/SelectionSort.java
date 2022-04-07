package com.xiongzhi._5_Array;

public class SelectionSort {
    /* 选择排序：第一轮找出最小的值，放在第一个位置（2个值交换位置）
                第二轮找出第二小的值，放在第二个位置（2个值交换位置）
                ....
       与冒泡排序的区别：选择排序每一轮只要交换一次位置，而冒泡排序每一轮要交换很多次
                      冒泡排序是稳定的（有两个相同的数不会交换彼此的相对位置）但选择排序是不稳定的，会打乱两个相同数字的原有相对位置
                      选择排序时间上更少（不用频繁交换）
     */
    public static void main(String[] args) {
        int[] arr = {3,5,2,5,234,123,42,234,5,23,526,2342,7153,2342,6234,2332,2342,423442,234,23,3,24};

        for (int i = 0; i < arr.length-1; i++) { // 这里和冒泡排序一样都是-1,因为4个数执行3轮就行，最后一个自动就排好了
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {//这里4个数，j就是为了对i后面的数进行比较，第一轮比较3次，length =4，j=1，2，3，其
                                                    // 其实这里和冒泡不一样的原因是j+1了，不然也是-j-1
                if(arr[j] < arr[i]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
