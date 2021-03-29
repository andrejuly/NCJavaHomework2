package com.ulyanovcompany.chapter1.task13;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList(Lottery.lottery());
        for (Integer a: arrayList) {
            System.out.println(a);
        }
    }
}
