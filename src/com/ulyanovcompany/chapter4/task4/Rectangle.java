package com.ulyanovcompany.chapter4.task4;

public class Rectangle extends Shape implements Cloneable {

    private Point topLeft;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(new Point(rectangle.point.getX(),rectangle.point.getY()),rectangle.width,rectangle.height);
    }

    @Override
    public Point getCenter() {
        return new Point((point.getX() + width) / 2, (point.getY() + height) / 2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Rectangle clone = (Rectangle) super.clone();
        clone.point = new Point(point.getX(), point.getY());
        return clone;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "X=" + point.getX() +
                ", Y=" + point.getY() +
                '}';
    }
}
