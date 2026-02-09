package com.itheima.loopdemo;

public class whileDemo3 {
    public static void main(String[] args){
        int dividend=143;
        int divisor=8;
        int coint=0;
        while (dividend>=divisor){
            dividend-=divisor;
            coint++;
        }
        System.out.println("商是："+coint);
        System.out.println("余数是："+dividend);
    }
}
