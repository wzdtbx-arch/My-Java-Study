package arraydemo;

import java.util.Random;

public class ArrayDeme6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randonindex = r.nextInt(arr.length);
            int temp=arr[i];
             arr[i]=arr[randonindex];
            arr[randonindex]=temp;


        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

        }
    }
}