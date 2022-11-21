package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Employee employee = new Employee(); - error Abstract

        ArrayList<Employee> array = new ArrayList<Employee>();

        Programmer programmer1 = new Programmer("Artem Fedorov", 100000,
                Arrays.asList("Matrix Calc", "Fractals", "Rest Api"));

        Secretary secretary1 = new Secretary(2, "John Tolkien", 5000);

        Manager manager1 = new Manager("Gandalf The Gray", 5000,
                new Executive("The King", 1250000));

        Executive director = manager1.getExecutiveHost();

        array.add(programmer1);
        array.add(secretary1);
        array.add(manager1);
        array.add(director);

        System.out.println("\tFirst:");
        for (Employee item : array) {
            System.out.println(item + "\n");
        }

        programmer1.autoIncreaseSalary();
        manager1.autoIncreaseSalary();
        director.autoIncreaseSalary();

        System.out.println("\n\tSecond:");
        for (Employee item : array) {
            System.out.println(item + "\n");
            if (item instanceof Gradeable gradeable) {
                gradeable.autoIncreaseSalaryX2();
            }
        }

        System.out.println("\n\tThird:");
        for (Employee item : array) {
            System.out.println(item + "\n");
        }
    }
}