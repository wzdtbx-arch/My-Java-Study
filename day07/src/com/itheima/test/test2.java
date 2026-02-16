package com.itheima.test;

public class test2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        int max3= max(arr);
        System.out.println(max3);
    }

    public static int max(int[] arr) {
        int max2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max2) {
                max2 = arr[i];

            }


        }  return max2;
    }
}
