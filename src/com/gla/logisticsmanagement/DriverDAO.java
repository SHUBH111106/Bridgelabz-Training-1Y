package com.gla.logisticsmanagement;

import java.sql.*;

public class DriverDAO {

    public static void insertDriver(Driver d) {
        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO drivers VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, d.getDriverId());
            ps.setString(2, d.getName());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}