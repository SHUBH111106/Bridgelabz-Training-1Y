package com.gla.assignment7.Part2.Level1;
class Circle {
    private double radius;

    public Circle() {
        this(2); // Calls parameterized constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayArea() {
        System.out.println("Area: " + Math.PI * radius * radius);
    }
    public static class Main {
        public static void main(String[] args) {

            Circle c1 = new Circle();
            c1.displayArea();
        }
    }
}

