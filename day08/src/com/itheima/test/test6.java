package com.itheima.test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int[] getScores = scores();
        int max = getMax(getScores);
        int min = getMin(getScores);
        int num = he(getScores);
        int pjs = (num - max - min) / (getScores.length - 2);
        System.out.println("去掉首尾后的平均数是:" + pjs);
    }

    public static int[] scores() {
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入学生的评分");
            int score = sc.nextInt();
            if (score <= 100 && score >= 0) {
                scores[i] = score;
                i++;
            } else {
                System.out.println("请输入一个0-100的整数");
            }

        }
        return scores;
    }

    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public static int he(int[] scores) {
        int num = 0;
        for (int i = 0; i < scores.length; i++) {
            num += scores[i];
        }
        return num;
    }
}