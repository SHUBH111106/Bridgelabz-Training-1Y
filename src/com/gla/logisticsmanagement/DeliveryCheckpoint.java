package com.gla.logisticsmanagement;

public class DeliveryCheckpoint extends CheckPoint {

    public DeliveryCheckpoint(String id, String location, double distance,
                              double expected, double actual) {
        super(id, location, distance, expected, actual);
    }

    @Override
    public double calculatePenalty() {
        return isDelayed() ? getDelay() * 2 : 0;
    }

    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public String getType() {
        return "DeliveryCheckpoint";
    }
}