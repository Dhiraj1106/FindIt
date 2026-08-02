package org.example.dao;

import org.example.database.DBConnection;
import org.example.model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {

    public boolean registerStudent(Student student) {

        String sql = "INSERT INTO students (student_name, email, phone, password) VALUES (?, ?, ?,?)";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, student.getStudentName());
            stmt.setString(2, student.getEmail());
            stmt.setString(3, student.getPhone());
            stmt.setString(4, student.getPassword());

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

    public Student loginStudent(String email, String password) {

        String sql = "SELECT * FROM students WHERE email = ? AND password = ?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Student student = new Student();

                student.setStudentId(rs.getInt("student_id"));
                student.setStudentName(rs.getString("student_name"));
                student.setEmail(rs.getString("email"));
                student.setPhone(rs.getString("phone"));
                student.setPassword(rs.getString("password"));

                return student;
            }

        } catch (SQLException e) {
            System.out.println("Database Error : " + e.getMessage());
        }

        return null;
    }
}