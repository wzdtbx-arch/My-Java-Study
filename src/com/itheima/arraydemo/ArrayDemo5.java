package com.itheima.arraydemo;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0, j = arr.length; i < j; i++, j--) {
        int temp=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;

        }
        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}