package com.itheima.loopdemo;

public class whileDemo2 {
    public static void main(String[]args){
        int x=12321;
        int temp=x;
        int num=0;
        while (x!=0){
            int ge=x%10;
            x/=10;
            num=num*10+ge;
        }
        //System.out.println(temp);
        //System.out.println(num);
        System.out.println(temp==num);

    }
}
