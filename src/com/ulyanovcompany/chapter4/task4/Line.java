package com.ulyanovcompany.chapter4.task4;

public class Line extends Shape implements Cloneable{

    private Point from;
    private Point to;

    public Line(Point from, Point to) {
        super(null);
        this.from = from;
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((from.getX() + to.getX()/ 2), (from.getY() + to.getY()) / 2);
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line line = (Line) super.clone();
        line.to = new Point(to.getX(), to.getY());
        line.from = new Point(from.getX(), from.getY());
        return line;
    }
}
