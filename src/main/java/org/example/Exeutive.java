package org.example;

import java.util.List;
import java.util.Arrays;

public class Exeutive extends Manager {
    private List<Manager> managerList;

    public Exeutive(String name, Integer salary) {
        super(name, salary);
    }

    public Exeutive(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    public Exeutive(String name, Integer salary, List<Manager> managers) {
        super(name, salary);
        this.managerList = managers;
    }

    public Exeutive(Integer id, String name, Integer salary, List<Manager> managers) {
        super(id, name, salary);
        this.managerList = managers;
    }

    @Override
    public String toString() {
        return "Executive\n" + getInfo() + "Managers: " + managerList;
    }
}
