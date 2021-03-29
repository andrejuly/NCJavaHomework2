package com.ulyanovcompany.chapter1.task3;

public class MaxInteger {

    public static int maxInteger(int a, int b, int c) {
        int max = (max(a,b) > max(b,c)) ? max(a, b) : max(b,c);
        return max;
    }

    private static int max(int a, int b) {
        int result = (a > b) ? a : b;
        return result;
    }

}
