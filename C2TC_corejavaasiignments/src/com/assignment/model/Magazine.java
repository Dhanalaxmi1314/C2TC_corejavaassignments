package com.assignment.model;

public class Magazine extends Item {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {      // ✅ add this
        return issueNumber;
    }

    @Override
    public void displayInfo() {
        System.out.println("Magazine: [ID: " + getId() + ", Title: " + getTitle() + ", Issue: " + issueNumber + "]");
    }
}

