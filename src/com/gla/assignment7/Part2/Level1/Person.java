package com.gla.assignment7.Part2.Level1;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "Shubh";
        this.age = 19;
    }


    public void display() {
        System.out.println(name + " | " + age);
    }
    public static class Main {
        public static void main(String[] args) {

            Person p1 = new Person();
            p1.display();
        }
    }
}
