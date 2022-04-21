package com.xiongzhi._5_Array;

import java.util.Arrays;

public class BinarySearch {
    // 二分查找的实现(排好序的数组)
    public static void main(String[] args) {
        int[] arr1 = {3,5,2,234,123,42,234,23,526,2342,7153,2342,6234,2332,2342,423442,234,23,3,24};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));// 先排好序
        System.out.println(binarySearch(arr1, 4));
    }

    /**
     * 二分查找
     * @param arr1 要查找的数组
     * @param data 要查找的数据
     * @return 索引 | 找不到返回-1
     */
    private static int binarySearch(int[] arr1, int data) {

        if (arr1 == null){
            return -1;
        }
        int left = 0;
        int right = arr1.length -1;

        while(left <= right){
            int middle = (left + right)/2; // 不用太精确
            if(data>arr1[middle]){ // 说明数据在右边
                left = middle+1; // 注意一定要+1
            }else if(data<arr1[middle]){
                right = middle-1; // 注意一定要-1
            }else{
                return middle;
            }
        }
        // 跳出循环说明没找到
        return -1;
    }

}
