package org.example.service;

import org.example.dao.StudentDAO;
import org.example.model.Student;

public class StudentService {

    private StudentDAO studentDAO = new StudentDAO();

    public boolean registerStudent(Student student) {

        return studentDAO.registerStudent(student);
    }

    public Student loginStudent(String email, String password) {

        return studentDAO.loginStudent(email, password);

    }

    }