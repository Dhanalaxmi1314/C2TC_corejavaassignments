package inheritance.assignment.library;

import java.util.ArrayList;
import java.util.List;

import inheritance.assignment.model.Book;
import inheritance.assignment.model.Item;
import inheritance.assignment.model.Magazine;

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


