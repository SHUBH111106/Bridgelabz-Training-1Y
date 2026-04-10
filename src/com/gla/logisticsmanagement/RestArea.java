package com.gla.logisticsmanagement;
class RestArea extends CheckPoint {
    public RestArea(String name, double expected, double actual, double distance) {
        super(name, expected, actual, distance);
    }
    @Override
    double calculatePenalty() {
        double delay = getDelay();
        return delay > 30 ? delay * 0.5 : 0; // (actual - expected) * 0.5 if > 30 min
    }
}