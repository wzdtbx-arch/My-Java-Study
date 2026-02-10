package com.itheima.infiniteloop;

import java.util.Scanner;
public class infiniteloopDemo2{
    public static void main(String[] args) {
        // 1. 键盘录入

        Scanner sc = new Scanner(System.in);
        System.out.println("宝宝，请输入一个大于等于2的整数：");
        int x = sc.nextInt();

        // 2. 算法实现
        // 宝宝你看，我们从1开始尝试
        for (int i = 1; i <= x; i++) {
            if (i * i == x) {
                System.out.println(x + " 的平方根是: " + i);
                break;
            } else if (i * i > x) {
                // 如果当前数的平方已经大于x了，那说明根就在 i-1 和 i 之间
                // 按照图片要求舍弃小数，所以取 i-1
                System.out.println(x + " 的平方根整数部分是: " + (i - 1));
                break;


            }
        }
    }
}