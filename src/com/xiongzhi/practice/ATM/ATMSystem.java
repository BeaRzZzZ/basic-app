package com.xiongzhi.practice.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    // ATM系统的入口类
    public static void main(String[] args) {
        // 定义集合容器，负责存储账户
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 展示系统首页
        while (true) {
            System.out.println("============黑马ATM系统==================");
            System.out.println("1. 账户登陆");
            System.out.println("2. 账户开户");
            System.out.println("请您选择操作：");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    login(accounts, sc);
                    break;
                case 2:
                    register(accounts, sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在！");

            }
        }
    }

    /**
     * 登录功能
     * @param accounts 存储账户对象的集合
     * @param sc 扫描器
     */
    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("============系统登陆操作==================");
        // 判断账号集合中有没有账户
        if (accounts.size() == 0){
            System.out.println("对不起，当前系统没有任何账户！请先开户！");
            return;
        }
        while (true) {
            System.out.println("请输入卡号:");
            String cardId = sc.next();
            Account acc = getAccountByCardId(cardId, accounts);
            if(acc != null){
                while (true) {
                    System.out.println("请输入登陆密码：");
                    String password = sc.next();
                    if (password.equals(acc.getPassWord())){
                        // 登录成功
                        System.out.println(acc.getUserName()+"欢迎先生/女士进入系统！您的卡号是：" + acc.getCardID());
                        // ... 查询 转账 取款 ...
                        showUserCommand(sc, acc, accounts);
                        return; // 在showUserCommand中return之后，回到这里，但是还没有退回首页，所以要继续return, 其余操作会留在
                                // showUserCommand方法的循环中，一旦跳出就是用户选择退出系统了
                    }else{
                        System.out.println("密码错误！");
                    }
                }
            }else{
                System.out.println("对不起，系统中不存在该账户卡号");
            }
        }
    }

    /**
     * 展示登陆后的操作页
     */
    private static void showUserCommand(Scanner sc, Account acc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("============欢迎您进入黑马银行用户操作界面==================");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch(command){
                case 1:
                    // 查询账户
                    showAccount(acc);
                    break;
                case 2:
                    // 存款
                    addMoney(acc, sc);
                    break;
                case 3:
                    // 取款
                    takeMoney(acc, sc);
                    break;
                case 4:
                    transMoney(accounts, acc, sc);
                    break;
                case 5:
                    // 修改密码
                    changePassword(acc,sc);
                    return;
                case 6:
                    // 退出
                    return;// 只是停止当前方法，所以还要在相关方法后面继续return, 直到系统首页
                case 7:
                    // 注销账户
                    boolean flag = logoffAccount(accounts,acc,sc);
                    if(flag){
                        return;
                    }else{
                        break;
                    }
                default:
                    System.out.println("您输入的操作命令不正确！");

            }
        }

    }

    /**
     * 注销用户账号
     * @param accounts 存储账户对象的变量
     * @param acc   要注销的账号对象
     * @param sc    扫描器
     */
    private static boolean logoffAccount(ArrayList<Account> accounts, Account acc, Scanner sc) {

        System.out.println("============欢迎您进入黑马银行账号注销界面==================");
        System.out.println("您确定要注销"+acc.getUserName()+"的账号为："+acc.getCardID()+"的账号吗？");
        System.out.println("[1]. 确认     [2]. 返回主菜单");
        int userChoice = sc.nextInt();
        switch (userChoice){
            case 1:
                accounts.remove(acc);
                System.out.println("注销成功！");
                return true;
            case 2:
                break;
            default:
                System.out.println("请检查您的输入！");
        }
        return false;
    }

    /**
     * 用户更改密码
     * @param acc 要更改密码的账户对象
     * @param sc 扫描器
     */
    private static void changePassword(Account acc, Scanner sc) {
        System.out.println("============欢迎您进入黑马银行密码修改界面==================");

        while (true) {
            System.out.println("请输入当前账户的密码：");
            String oldPsw = sc.next();
            if (oldPsw.equals(acc.getPassWord())){
                System.out.println("请您输入新的密码:");
                String newPsw1 = sc.next();
                System.out.println("请您确认新的密码：");
                String newPsw2 = sc.next();
                if (newPsw1.equals(newPsw2)){
                    acc.setPassWord(newPsw1);
                    System.out.println("密码修改成功，请您重新登陆!");
                    return;
                }else{
                    System.out.println("您输入的两次密码不一致！");
                }
            }else{
                System.out.println("当前密码不正确！");
            }
        }
    }

    /**
     * 转账功能
     * @param accounts 存储全部账户对象的集合
     * @param acc   要转账的账户
     * @param sc 扫描器
     */
    private static void transMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        System.out.println("============欢迎您进入黑马银行用户转账界面==================");

        if(accounts.size() < 2){
            System.out.println("当先系统账户不足2个，不能转账！");
        }else if(acc.getMoney() == 0){
            System.out.println("您自己都没钱，就别转了！");
        }else{
            // 开始转账
            while (true) {
                System.out.println("请您输入转账的账户卡号：");
                String cardId = sc.next();
                Account objectAcc = getAccountByCardId(cardId, accounts);

                if(objectAcc.equals(acc.getCardID())){
                    System.out.println("对不起，您不能给自己转账！");
                    continue;
                }

                if(objectAcc == null){
                    System.out.println("不存在该账户，请重新确认！");
                    continue;
                }
                System.out.println("您当前要为*"+objectAcc.getUserName().substring(1)+"转账！");
                System.out.println("请您输入姓氏确认：");
                String firstName = sc.next();

                if (firstName.equals(objectAcc.getUserName().substring(0,1))){

                    while (true) {
                        System.out.println("您目前余额为："+acc.getMoney()+", 请输入您要转账的金额:");
                        double money = sc.nextDouble();
                        if (money > acc.getMoney()){
                            System.out.println("余额不足！");
                        }else{
                            acc.setMoney(acc.getMoney()-money);
                            objectAcc.setMoney(objectAcc.getMoney()+money);
                            System.out.println("转账成功！");
                            showAccount(acc);
                            return; // 直接结束转账方法
                        }
                    }
                }else{
                    System.out.println("您输入的姓氏错误！");
                    continue;
                }
            }

        }
    }

    /**
     * 取钱
     * @param acc 当前登陆的账号
     * @param sc 扫描器
     */
    private static void takeMoney(Account acc, Scanner sc) {
        System.out.println("============欢迎您进入黑马银行用户取款界面==================");
        // 低于100不能取款
        if (acc.getMoney() < 100){
            System.out.println("账户余额不足100元，先去存钱吧！");
            return;
        }
        // 提示用户输入取钱金额
        while (true) {
            System.out.println("请您输入取款的金额:");
            int money = sc.nextInt();
            if (money > acc.getQuotaMoney()){
                System.out.println("您当前取款超过了当次限额！您的当次限额为："+acc.getQuotaMoney() + "元");
                continue;
            }else if(money > acc.getMoney()){
                System.out.println("您的账号余额不足！您账户目前总余额是：" + acc.getMoney() + "元");
                continue;
            }

            acc.setMoney(acc.getMoney()-money);
            System.out.println("您已经取款成功！");
            showAccount(acc);
            return; // 跳出取钱方法
        }
    }

    /**
     * 存钱
     * @param acc 需要存钱的用户对象
     * @param sc  用于接受金额扫描
     */
    private static void addMoney(Account acc, Scanner sc) {
        System.out.println("============欢迎您进入黑马银行用户存款界面==================");
        System.out.println("请您输入存款的金额:");
        double money = sc.nextInt();
        acc.setMoney(money + acc.getMoney());
        System.out.println("您已经存款成功！");
        showAccount(acc);
    }

    /**
     * 展示当前用户信息
     * @param acc 传入要展示的账号对象
     */
    private static void showAccount(Account acc) {
        System.out.println("============当前账户信息如下==================");
        System.out.println("卡号:" + acc.getCardID());
        System.out.println("户主：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQuotaMoney());

    }

    /**
     * 用户开户功能的实现
     * @param accounts 接受的用于存账户的集合
     */
    private static void register(ArrayList<Account> accounts, Scanner sc){
        System.out.println("============系统开户操作==================");
        Account account = new Account();

        // 录入用户信息
        System.out.println("请输入账户用户名:");
        String userName = sc.next();
        account.setUserName(userName);

        while (true) {
            System.out.println("请输入账户密码：");
            String password = sc.next();
            System.out.println("请再次输入密码：");
            String passwordAgain = sc.next();
            if(password.equals(passwordAgain)){
                account.setPassWord(password);
                break;
            }else{
                System.out.println("对不起，您输入的2次密码不同！请重新录入");
            }
        }
        System.out.println("请输入每次取款限额：");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        // 生成8位不重复的卡号
        String cardId = getRandomCardId(accounts);
        account.setCardID(cardId);

        // 把账户对象添加到账户集合中
        accounts.add(account);
        System.out.println(""+account.getUserName()+"先生/女士，开户成功！您的卡号为："+cardId);
    }

    /**
     * 返回一个随机的不同卡号
     * @param accounts 要存储银行卡的ArrayList
     * @return cardId
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        String cardId = "";
        Random r = new Random();

        while (true) {
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            // 判断重复
            Account acc = getAccountByCardId(cardId, accounts);
            if (acc == null){ // 这里还是用到了flag，其实flag的功能是通过getAccountById这个方法实现了，所以要生成随机的不同一定要用flag
                return cardId;
            }
        }
    }

    /**
     * 根据卡号查询一个账户对象
     * @param cardId 卡号
     * @param accounts 卡号所在合集
     * @return  账户对象｜null
     */
    private static Account getAccountByCardId(String cardId, ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            if (cardId.equals(accounts.get(i).getCardID())){
                return accounts.get(i);
            }
        }
        return null;
    }
}
