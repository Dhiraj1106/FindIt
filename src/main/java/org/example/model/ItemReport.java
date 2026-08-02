package org.example.model;

import java.sql.Date;

public class ItemReport {

    private int itemId;
    private String itemName;
    private String category;
    private String description;
    private String location;
    private String reportType;
    private String status;
    private Date reportDate;
    private int studentId;

    // Default Constructor
    public ItemReport() {
    }

    // Parameterized Constructor
    public ItemReport(int itemId, String itemName, String category,
                      String description, String location,
                      String reportType, String status,
                      Date reportDate, int studentId) {

        this.itemId = itemId;
        this.itemName = itemName;
        this.category = category;
        this.description = description;
        this.location = location;
        this.reportType = reportType;
        this.status = status;
        this.reportDate = reportDate;
        this.studentId = studentId;
    }

    // Getters and Setters
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "ItemReport{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", category='" + category + '\'' +
                ", location='" + location + '\'' +
                ", reportType='" + reportType + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}