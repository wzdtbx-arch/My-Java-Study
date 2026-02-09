package com.itheima.Switchdemo;

public class SwitchDemo1 {
    public static void main(String[] args){
        String noodles="兰州拉面";
        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
                case "米饭":
                System.out.println("吃米饭");
                break;
            case "红烧牛肉面":
                System.out.println("吃红烧牛肉面");
                break;
            default:
                System.out.println("吃面包");
                break;
        }

    }
}
