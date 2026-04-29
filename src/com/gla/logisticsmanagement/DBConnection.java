package com.gla.logisticsmanagement;

import java.sql.*;

public class DBConnection {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/logistics_db",
                "root",
                "Shubh123!"
        );
    }
}