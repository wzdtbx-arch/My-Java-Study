package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args){
        for (int i=1;i<=100;i++){
            if (i%7==0||i%10==7||i/10==7){
                System.out.println("过");
                continue;
            }else {
                System.out.println(i);
            }
        }
    }
}
