package com.itheima.test;

import java.util.Scanner;

public class test4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的座位号");
        int seat=sc.nextInt();
       if (seat>=0&&seat<=100){
           if (seat%2==0) {
               System.out.println("小明坐在偶数位");
           }else{
               System.out.println("小明坐在奇数位");
           }
       }
    }



}
