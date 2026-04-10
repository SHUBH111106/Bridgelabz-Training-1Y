package com.gla.logisticsmanagement;
class DeliveryPoint extends CheckPoint {
    public DeliveryPoint(String name, double expected, double actual, double distance) {
        super(name, expected, actual, distance);
    }
    @Override
    double calculatePenalty() {
        return getDelay() * 2; // (actual - expected) * 2
    }
}