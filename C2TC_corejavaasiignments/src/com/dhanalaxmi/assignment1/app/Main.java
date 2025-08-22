package com.dhanalaxmi.assignment1.app;

import inheritance.assignment.library.Library;
import inheritance.assignment.model.Book;
import inheritance.assignment.model.Magazine;

public class Main {
    public static void main(String[] args) {

        // Part A – Inheritance demonstration
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        book.displayInfo();
        magazine.displayInfo();

        // Part B – Composition demonstration
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);

        library.showAllItems();
    }
}
