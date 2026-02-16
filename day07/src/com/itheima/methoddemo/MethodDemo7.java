package com.itheima.methoddemo;

public class MethodDemo7 {
    public static void main(String[] args) {
        compare(10,10);
        compare((byte)10,(byte)10);
        compare((short)10,10);
        compare(10L,20);

    }
    public static void compare(int a1, int a2) {
        System.out.println(a1 ==a2);
        System.out.println("int");

    }

    public static void compare(byte b1, byte b2) {
        System.out.println(b1== b2);
        System.out.println("int");
    }

    public static void compare(short c1, int c2) {
        System.out.println(c1 ==c2 );
        System.out.println("int");
    }


    public static void compare(long d1, int d2) {
        System.out.println(d1 == d2);
        System.out.println("int");
    }
}