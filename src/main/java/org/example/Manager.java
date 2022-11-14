package org.example;

public class Manager extends Employee {
    private Exeutive executiveHost;

    public Exeutive getExecutiveHost() {
        return executiveHost;
    }

    public void setExecutiveHost(Exeutive executiveHost) {
        this.executiveHost = executiveHost;
    }

    public Manager(String name, Integer salary) {
        super(name, salary);
    }

    public Manager(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    public Manager(String name, Integer salary, Exeutive executives) {
        super(name, salary);
        this.executiveHost = executives;
    }

    public Manager(Integer id, String name, Integer salary, Exeutive executives) {
        super(id, name, salary);
        this.executiveHost = executives;
    }

    protected String getInfo() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Manager\n" + super.toString() + "Director: " + (executiveHost == null ? "null" : executiveHost.getName());
    }
}
