package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的机票原价");
        double price=sc.nextDouble();
        System.out.println("请输入您的出行月份");
        int month=sc.nextInt();
        System.out.println("请输入您的座位类型");
        String seat=sc.next();
        if(month<=10&&month>=5){
            if("头等舱".equals(seat)){
                System.out.println("机票价格是"+price*0.9);
            }else if(seat.equals("经济舱")){
                System.out.println("机票价格是"+price*0.85);
        }
    }else if (month==11||month==12||month==1||month==2||month==3||month==4){
            if("头等舱".equals(seat)){
                System.out.println("机票价格是"+price*0.7);
            }else if(seat.equals("经济舱")){
                System.out.println("机票价格是"+price*0.65);
            }
        }else {
            System.out.println("输入错误");
        }
    }
}
