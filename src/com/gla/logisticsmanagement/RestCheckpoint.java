package com.gla.logisticsmanagement;

public class RestCheckpoint extends CheckPoint {

    public RestCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() { return false; }
    public String getType() { return "RestCheckpoint"; }

    public double calculatePenalty() {
        return getDelay() > 30 ? getDelay() * 0.5 : 0;
    }
}