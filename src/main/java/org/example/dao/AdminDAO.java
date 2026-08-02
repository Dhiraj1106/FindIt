package org.example.dao;

import org.example.database.DBConnection;
import org.example.model.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAO {

    public Admin loginAdmin(String username, String password) {

        String sql = "SELECT * FROM admins WHERE username = ? AND password = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Admin admin = new Admin();

                admin.setAdminId(rs.getInt("admin_id"));
                admin.setUsername(rs.getString("username"));
                admin.setPassword(rs.getString("password"));

                return admin;
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }

        return null;
    }

    public void viewAllReports() {

        String sql = "SELECT * FROM items";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            System.out.println("\n========== ALL REPORTS ==========");

            while (rs.next()) {

                System.out.println("--------------------------------");
                System.out.println("Report ID   : " + rs.getInt("item_id"));
                System.out.println("Item Name   : " + rs.getString("item_name"));
                System.out.println("Category    : " + rs.getString("category"));
                System.out.println("Description : " + rs.getString("description"));
                System.out.println("Location    : " + rs.getString("location"));
                System.out.println("Type        : " + rs.getString("report_type"));
                System.out.println("Status      : " + rs.getString("status"));
                System.out.println("Student ID  : " + rs.getInt("student_id"));
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
        }
    }
}