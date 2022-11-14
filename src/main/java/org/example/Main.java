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

        Manager manager1 = new Manager("Gandalf The Gray", 9999999, new Exeutive("The King", 200));

        Exeutive director = manager1.getExecutiveHost();

        array.add(programmer1);
        array.add(secretary1);
        array.add(manager1);
        array.add(director);

        for (Employee item: array) {
            System.out.println(item + "\n");
        }
    }
}