package com.ulyanovcompany.chapter4.task4;

public class Circle extends Shape implements Cloneable {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return center;
    }

    @Override
    public Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle) super.clone();
        circle.point = new Point(point.getX(), point.getY());
        return circle;
    }
}
