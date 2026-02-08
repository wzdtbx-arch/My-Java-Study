package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的块钱");
        int money=sc.nextInt();
        if (money>=600){
            System.out.println("小明可以买一台电脑");
        }else {
            System.out.println("小明不买了");
        }
    }
}
