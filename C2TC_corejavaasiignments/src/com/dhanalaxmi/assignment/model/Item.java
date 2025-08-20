// File: com/assignment/model/Item.java
package com.dhanalaxmi.assignment.model;

public class Item {
    private int id;
    private String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void displayInfo() {
        System.out.println("ID: " + id + " | Title: " + title);
    }
}
