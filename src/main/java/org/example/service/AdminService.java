package org.example.service;

import org.example.dao.AdminDAO;
import org.example.model.Admin;

public class AdminService {

    private AdminDAO adminDAO = new AdminDAO();

    public Admin loginAdmin(String username, String password){

        return adminDAO.loginAdmin(username,password);

    }

}