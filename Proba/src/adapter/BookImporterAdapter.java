// src/main/java/com/example/library/adapter/BookImporterAdapter.java
package com.example.library.adapter;

import com.example.library.composite.Book;

import java.util.ArrayList;
import java.util.List;

public class BookImporterAdapter {
    private LegacyBookImporter legacyImporter;

    public BookImporterAdapter(LegacyBookImporter importer) {
        this.legacyImporter = importer;
    }

    public List<Book> importBooksAsBooks() {
        List<String> raw = legacyImporter.importBooks();
        List<Book> books = new ArrayList<>();
        for (String line : raw) {
            String[] parts = line.split(",\\s*");
            if (parts.length == 2) {
                books.add(new Book(parts[0], parts[1]));
            }
        }
        return books;
    }
}
