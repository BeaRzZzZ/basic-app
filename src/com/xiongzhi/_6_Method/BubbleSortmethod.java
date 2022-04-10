package com.xiongzhi._6_Method;

public class BubbleSortmethod {

    public static void main(String[] args) {
        int a =10;
        int b =20;
        int c = a + b;
        System.out.println(c);
        int d = sum(c, a);
        System.out.println(d);

        int[] arr = {1,5,2,5,234,123,42,234,5,23,526,2342,7153,2342,6234,2332,2342,423442,234,23,3,24};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }

    public static int[] sort(int[] arr){// 冒泡排序方法
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -i -1; j++) {// index控制，
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
