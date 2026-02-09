package com.itheima.loopdemo;

import java.util.Scanner;

public class forDemo4 {
    public static void main(String[]args){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入取值左区间");
        int start=sc.nextInt();
        System.out.println("请输入取值右区间");
        int end=sc.nextInt();
        for (int i=start;i<=end;i++){
            if (i%5==0&&i%7==0){
                count++;
            }
        }
        System.out.println(count);

    }
}
