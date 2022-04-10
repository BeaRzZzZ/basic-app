package com.xiongzhi._6_Method;

public class MethodOverload {
    //方法重载：就是公用同一个方法名，但是传递的形参不同，在调用时会根据你传递的参数调用不同的方法
    public static void main(String[] args) {
        fire();
        fire("阿美瑞克");
        fire("阿美瑞克",10);

    }
    public static void fire(){
        System.out.println("默认随机发射一颗DF-41！");
        fire("american"); // 可以互相调用
    }
    public static void fire(String location){
        System.out.println("成功向"+location+"发射了一枚DF-41！");
    }
    public static void fire(String location, int num){
        System.out.println("成功向"+location+"发射了"+num+"枚DF-41！");
    }
}
