package com.xiongzhi._9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class CasePractice {
    public static void main(String[] args) {
        // 1. 一个ArrayList中为班级成绩，要求删除低于80的成绩
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(77);
        scores.add(66);
        scores.add(89);
        scores.add(79);
        scores.add(50);
        scores.add(100);
        System.out.println(scores);

        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i)<80){
                scores.remove(i);
                i--;  // remove删完会让后面的元素前移，导致如果有两个同时符合要求后者会被掠过
            }
        }
        System.out.println(scores);
        // 第二种方法是倒着遍历删除, 删完后面的元素前移，这样自动就避免跳位并且比上面方法省去一步操作，更好
//        for (int i = scores.size()-1; i >=0 ; i--) {
//            if(scores.get(i)<80){
//                scores.remove(i);
//            }
        // 2. 集合中放入自定义对象
        ArrayList<Movie> movieList= new ArrayList<>();
        movieList.add(new Movie("《肖生克的救赎》", 9.7, "Robins"));
        movieList.add(new Movie("《霸王别姬》", 9.7, "张国荣、张丰毅"));
        movieList.add(new Movie("《阿甘正传》", 9.5, "Tom Hanks"));

        System.out.println(movieList); // 返回的是[com.xiongzhi._9_ArrayList.Movie@4554617c，因为对象返回的是地址
        for (int i = 0; i < movieList.size(); i++) {
            System.out.println("电影名："+movieList.get(i).getName()
                                +"，电影得分:" + movieList.get(i).getScore()
                                +",电影导演:" + movieList.get(i).getActor());
        }
        // 3. 元素搜索 存储学生信息，并按照学号搜索学生信息的功能
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("叶孤城","20180302",23,"护理一班"));
        studentList.add(new Student("东方不败","20180303",23,"推拿二班"));
        studentList.add(new Student("西门吹雪","20180304",26,"中药学四班"));
        studentList.add(new Student("梅超风","20180305",26,"神经科二班"));
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入学生学号：");
            String stuNum = sc.next();
            Student s = getStudentById(studentList, stuNum);
            if(s!=null){
                System.out.println("学生姓名："+s.getName()
                        +", 学号："+s.getNumber()
                        +", 年龄："+s.getAge()
                        +", 班级："+s.getClassInfo());

            }else{
                System.out.println("查无此人！");
            }

        }

        }

    /**
     *
     * @param list 存储学生信息的ArrayList
     * @param number 要查询的学生学好
     * @return 学生信息
     */
    public static Student getStudentById(ArrayList<Student> list, String number){

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getNumber().equals(number)){
                return list.get(i);
            }
        }
        return null;

    }





    }

