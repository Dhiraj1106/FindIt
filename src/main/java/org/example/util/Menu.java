package org.example.util;

import org.example.model.Student;
import org.example.service.StudentService;

import java.util.Scanner;

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
                    System.out.println("\nLogin Module Coming Soon...");
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

        boolean result = studentService.registerStudent(student);

        if (result) {
            System.out.println("\n✅ Student Registered Successfully!");
        } else {
            System.out.println("\n❌ Registration Failed!");
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
                    System.out.println("\nAdmin Login Coming Soon...");
                    break;

                case 2:
                    return;

                default:
                    System.out.println("\nInvalid Choice!");
            }
        }
    }
}