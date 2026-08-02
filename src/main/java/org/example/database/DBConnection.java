package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/FindIt";
    private static final String USER = "root";
    private static final String PASSWORD = "vortex11";

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            Statement stmt = con.createStatement();
            System.out.println("✅ Database Connected Successfully!");


        } catch (java.sql.SQLException e) {
            System.out.println("❌ Failed to connect to the database.");
            e.printStackTrace();

        }
        return null;



    }
}
