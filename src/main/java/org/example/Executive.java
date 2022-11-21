package org.example;

import java.util.ArrayList;
import java.util.List;

public class Executive extends Manager implements Gradeable {
    protected List<Manager> managerList = new ArrayList<>();

    public Executive(String name, Integer salary) {
        super(name, salary);
    }

    public Executive(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    public Executive(String name, Integer salary, List<Manager> managers) {
        super(name, salary);
        this.managerList = managers;
    }

    public Executive(Integer id, String name, Integer salary, List<Manager> managers) {
        super(id, name, salary);
        this.managerList = managers;
    }

    @Override
    protected void autoIncreaseSalary() {
        increaseSalary(getSalary());
    }

    @Override
    public String toString() {
        return "Executive\n" + getInfo() + "Managers: " + managerList;
    }

    @Override
    public void autoIncreaseSalaryX2() {
        autoIncreaseSalary();
        autoIncreaseSalary();
    }
}
