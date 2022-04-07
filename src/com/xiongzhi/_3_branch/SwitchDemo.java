package com.xiongzhi._3_branch;

public class SwitchDemo {
    public static void main(String[] args) {
        /* switch的注意点:
            1. 不支持double, float,long
            2. case的值不允许重复，且只能是字面量，不能是变量, 防止重复
            3. 不能漏掉break，否则会导致穿透（但穿透可以加以利用）
         */
        // 穿透的合理利用，然后还有今年过去了多少天也可以用到，但是要从case12开始
        int month = 7;
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12:
                System.out.println(month+"月是31天！");
                break;
            case 2:
                System.out.println(month + "闰年29天，平年28天");
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(month+"月是30天！");
            default:
                System.out.println("Wrong data！");
            }
    }
}
