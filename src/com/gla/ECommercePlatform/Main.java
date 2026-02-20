package com.gla.ECommercePlatform;

import java.util.*;

class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Electronics(1, "Laptop", 50000));
        list.add(new Clothing(2, "Shirt", 2000));

        for(Product p : list) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            double finalPrice = p.getPrice() + tax - p.calculateDiscount();
            System.out.println(p.getName() + " Final Price: " + finalPrice);
        }
    }
}