package com.gla.logisticsmanagement;

public class Driver {

    private String driverId;
    private String name;
    private RouteLinkedList<CheckPoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    public RouteLinkedList<CheckPoint> getRouteHistory() {
        return routeHistory;
    }
}