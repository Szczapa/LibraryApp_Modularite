package com.checkout;

import java.util.HashMap;
import java.util.Map;
import com.bookApi.Book;
import com.emailNotification.EmailNotification;
import com.inventory.BookInventory;

public class CheckoutSystem {
    private final EmailNotification emailNotification = new EmailNotification();
    private final Map<Integer, Book> borrowedBooks = new HashMap<>();
    private final BookInventory bookInventory = new BookInventory();

    public void borrowBook(Book book) {

        int bookId = book.getId();

        if (!borrowedBooks.containsKey(bookId)) {
            borrowedBooks.put(bookId, book);
            emailNotification.sendEmail("Book borrowed Successfully");
        }
    }

    public void returnBook(int bookId) {
        if (borrowedBooks.remove(bookId) != null) {
            emailNotification.sendEmail("Book returned successfully.");
        } else {
            System.out.println("Book not found in borrowed list.");
        }
    }
}
