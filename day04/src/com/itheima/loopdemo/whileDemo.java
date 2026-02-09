package com.itheima.loopdemo;

public class whileDemo {
    public static void main(String[] args){
        double heiwei=8844430;
        double paper=0.1;
        int count=0;
        while (paper<=heiwei) {
            paper*=2;
            count++;

        }
        System.out.println("需要折叠"+count+"次");
    }
}
