package com.itheima.Switchdemo;

public class SwitchDemo2 {
    public static void main(String[]args){
        int num=1;
        switch(num){
            case 1->System.out.println("吃兰州拉面");
            case 2->System.out.println("吃米饭");
            case 3->System.out.println("吃红烧牛肉面");
            default->System.out.println("吃面包");
        }
    }
}
