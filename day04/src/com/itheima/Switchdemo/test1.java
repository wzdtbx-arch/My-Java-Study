package com.itheima.Switchdemo;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入星期数");
        int week=sc.nextInt();
        switch(week){
            case 1:
                System.out.println("跳舞");
                break;
            case 2:
                System.out.println("跑步");
                break;
            case 3:
                System.out.println("游泳");
                break;
            case 4:
                System.out.println("打篮球");
                break;
            case 5:
                System.out.println("打羽毛球");
                break;
            case 6:
                System.out.println("打乒乓球");
                break;
            default:
                System.out.println("好好学习");
                break;
        }
    }
}
