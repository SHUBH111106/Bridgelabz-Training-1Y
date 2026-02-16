package com.gla.assignment7.Part1.Level1;
class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Main1{
    public static void main(String[] args) {
        Employee emp = new Employee("Shubh Garg", 125, 50000);
        emp.displayDetails();
    }
}

