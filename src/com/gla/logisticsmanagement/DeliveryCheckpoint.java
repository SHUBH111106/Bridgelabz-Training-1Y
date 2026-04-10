package com.gla.logisticsmanagement;
class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String location, double distance, int expected, int actual) {
        super(id, location, distance, expected, actual);
    }
    @Override
    public double calculatePenalty() {
        return isDelayed() ? (actualDuration - expectedDuration) * 2.0 : 0.0;
    }
    @Override
    public boolean isCritical() { return true; }
    @Override
    public String getType() { return "DeliveryCheckpoint"; }
}
