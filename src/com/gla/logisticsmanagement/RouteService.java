package com.gla.logisticsmanagement;

public class RouteService {

    private Driver driver;

    public RouteService(Driver driver) {
        this.driver = driver;
    }

    public void addCheckpoint(CheckPoint cp) {

        // Memory
        driver.getRouteHistory().addCheckpoint(cp);

        // Database
        CheckpointDAO.insertCheckpoint(cp, driver.getDriverId());

        System.out.println("Stored in LinkedList + DB: " + cp.getCheckpointId());
    }
}