package com.itheima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[]args){
        int num=1000;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的会员大家");
        int vip=sc.nextInt();
        if (vip==1){
            System.out.println("请付"+num*0.9+"元");
            }else if (vip==2) {
            System.out.println("请付"+num*0.8+"元");
        }else if (vip==3) {
            System.out.println("请付"+num*0.7+"元");
        }else{
            System.out.println("请付1000元");
        }
    }
}
