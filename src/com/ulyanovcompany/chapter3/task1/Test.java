package com.ulyanovcompany.chapter3.task1;

import com.ulyanovcompany.chapter3.Employee;
import com.ulyanovcompany.chapter3.Measurable;

public class Test {

    public static void main(String[] args) {

        Employee[] employee = {
                new Employee("Vasya", 1000),
                new Employee("Vasya1", 2000),
                new Employee("Vasya2", 3000),
        };

        System.out.println("average salary = " + average(employee));
    }

    private static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; i++) {
            sum += objects[i].getMeasure();
        }
        return sum / objects.length;
    }


}
