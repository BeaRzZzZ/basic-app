package com.xiongzhi._7_Object.MovieCase;

public class Test {
    public static void main(String[] args) {
        // 定义一个存放电影对象的数组 & 使用有参构造器进行初始化
        Movie[] movieList = new Movie[3];
        movieList[0] = new Movie("《长津湖》",9.7,"吴京");
        movieList[1] = new Movie("《我和我的父辈》",9.6,"吴京");
        movieList[2] = new Movie("《扑水少年》",9.5,"王川");
        for (int i = 0; i < movieList.length; i++) {
            System.out.println("第"+(i+1)+"部电影信息--电影名："+movieList[i].getName()
                                +"，评分："+movieList[i].getScore()
                                +",导演："+movieList[i].getActor());
        }
    }

}
