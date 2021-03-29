package com.ulyanovcompany.chapter3.task2;

import com.ulyanovcompany.chapter3.Employee;
import com.ulyanovcompany.chapter3.Measurable;

public class Test {

    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Vasya", 1000),
                new Employee("Vasya1", 2000),
                new Employee("Vasya2", 3000),
        };

        Employee employee1 = (Employee) largest(employee);

        System.out.println("employee with the largest salary = " + employee1.getName());
    }

    private static Measurable largest(Measurable[] objects) {
        double maxSalary = 0;
        Measurable measurable = null;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i].getMeasure() > maxSalary) {
                maxSalary = objects[i].getMeasure();
                measurable = objects[i];
            }
        }
        return measurable;
    }
}
