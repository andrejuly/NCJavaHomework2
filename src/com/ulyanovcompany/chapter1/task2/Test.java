package com.ulyanovcompany.chapter1.task2;

public class Test {
    public static void main(String[] args) {
        System.out.println( NormalAngle.normalAngle(-14));
        System.out.println( NormalAngle.normalAngle(-1));
        System.out.println( NormalAngle.normalAngle(174));
        System.out.println(Math.floorMod(-14,360));
        System.out.println(Math.floorMod(-1,360));
        System.out.println(Math.floorMod(174,360));
    }
}
