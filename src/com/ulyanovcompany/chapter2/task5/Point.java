package com.ulyanovcompany.chapter2.task5;

public final class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(getX() + x, getY() + y);
    }

    public Point scale(double size) {
        return new Point(getX() * size, getY() * size);
    }
}
