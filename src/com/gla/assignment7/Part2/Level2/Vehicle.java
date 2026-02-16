package com.gla.assignment7.Part2.Level2;
class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType + " | Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Shubh", "Car");
        v.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v.displayVehicleDetails();
    }
}

