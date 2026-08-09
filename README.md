# 🔍 FindIt

> **Lost Today, Found Tomorrow.**

FindIt is a **Campus Lost & Found Management System** built using **Java, JDBC, and MySQL**.

The purpose of FindIt is to provide a simple, organized way for students to report lost or found items and for administrators to manage those reports.

This is currently a **console-based JDBC project developed as a Java/Advanced Java class project**.

---

## 📌 Problem

Currently, lost and found information on campus can be shared through emails or other communication channels.

While this works, it can become difficult to:

- Track multiple lost and found reports
- Search through previous reports
- Maintain organized records
- Manage the current status of an item
- Keep student and admin operations separate

FindIt aims to organize this process into a dedicated system.

---

## 💡 Solution

FindIt provides separate interfaces for:

### 👨‍🎓 Student

Students can:

- Register their account
- Login
- Report a lost item
- Report a found item

### 👨‍💼 Admin

Administrators can:

- Login
- Access the admin panel
- Manage lost and found records

---

## ✨ Current Features

### Student Module

- ✅ Student Registration
- ✅ Student Login
- ✅ Report Lost Item
- ✅ Report Found Item
- ✅ Student Dashboard

### Admin Module

- ✅ Admin Login
- ✅ Admin Dashboard
- 🚧 Report Management

### JDBC Features

- ✅ JDBC Database Connection
- ✅ `PreparedStatement`
- ✅ `ResultSet`
- ✅ `INSERT`
- ✅ `SELECT`
- ✅ Exception Handling
- ✅ DAO Pattern
- ✅ Service Layer
- 🚧 Batch Processing
- 🚧 Transaction Management

---

## 🛠️ Technology Stack

| Technology | Purpose |
|------------|---------|
| Java | Application development |
| JDBC | Database connectivity |
| MySQL | Data storage |
| Maven | Project and dependency management |
| IntelliJ IDEA | Development |
| Git | Version control |

---

## 🏗️ Project Architecture

FindIt follows a simple layered architecture:

```text
                 User
                   │
                   ▼
                Menu
                   │
                   ▼
               Service
                   │
                   ▼
                  DAO
                   │
                   ▼
              DBConnection
                   │
                   ▼
                MySQL
```

### 📁 Package Structure

```text
org.example
│
├── dao
│   ├── StudentDAO
│   ├── AdminDAO
│   └── ItemReportDAO
│
├── database
│   └── DBConnection
│
├── model
│   ├── Student
│   ├── Admin
│   ├── ItemReport
│   └── ReturnHistory
│
├── service
│   ├── StudentService
│   └── AdminService
│
├── util
│   ├── Menu
│   └── Validation
│
└── Main
```

---

## 🔄 Application Flow

### Student Flow

```text
Main Menu
    │
    ▼
Student
    │
    ├── Register
    │
    └── Login
          │
          ▼
    Student Dashboard
          │
          ├── Report Lost Item
          │
          └── Report Found Item
```

### Admin Flow

```text
Main Menu
    │
    ▼
Admin
    │
    ▼
Login
    │
    ▼
Admin Dashboard
```

---

## 🗄️ Database

The project uses **MySQL** as its relational database.

Main tables include:

```text
students
admins
items
return_history
```

### Students

Stores student information such as:

- Student ID
- Name
- Email
- Phone
- Password

### Admins

Stores administrator login information.

### Items

Stores lost and found item reports.

### Return History

Designed to maintain records when an item is returned.

---

## 🔌 JDBC Implementation

FindIt uses JDBC to communicate with MySQL.

Basic flow:

```text
Java Application
       │
       ▼
JDBC
       │
       ▼
MySQL
```

The project uses `PreparedStatement` for parameterized SQL queries.

Example:

```java
String sql =
        "INSERT INTO students (student_name, email, phone, password) " +
        "VALUES (?, ?, ?, ?)";

PreparedStatement stmt = conn.prepareStatement(sql);
```

---

## 🎯 Why FindIt?

FindIt is designed to improve the organization of campus lost and found information.

Instead of keeping information scattered across communication channels, the system provides a structured database where reports can be stored and managed.

---

## 🚧 Current Version

**Version: 1.0 — Console-Based JDBC Application**

Currently implemented:

```text
✅ Database
✅ JDBC Connection
✅ Project Architecture
✅ Student Registration
✅ Student Login
✅ Lost Item Reporting
✅ Found Item Reporting
✅ Admin Login
✅ Admin Panel
```

The project is still under development.

---

## 🔮 Future Scope

The project can be extended into a complete web application.

Possible future improvements:

- Spring Boot Backend
- Angular Frontend
- REST APIs
- JWT Authentication
- Image Upload for Items
- Email Notifications
- Item Search
- Item Status Tracking
- QR Code Based Verification
- Batch Processing
- Transaction Management
- Mobile Application

---

## 🎓 Academic Purpose

FindIt was developed to demonstrate practical implementation of:

- Java
- OOP
- JDBC
- MySQL
- DAO Pattern
- Service Layer
- CRUD Operations
- Exception Handling
- Database Connectivity

---

## 👨‍💻 Developer

**Dhiraj Sarangi**

BCA Student  
Java Backend Development

---

## 📌 Project Status

🚧 **Currently Under Development**

This repository represents **Version 1 of FindIt**, focused on building the core Java + JDBC functionality.

---

## ⭐ Future Vision

> **FindIt — Lost Today, Found Tomorrow.**

The long-term goal is to transform FindIt from a console-based academic project into a complete **digital campus Lost & Found platform**.
