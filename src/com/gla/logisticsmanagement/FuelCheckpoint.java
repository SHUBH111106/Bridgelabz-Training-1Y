package com.gla.logisticsmanagement;

public class FuelCheckpoint extends CheckPoint {

    public FuelCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() { return true; }
    public String getType() { return "FuelCheckpoint"; }

    public double calculatePenalty() {
        return isDelayed() ? 10 : 0;
    }
}