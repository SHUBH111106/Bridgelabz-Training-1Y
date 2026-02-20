package com.gla.EmployeeManagemnetSystem;

import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new FullTimeEmployee(1,"Shubh",50000));
        list.add(new PartTimeEmployee(2,"Rahul",500,20));

        for(Employee e : list) {
            e.assignDepartment("IT");
            e.displayDetails();
        }
    }
}
