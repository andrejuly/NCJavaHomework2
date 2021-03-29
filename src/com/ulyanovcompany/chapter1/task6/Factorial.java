package com.ulyanovcompany.chapter1.task6;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.valueOf(1);
        for (int i = 1; i < number; i++) {
           factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
