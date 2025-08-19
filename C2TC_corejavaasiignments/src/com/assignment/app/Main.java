package com.assignment.app;

import com.assignment.model.Book;
import com.assignment.model.Magazine;
import com.assignment.library.Library;

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
