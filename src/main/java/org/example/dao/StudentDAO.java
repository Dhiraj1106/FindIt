package org.example.dao;

import org.example.database.DBConnection;
import org.example.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO {

    public boolean registerStudent(Student student) {

        String sql = "INSERT INTO students (student_name, email, phone) VALUES (?, ?, ?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getStudentName());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getPhone());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("✅ Student registered successfully!");
                return true;
            } else {
                System.out.println("❌ Failed to register student.");
                return false;
            }

        } catch (SQLException e) {
            System.out.println("Database Error: " + e.getMessage());
            return false;
        }
    }
}