package org.example.util;

import org.example.model.Admin;
import org.example.model.Student;
import org.example.service.AdminService;
import org.example.service.StudentService;

import java.sql.Date;
import java.util.Scanner;
import org.example.model.ItemReport;
import org.example.service.ItemReportService;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    // Main Menu
    public void start() {

        while (true) {

            System.out.println("\n=================================");
            System.out.println("            FINDIT");
            System.out.println("    Lost Today, Found Tomorrow");
            System.out.println("=================================");

            System.out.println("1. Student");
            System.out.println("2. Admin");
            System.out.println("3. Exit");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    adminMenu();
                    break;

                case 3:
                    System.out.println("\nThank you for using FindIt!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }

    // Student Menu
    private void studentMenu() {

        while (true) {

            System.out.println("\n========== STUDENT PANEL ==========");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Back");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    registerStudent();
                    break;

                case 2:
                    loginStudent();
                    break;

                case 3:
                    return;

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }

    // Student Registration
    private void registerStudent() {

        Student student = new Student();

        System.out.println("\n===== Student Registration =====");

        System.out.print("Enter Name : ");
        student.setStudentName(sc.nextLine());

        System.out.print("Enter Email : ");
        student.setEmail(sc.nextLine());

        System.out.print("Enter Phone : ");
        student.setPhone(sc.nextLine());

        System.out.print("Create Password : ");
        student.setPassword(sc.nextLine());

        boolean result = studentService.registerStudent(student);

        if (result) {
            System.out.println("\n✅ Student Registered Successfully!");
        } else {
            System.out.println("\n❌ Registration Failed!");
        }
    }
    private void loginStudent() {

        System.out.println("\n===== Student Login =====");

        System.out.print("Enter Email : ");
        String email = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        Student student = studentService.loginStudent(email, password);

        if (student != null) {

            System.out.println("\n==================================");
            System.out.println("Welcome " + student.getStudentName() + "!");
            System.out.println("==================================");

            studentDashboard(student);

        } else {

            System.out.println("\n❌ Invalid Email or Password!");

        }

    }

    private void studentDashboard(Student student) {

        while (true) {

            System.out.println("\n======= STUDENT DASHBOARD =======");
            System.out.println("Welcome : " + student.getStudentName());

            System.out.println("\n1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View My Reports");
            System.out.println("4. Search Item");
            System.out.println("5. Logout");

            System.out.print("\nEnter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    reportLostItem(student);
                    break;

                case 2:
                    System.out.println("comming soon");
                    break;

                case 3:
                    System.out.println("comming soon");
                    break;

                case 4:
                    System.out.println("comming soon");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }

    private void reportLostItem(Student student) {

            ItemReport item = new ItemReport();

            System.out.println("\n===== Report Lost Item =====");

            System.out.print("Item Name : ");
            item.setItemName(sc.nextLine());

            System.out.print("Category : ");
            item.setCategory(sc.nextLine());

            System.out.print("Description : ");
            item.setDescription(sc.nextLine());

            System.out.print("Location Lost : ");
            item.setLocation(sc.nextLine());

            item.setReportType("LOST");
            item.setStatus("OPEN");

            item.setReportDate(new Date(System.currentTimeMillis()));

            item.setStudentId(student.getStudentId());

            if(ItemReportService.reportLostItem(item)){

                System.out.println("\n✅ Lost Item Report Submitted Successfully!");

            }else{

                System.out.println("\n❌ Failed to Submit Report.");

            }

        }



    // Admin Menu
    private void adminMenu() {

        while (true) {

            System.out.println("\n=========== ADMIN PANEL ===========");
            System.out.println("1. Login");
            System.out.println("2. Back");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    loginAdmin();
                    break;

                case 2:
                    return;

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }

    private AdminService adminService = new AdminService();
    private void loginAdmin() {

        System.out.println("\n===== Admin Login =====");

        System.out.print("Username : ");
        String username = sc.nextLine();

        System.out.print("Password : ");
        String password = sc.nextLine();

        Admin admin = adminService.loginAdmin(username,password);

        if(admin!=null){

            System.out.println("\nWelcome Admin!");

            adminDashboard();

        }else{

            System.out.println("\nInvalid Username or Password!");

        }

    }
    private void adminDashboard() {

        while(true){

            System.out.println("\n=========== ADMIN DASHBOARD ===========");

            System.out.println("1. View All Reports");
            System.out.println("2. Update Item Status");
            System.out.println("3. Delete Report");
            System.out.println("4. Return Item");
            System.out.println("5. Logout");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){

                case 1:
                    System.out.println("View Reports Coming Soon...");
                    break;

                case 2:
                    System.out.println("Update Status Coming Soon...");
                    break;

                case 3:
                    System.out.println("Delete Report Coming Soon...");
                    break;

                case 4:
                    System.out.println("Return Item Coming Soon...");
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice!");

            }

        }

    }
}