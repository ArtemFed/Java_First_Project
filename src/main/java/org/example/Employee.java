package org.example;

import java.util.TreeSet;

public abstract class Employee {
    private static TreeSet<Integer> idList =  new TreeSet<Integer>();
    private Integer id = 0;

    public Integer getId() {
        return id;
    }

    private String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer salary = 0;

    public Integer getSalary() {
        return salary;
    }

    public void increaseSalary(Integer difference) {
        this.salary += difference;
    }

    public void reduceSalary(Integer difference) {
        this.salary -= difference;
    }

    public Employee(String name, Integer salary) {
        this.name = name;
        this.salary = salary;

        if (idList.isEmpty()) {
            idList.add(0);
        }

        idList.add(idList.last() + 1);
    }

    public Employee(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

        if (idList.isEmpty()) {
            idList.add(0);
        }

        if (idList.contains(id)) {
            idList.add(idList.last() + 1);
        } else {
            idList.add(id);
        }
    }


    @Override
    public String toString() {
        return "Id: " + getId() + "\nName: " + getName() + "\nSalary: " + getSalary() + "\n";
    }
}
