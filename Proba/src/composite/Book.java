// src/main/java/com/example/library/composite/Book.java
package com.example.library.composite;

public class Book implements LibraryComponent {
    private String title;
    private String author;
    private boolean onLoan = false;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public boolean isOnLoan() { return onLoan; }
    public void borrow() { onLoan = true; }
    public void returnBook() { onLoan = false; }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- Book: " + title + " by " + author
            + (onLoan ? " [on loan]" : ""));
    }
}
