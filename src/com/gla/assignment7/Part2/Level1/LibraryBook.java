package com.gla.assignment7.Part2.Level1;
class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available = true;

    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public LibraryBook() {
        this.title = "Haunting Adeline";
        this.author = "HD Carlton";
        this.price = 800;
    }


    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }
    public static class Main{
        static void main(String[] args) {
            LibraryBook l1 = new LibraryBook();
            l1.borrowBook();
        }
    }
}

