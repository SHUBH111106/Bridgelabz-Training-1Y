package com.gla.assignment7.Part2.Level1;
class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Harry Potter";
        this.author = "JK Rowling";
        this.price = 1000;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println(title + " | " + author + " | " + price);
    }

    public static class Main {
        public static void main(String[] args) {

            Book b1 = new Book();
            b1.display();
        }
    }
}

