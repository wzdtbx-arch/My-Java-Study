package com.itheima.test;

import java.util.Random;

public class test4 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                chs[i] = (char) (97 + i);
            } else {
                chs[i] = (char) (65 + i - 26);
            }
        }
        Random r = new Random();
        String result = "";
        for (int i = 0; i < 4; i++) {
            int randomChs = r.nextInt(chs.length);
            result += chs[randomChs];
        }
        int randomNum = r.nextInt(10);
        result += randomNum;

        System.out.println(result);
    }
}
