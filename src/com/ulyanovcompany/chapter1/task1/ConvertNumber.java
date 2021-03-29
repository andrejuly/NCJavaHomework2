package com.ulyanovcompany.chapter1.task1;

public  class ConvertNumber {

    public static String numberToBin(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            stringBuilder.append(number % 2);
            number /= 2;
        }
        return stringBuilder.reverse().toString();
    }

    public static String numberToOct(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            stringBuilder.append(number % 8);
            number /= 8;
        }
        return stringBuilder.reverse().toString();
    }

    public static String numberToHex(int number) {
        String[] digits = new String[] {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
        StringBuilder stringBuilder = new StringBuilder();
        while (number > 0) {
            stringBuilder.append(digits[number % 16]);
            number /= 16;
        }
        return stringBuilder.reverse().toString();
    }


}
