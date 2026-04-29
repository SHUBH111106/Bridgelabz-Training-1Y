package com.gla.logisticsmanagement;

import java.sql.*;

public class CheckpointDAO {

    public static void insertCheckpoint(CheckPoint cp, String driverId) {

        try (Connection conn = DBConnection.getConnection()) {

            String sql = "INSERT INTO checkpoints(checkpoint_id, driver_id, type, location, distance, expected, actual, penalty) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, cp.getCheckpointId());
            ps.setString(2, driverId);
            ps.setString(3, cp.getType());
            ps.setString(4, cp.locationName);
            ps.setDouble(5, cp.distanceFromLast);
            ps.setDouble(6, cp.expectedDuration);
            ps.setDouble(7, cp.actualDuration);
            ps.setDouble(8, cp.calculatePenalty());

            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}