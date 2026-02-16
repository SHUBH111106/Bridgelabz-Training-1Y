package com.gla.assignment7.Part1.Level1.Level2;
class Student {
    private String name;
    private int rollNumber;
    private int marks;

    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

class Main1 {
    public static void main(String[] args) {
        Student s = new Student("Shubh", 12, 88);
        s.displayDetails();
    }
}

