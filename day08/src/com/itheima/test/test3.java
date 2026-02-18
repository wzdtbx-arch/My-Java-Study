package com.itheima.test;

public class test3 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + "  ");
                count++;
            }
        }
        System.out.println("总共有"+count+"个素数");
    }
}