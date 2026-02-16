package com.gla.assignment7.Part2.Level3;
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    public void display() {
        System.out.println(employeeID + " | " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 201;
        m.department = "IT";
        m.setSalary(80000);
        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}

