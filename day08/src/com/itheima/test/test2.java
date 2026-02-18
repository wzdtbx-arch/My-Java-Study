package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的飞机票原价");
        double price=sc.nextDouble();
        System.out.println("请输入您的出行月份");
        int month=sc.nextInt();
        System.out.println("请输入您是经济舱还是头等舱");
        String seat=sc.next();
        double finalPrice=getFinalPrice(price,month,seat);
        System.out.println("您的机票最终价格是"+finalPrice);
    }
    public static double getFinalPrice(double price,int month,String seat){
        if (month<=10&&month>=5){
            if("经济舱".equals(seat)){
                price*=0.85;
            }else if ("头等舱".equals(seat)){
                price*=0.9;
            }
        }else if (month==11||month==12||month==1||month==2||month==3||month==4){
            if("经济舱".equals(seat)){
                price*=0.65;
            }else if ("头等舱".equals(seat)){
                price*=0.7;
            }
        }return price;
    }
}
