package org.example;

public class Manager extends Employee {
    private Executive executiveHost;

    public Executive getExecutiveHost() {
        return executiveHost;
    }

    public void setExecutiveHost(Executive executiveHost) {
        this.executiveHost = executiveHost;
    }

    public Manager(String name, Integer salary) {
        super(name, salary);
    }

    public Manager(Integer id, String name, Integer salary) {
        super(id, name, salary);
    }

    public Manager(String name, Integer salary, Executive executive) {
        super(name, salary);
        setExecutiveHost(executive);
        executive.managerList.add(this);
    }

    public Manager(Integer id, String name, Integer salary, Executive executive) {
        super(id, name, salary);
        setExecutiveHost(executive);
        executive.managerList.add(this);
    }

    @Override
    protected void autoIncreaseSalary() {
        if (executiveHost.getSalary() != null) {
            increaseSalary(executiveHost.getSalary() / 10);
        } else {
            increaseSalary(10000);
        }
    }

    protected String getInfo() {
        return super.toString();
    }

    @Override
    public String toString() {
        return "Manager\n" + super.toString() + "Director: " + (executiveHost == null ? "null" : executiveHost.getName());
    }
}
