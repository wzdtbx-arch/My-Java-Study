package com.itheima.test;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的零钱");
        int money = sc.nextInt();
        if (money>=100){
            System.out.println("小明可以买一部手机");
        }else {
            System.out.println("小明不买了");

        }
    }
}
