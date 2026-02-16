package com.itheima.test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        boolean b=sum(arr,6);
        System.out.println(b);
    }

    public static boolean sum(int[]arr,int num){
        for (int i=0;i< arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
return false;
    }
}
