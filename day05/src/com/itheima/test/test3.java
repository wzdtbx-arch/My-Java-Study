package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x=sc.nextInt();
        if (x<2){
            System.out.println("请输入一个大于等于2的整数");
        }else {
            for (int i=2;i<x;i++){
                if (i*i==x){
                    System.out.println(x+"的平方根是"+i);
                    break;
                }else if(i*i>x){
                    System.out.println(x+"的平方根整数部分是"+(i-1));
                    break;
                }
            }
        }
    }
}
