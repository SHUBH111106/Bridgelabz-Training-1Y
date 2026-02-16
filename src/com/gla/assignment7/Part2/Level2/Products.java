package com.gla.assignment7.Part2.Level2;
class Product {

    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println(productName + " | " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Mobile", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.displayTotalProducts();
    }
}

