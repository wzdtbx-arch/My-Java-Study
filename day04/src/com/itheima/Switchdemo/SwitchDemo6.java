package com.itheima.Switchdemo;

import java.util.Scanner;

public class SwitchDemo6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请问需要查询什么业务");
        int choose=sc.nextInt();
        switch(choose){
            case 1->System.out.println("查询余额");
            case 2->System.out.println("查询积分");
            case 3->System.out.println("查询话费");
            default-> System.out.println("退出服务");
        }
    }
}
