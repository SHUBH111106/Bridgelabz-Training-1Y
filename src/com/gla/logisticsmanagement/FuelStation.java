package com.gla.logisticsmanagement;

class FuelStation extends CheckPoint {
    public FuelStation(String name, double expected, double actual, double distance) {
        super(name, expected, actual, distance);
    }
    @Override
    double calculatePenalty() {
        return getDelay() > 0 ? 10 : 0; // Flat 10 if delayed
    }
}
