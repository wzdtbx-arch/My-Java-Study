package jp.co.companyname.projectname.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("整数を入力してください");
        int number =sc.nextInt();
        int ge=number%10;
        int shi=number/10%10;
        int bai=number/100%10;
        System.out.println("个位是:"+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);



    }
}
