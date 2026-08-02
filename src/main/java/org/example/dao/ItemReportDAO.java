package org.example.dao;

import org.example.database.DBConnection;
import org.example.model.ItemReport;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemReportDAO {

    public boolean reportLostItem(ItemReport item) {

        String sql = """
                INSERT INTO items
                (item_name, category, description, location,
                 report_type, status, report_date, student_id)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                """;

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, item.getItemName());
            stmt.setString(2, item.getCategory());
            stmt.setString(3, item.getDescription());
            stmt.setString(4, item.getLocation());

            stmt.setString(5, "LOST");
            stmt.setString(6, "OPEN");

            stmt.setDate(7, item.getReportDate());

            stmt.setInt(8, item.getStudentId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {

            System.out.println("Database Error : " + e.getMessage());

        }

        return false;

    }

}