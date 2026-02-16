package com.gla.assignment7.Part1.Level1.Level2;
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(int qty) {
        quantity += qty;
    }

    public void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough quantity to remove!");
    }

    public void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }
}

class Main5 {
    public static void main(String[] args) {
        CartItem item = new CartItem("Headphones", 2000, 1);
        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}

