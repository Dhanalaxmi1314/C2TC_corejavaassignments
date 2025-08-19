package com.assignment.library;

import com.assignment.model.Item;
import com.assignment.model.Book;
import com.assignment.model.Magazine;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("Library contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("- " + b.getTitle() + " by " + b.getAuthor());
            } else if (item instanceof Magazine) {
                Magazine m = (Magazine) item;
                System.out.println("- " + m.getTitle() + " Issue " + m.getIssueNumber());
            }
        }
    }
}


