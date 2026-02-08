package com.itheima.test;

import java.util.Scanner;

public class test5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明的分数");
        int score=sc.nextInt();
      if (score>=0&&score<=100){
          if (score>=95&&score<=100) {
              System.out.println("小明的成绩是A");
          }else if(score>=90&&score<95){
              System.out.println("小明的成绩是B");
          }else if(score>=80&&score<90) {
              System.out.println("小明的成绩是C");
          }else{
              System.out.println("小明的成绩是D");
          }
      }else {
          System.out.println("输入错误");
      }
    }

}

