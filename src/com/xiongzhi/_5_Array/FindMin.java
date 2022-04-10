package com.xiongzhi._5_Array;

public class FindMin {
    public static void main(String[] args) {
        float[] position = {3,6,12,19};
        float finalPosition[] = insert(position);

        int x = 0;
        int y = 0;
        float maxDis = 0;
        for (int i = 0; i < finalPosition.length-1; i++) {
            if(Math.abs(finalPosition[i]-finalPosition[i+1])>maxDis){
                x = i;
                y = i +1;
                maxDis = Math.abs(finalPosition[i]-finalPosition[i+1]);
            }
        }
        System.out.println("最大距离最小为："+ maxDis);
        for (int i = 0; i < finalPosition.length; i++) {
            System.out.println(finalPosition[i]);

        }
    }
    public static float[] insert(float[] position){
        int x=0,y=1;
        float maxDis = Math.abs(position[x]-position[y]);
        for (int j = 1; j < position.length-1; j++) {
            if(Math.abs(position[j]-position[j+1])>maxDis){
                x = j;
                y = j +1;
                maxDis = Math.abs(position[j]-position[j+1]);
            }
        }
        // 在距离最大处插入中点
        float insertNumber = (position[x]+position[y])/2;
        // 在数组指定位置插入新元素：思路为创建一个新数组，先把指定位置前的元素插入，然后插入指定元素，再把剩下的插入
        float[] newPosition = new float[position.length+1];
        for (int k = 0; k <= x; k++) {
            newPosition[k] = position[k];
        }
        newPosition[x+1] = insertNumber;
        for (int k = x+1; k < position.length; k++) {
            newPosition[k+1] = position[k];
        }
        return newPosition;
    }


}
