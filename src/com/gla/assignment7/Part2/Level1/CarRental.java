package com.gla.assignment7.Part2.Level1;
class CarRental {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double costPerDay = 1000;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {

        CarRental c1 = new CarRental("Shubh", "Swift", 5);

        System.out.println("Total Cost: " + c1.calculateTotalCost());
    }
}
