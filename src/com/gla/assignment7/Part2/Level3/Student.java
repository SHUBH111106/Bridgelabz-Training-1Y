package com.gla.assignment7.Part2.Level3;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    public void display() {
        System.out.println(rollNumber + " | " + name);
    }

    public static void main(String[] args) {
        PostgraduateStudent p = new PostgraduateStudent();
        p.rollNumber = 101;
        p.name = "Shubh";
        p.setCGPA(8.47);
        p.display();
        System.out.println("CGPA: " + p.getCGPA());
    }
}

