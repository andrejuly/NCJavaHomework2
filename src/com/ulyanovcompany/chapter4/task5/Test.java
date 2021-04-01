package com.ulyanovcompany.chapter4.task5;

import com.ulyanovcompany.chapter4.task4.Circle;
import com.ulyanovcompany.chapter4.task4.Line;
import com.ulyanovcompany.chapter4.task4.Point;
import com.ulyanovcompany.chapter4.task4.Rectangle;


public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Rectangle rectangle = new Rectangle(new Point(1,1),30,50);
        Rectangle rectangleClone1 = (Rectangle) rectangle.clone();
        Rectangle rectangleClone2 = new Rectangle(rectangle); //copy constructor
        rectangleClone2.moveBy(3,5);
        rectangleClone1.moveBy(10,40);

        System.out.println(rectangle);
        System.out.println(rectangleClone1);
        System.out.println(rectangleClone2);

        Circle circle = new Circle(new Point(10,15), 32);
        Circle circleClone = circle.clone();
        Circle circle1 = circle;

        System.out.println(circle);
        System.out.println(circleClone);
        System.out.println(circle1);

        Line line = new Line(new Point(102,132), new Point(123,169));
        Line line1 = line.clone();

        System.out.println(line);
        System.out.println(line1);

    }
}
