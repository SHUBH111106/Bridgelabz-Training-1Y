package com.gla.logisticsmanagement;

public class LogisticsManagement {

    public static void main(String[] args) {

        // ================= DRIVER 1 =================
        Driver d1 = new Driver("D101", "Amit Sharma");
        DriverDAO.insertDriver(d1);

        RouteService service1 = new RouteService(d1);

        service1.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 20, 30));
        service1.addCheckpoint(new FuelCheckpoint("C2", "Pump 5", 20, 15, 18));
        service1.addCheckpoint(new RestCheckpoint("C3", "Hotel X", 10, 20, 40));

        printDriverRoute(d1);


        // ================= DRIVER 2 =================
        Driver d2 = new Driver("D102", "Riya Verma");
        DriverDAO.insertDriver(d2);

        RouteService service2 = new RouteService(d2);

        service2.addCheckpoint(new DeliveryCheckpoint("C4", "Hub B", 40, 25, 35));
        service2.addCheckpoint(new FuelCheckpoint("C5", "Pump 9", 15, 10, 10));
        service2.addCheckpoint(new DeliveryCheckpoint("C6", "Client Z", 35, 20, 50));

        printDriverRoute(d2);


        // ================= DRIVER 3 =================
        Driver d3 = new Driver("D103", "Karan Singh");
        DriverDAO.insertDriver(d3);

        RouteService service3 = new RouteService(d3);

        service3.addCheckpoint(new RestCheckpoint("C7", "Motel Y", 12, 15, 50));
        service3.addCheckpoint(new FuelCheckpoint("C8", "Pump 3", 18, 12, 14));
        service3.addCheckpoint(new DeliveryCheckpoint("C9", "Warehouse C", 25, 15, 20));

        printDriverRoute(d3);
    }

    // 🔥 Common method (clean code)
    public static void printDriverRoute(Driver driver) {

        System.out.println("\n===============================");
        System.out.println("Driver: " + driver.getDriverId() + " – " + driver.getName());
        System.out.println("Route Summary:");

        var route = driver.getRouteHistory();

        route.printRoute();

        double dist = route.computeTotalDistance();
        double penalty = route.computeTotalPenalty();

        System.out.println("Total Distance: " + dist);
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + (dist - penalty));

        System.out.println("Critical Check: " +
                (route.checkCritical() ? "Valid" : "Missing"));
    }
}