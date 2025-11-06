// src/main/java/com/example/library/adapter/LegacyBookImporter.java
package com.example.library.adapter;

import java.util.List;
import java.util.Arrays;

// Ez egy „legacy” osztály (például CSV‐import, amit nem módosítunk)
public class LegacyBookImporter {
    public List<String> importBooks() {
        // Egyszerű példa: minden könyv „Cím, Szerző” formában
        return Arrays.asList(
            "The Hobbit, J.R.R. Tolkien",
            "1984, George Orwell",
            "Clean Code, Robert C. Martin"
        );
    }
}
