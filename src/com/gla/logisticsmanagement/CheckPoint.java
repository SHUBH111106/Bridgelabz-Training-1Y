package com.gla.logisticsmanagement;
// Abstract base class for all checkpoints
abstract class CheckPoint {
    String name;
    double expectedTime; // in minutes
    double actualTime;   // in minutes
    double distance;

    public CheckPoint(String name, double expectedTime, double actualTime, double distance) {
        this.name = name;
        this.expectedTime = expectedTime;
        this.actualTime = actualTime;
        this.distance = distance;
    }

    public double getDelay() {
        return Math.max(0, actualTime - expectedTime);
    }

    abstract double calculatePenalty();
}

// Specialized Checkpoints














//public class CheckPoint {
//    private int checkpointId;
//    private String checkPointName ;
//    private float distanceFromLast;
//    private float expectedDuration;
//    private float actualDuration;
//
//    public int getCheckpointId() {
//        return checkpointId;
//    }
//
//    public void setCheckpointId(int checkpointId) {
//        this.checkpointId = checkpointId;
//    }
//
//    public String getCheckpointname() {
//        return checkPointName;
//    }
//
//    public void setCheckpointname(String checkPointName) {
//        this.checkPointName = checkPointName;
//    }
//
//    public float getDistanceFromLast() {
//        return distanceFromLast;
//    }
//
//    public void setDistanceFromLast(float distanceFromLast) {
//        this.distanceFromLast = distanceFromLast;
//    }
//
//    public float getExpectedDuration() {
//        return expectedDuration;
//    }
//
//    public void setExpectedDuration(float expectedDuration) {
//        this.expectedDuration = expectedDuration;
//    }
//
//    public float getActualDuration() {
//        return actualDuration;
//    }
//
//    public void setActualDuration(float actualDuration) {
//        this.actualDuration = actualDuration;
//    }
//}
