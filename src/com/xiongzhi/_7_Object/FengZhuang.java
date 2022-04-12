package com.xiongzhi._7_Object;

public class FengZhuang {
    // 封装的好处就是能让开发者对对象的属性更加精准的控制保证数据的安全性和有效性，比如一个人的年龄，可以通过封装的方法
    // 控制输入的年龄在0-200之间，或者在打印手机号时，选择性隐去一部分信息
    //如果输出不是11位的手机号就会报错，这都是封装控制的体现，调用者不用操心，只需要合适使用对象以及其提供的方法即可
    private int age;// 只能在本类中访问，如果在main方法中使用Fengzhuang.age（）会报错
    private String phone;

    public void setAge(int age){
        if(age >=0 && age <=200){
            this.age = age;
        }else{
            System.err.println("您的年龄数据有误！");
        }
    }
    public int getAge(){
        return age;
    }
    public void setPhone(String phone){
        if (phone == null || phone.length() !=11){
            System.err.println("请输入11位的手机号！");
        }else {
            this.phone = phone;
        }
    }
    public String getPhone(){
        return phone.substring(0,3) + "****" + phone.substring(7,11);
    }
}
