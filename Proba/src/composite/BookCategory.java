// src/main/java/com/example/library/composite/BookCategory.java
package com.example.library.composite;

import java.util.ArrayList;
import java.util.List;

public class BookCategory implements LibraryComponent {
    private String name;
    private List<LibraryComponent> children = new ArrayList<>();

    public BookCategory(String name) {
        this.name = name;
    }

    public void add(LibraryComponent component) {
        children.add(component);
    }

    public void remove(LibraryComponent component) {
        children.remove(component);
    }

    public List<LibraryComponent> getChildren() {
        return children;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ Category: " + name);
        for (LibraryComponent comp : children) {
            comp.display(indent + "  ");
        }
    }
}
