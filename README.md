# NCJavaHomework2

Chapter 1

1. Write a program that reads an integer and prints it in binary, octal, and
hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
2. Write a program that reads an integer angle (which may be positive or
negative) and normalizes it to a value between 0 and 359 degrees. Try
it first with the % operator, then with floorMod.
3. Using only the conditional operator, write a program that reads three
integers and prints the largest. Repeat with Math.max.
4. Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.
6. Write a program that prints the smallest and largest positive double values.
Hint: Look up Math.nextUp in the Java API.
13. Write a program that prints a lottery combination, picking six distinct
numbers between 1 and 49. To pick six distinct numbers, start with an
array list filled with 1...49. Pick a random index and remove the element.
Repeat six times. Print the result in sorted order.

Chapter 2

5. Implement an immutable class Point that describes a point in the plane.
Provide a constructor to set it to a specific point, a no-arg constructor to
set it to the origin, and methods getX, getY, translate, and scale. The translate
method moves the point by a given amount in x- and y-direction. The
scale method scales both coordinates by a given factor. Implement these
methods so that they return new points with the results. For example,
Point p = new Point(3, 4).translate(1, 3).scale(0.5);
should set p to a point with coordinates (2, 3.5).
9. Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves. Provide methods to drive by a given number of
miles, to add a given number of gallons to the gas tank, and to get the
current distance from the origin and fuel level. Specify the fuel efficiency
(in miles/gallons) in the constructor. Should this be an immutable class?
Why or why not?

Chapter 3

1. Provide an interface Measurable with a method double getMeasure() that measures an object in some way. Make Employee implement Measurable. Provide
a method double average(Measurable[] objects) that computes the average
measure. Use it to compute the average salary of an array of employees.
2. Continue with the preceding exercise and provide a method Measurable
largest(Measurable[] objects). Use it to find the name of the employee with
the largest salary. Why do you need a cast?

Chapter 4

4. Define an abstract class Shape with an instance variable of class Point, a
constructor, a concrete method public void moveBy(double dx, double dy) that
moves the point by the given amount, and an abstract method public Point
getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
double height), and public Line(Point from, Point to).
5. Define clone methods for the classes of the preceding exercise.




