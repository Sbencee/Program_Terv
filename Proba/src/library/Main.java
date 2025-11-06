package library;

public class Main {

}
// src/main/java/com/example/library/Main.java
package com.example.library;

import com.example.library.facade.LibraryFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryFacade library = new LibraryFacade();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. List all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            String opt = scanner.nextLine();
            switch (opt) {
                case "1":
                    library.displayLibrary();
                    break;
                case "2":
                    System.out.print("Enter title to borrow: ");
                    String t1 = scanner.nextLine();
                    if (library.borrowBook(t1)) {
                        System.out.println("Borrowed successfully.");
                    } else {
                        System.out.println("Could not borrow (maybe already on loan or not found).");
                    }
                    break;
                case "3":
                    System.out.print("Enter title to return: ");
                    String t2 = scanner.nextLine();
                    if (library.returnBook(t2)) {
                        System.out.println("Returned successfully.");
                    } else {
                        System.out.println("Could not return (maybe not on loan or not found).");
                    }
                    break;
                case "0":
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
