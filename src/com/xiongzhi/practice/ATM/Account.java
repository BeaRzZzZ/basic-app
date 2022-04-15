package com.xiongzhi.practice.ATM;

public class Account {
    private String cardID; // 银行卡号
    private String userName; // 用户名
    private String passWord; // 密码
    private double money;   // 账户余额
    private double quotaMoney; // 每次取现额度

    // 这个对象的使用场景使用无参构造器就不合适

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQuotaMoney() {
        return quotaMoney;
    }

    public void setQuotaMoney(double quotaMoney) {
        this.quotaMoney = quotaMoney;
    }
}
