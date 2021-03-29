package com.ulyanovcompany.chapter1.task13;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] test = Lottery.lottery();
        Arrays.stream(test).sorted().forEach(System.out::println);
    }
}
