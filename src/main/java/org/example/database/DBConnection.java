package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/FindIt";
    private static final String USER = "root";
    private static final String PASSWORD = "vortex11";

    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database Connected Successfully!");


        } catch (java.sql.SQLException e) {
            System.out.println("❌ Failed to connect to the database.");
            e.printStackTrace();

        }
        return con;


    }
}
