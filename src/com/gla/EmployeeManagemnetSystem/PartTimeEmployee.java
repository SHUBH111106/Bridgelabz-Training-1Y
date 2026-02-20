package com.gla.EmployeeManagemnetSystem;
class PartTimeEmployee extends Employee {
    private int hours;

    public PartTimeEmployee(int id, String name, double rate, int hours) {
        super(id, name, rate);
        this.hours = hours;
    }

    public double calculateSalary() {
        return getBaseSalary() * hours;
    }
}
