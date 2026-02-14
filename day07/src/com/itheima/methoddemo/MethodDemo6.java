package com.itheima.methoddemo;

public class MethodDemo6 {
    public static void main(String[] args){
        double sum1=getArea(1.6,8.5);
        double sum2=getArea(1.2,8.9);
        if(sum1>sum2){
            System.out.println("第一个长方形面积更大");


        }else{
            System.out.println("第二个长方形面积更大");
        }

    }public static double getArea(double chan,double kuan){
        double  result=chan*kuan;
        return result;


    }



}
