package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        boolean flag = true;
        if (num < 2) {
            flag = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
            if (flag){
                System.out.println(num+"是质数");
            }else {
                System.out.println(num+"不是质数");
            }
    }
}
