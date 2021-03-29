package com.ulyanovcompany.chapter1.task4;

public class SmallestAndLargest {
    public static void main(String[] args) {
        double number = 1.35;
        System.out.println(Math.nextDown(number) + " , " + number + " , " + Math.nextUp(number));
    }
}
