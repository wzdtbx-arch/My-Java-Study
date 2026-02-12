package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) - 7;
        Scanner sc = new Scanner(System.in);
        int count=0;
        while (true) {
            System.out.println("请输入一个整数");
            int num2 = sc.nextInt();
            count++;
            if (count==4){
                System.out.println("你已经猜了4次了，游戏结束");
                break;
            }

            if (num1 > num2) {
                System.out.println("你猜的数字小了");
            } else if (num1 < num2) {
                System.out.println("你猜的数字大了");
            } else {
                System.out.println("恭喜你猜对了");
                break;
            }
        }
    }
}
