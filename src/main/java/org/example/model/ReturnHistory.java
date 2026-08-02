package org.example.model;

import java.sql.Date;

public class ReturnHistory {

    private int historyId;
    private int itemId;
    private int studentId;
    private int returnedBy;
    private Date returnDate;

    // Default Constructor
    public ReturnHistory() {
    }

    // Parameterized Constructor
    public ReturnHistory(int historyId, int itemId, int studentId,
                         int returnedBy, Date returnDate) {
        this.historyId = historyId;
        this.itemId = itemId;
        this.studentId = studentId;
        this.returnedBy = returnedBy;
        this.returnDate = returnDate;
    }

    // Getters and Setters
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getReturnedBy() {
        return returnedBy;
    }

    public void setReturnedBy(int returnedBy) {
        this.returnedBy = returnedBy;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "ReturnHistory{" +
                "historyId=" + historyId +
                ", itemId=" + itemId +
                ", studentId=" + studentId +
                ", returnedBy=" + returnedBy +
                ", returnDate=" + returnDate +
                '}';
    }
}