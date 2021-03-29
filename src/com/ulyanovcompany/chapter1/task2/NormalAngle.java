package com.ulyanovcompany.chapter1.task2;

public class NormalAngle {

    public static int normalAngle(int angle) {
        angle %= 360;
        if (angle < 0) angle += 360;
        return angle;
    }
}
