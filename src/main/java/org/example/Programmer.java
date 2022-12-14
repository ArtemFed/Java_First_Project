package org.example;

import java.util.ArrayList;
import java.util.List;

public class Programmer extends Employee implements Gradeable {
    private List<String> projectsList;

    public Programmer(String name, Integer salary) {
        super(name, salary);
    }

    public Programmer(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    @Override
    protected void autoIncreaseSalary() {
        increaseSalary(250000 * projectsList.size());
    }

    public Programmer(String name, Integer salary, List<String> projects) {
        super(name, salary);
        projectsList = projects;
    }

    public Programmer(Integer id, String name, Integer salary, List<String> projects) {
        super(id, name, salary);
        projectsList = projects;
    }


    public List<String> getProjectsList() {
        return projectsList;
    }

    public void addProject(String project) {
        projectsList.add(project);
    }

    public void removeProject(String project) {
        projectsList.remove(project);
    }

    @Override
    public String toString() {
        return "Programmer\n" + super.toString() + "Projects: " + projectsList;
    }

    @Override
    public void autoIncreaseSalaryX2() {
        autoIncreaseSalary();
        autoIncreaseSalary();
    }
}
