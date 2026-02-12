package com.itheima.arraydemo;

import java.util.Random;

public class ArrayDemo4 {
    public static void main(String[]args){
        int[]num=new int[10];
        Random r=new Random();
        int sum1=0;
        double avg=0;
        int count=0;
        for (int i=0;i<num.length;i++){
            num[i]=r.nextInt(100)+1;
            sum1+=num[i];
        }System.out.println("数组中所有的数据和位"+sum1);
         double dvg=sum1*1.0/num.length;
            System.out.println("数组中所有数据的平均数为"+dvg);
        for (int i=0;i<num.length;i++){
            if (num[i]<dvg){
                count++;
                System.out.print(num[i]+"  ");
            }
        }


    System.out.println("所有数据中比平均数小的数有"+count+"个");
    }
}
