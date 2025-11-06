// src/main/java/com/example/library/service/LoanService.java
package com.example.library.service;

import com.example.library.composite.Book;

public class LoanService {
    public boolean borrowBook(Book book) {
        if (!book.isOnLoan()) {
            book.borrow();
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (book.isOnLoan()) {
            book.returnBook();
            return true;
        }
        return false;
    }
}
