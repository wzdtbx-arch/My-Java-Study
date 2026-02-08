package jp.co.companyname.projectname.weight;

import java.util.Scanner;

public class weight{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入第一个和尚的身高");
            int height1=sc.nextInt();
            System.out.println("请输入第二个和尚的身高");
            int height2=sc.nextInt();
            System.out.println("请输入第三个和尚的身高");
            int height3=sc.nextInt();
            int max1=height1>height2?height1:height2;
            int max2=max1>height3?max1:height3;
            System.out.println("三个和尚中最高的身高是"+max2);



        }
    }