package com.gla.assignment7.Part2.Level2;
class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " | " + fee + " | " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 10000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
    }
}

