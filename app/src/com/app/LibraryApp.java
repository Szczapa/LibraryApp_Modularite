package com.app;

import com.checkout.CheckoutSystem;
import com.emailNotification.EmailNotification;
import com.inventory.BookInventory;
import com.notificationService.NotificationService;
import com.reports.InventoryReport;

import com.bookApi.Book;

public class LibraryApp {
    public static void main(String[] args) {
        BookInventory bookInventory = new BookInventory();
        CheckoutSystem checkoutSystem = new CheckoutSystem();
        InventoryReport inventoryReport = new InventoryReport();



        bookInventory.addBook(new Book(1,"rat","ratibox"));
        bookInventory.addBook(new Book(2,"Petite tortue","tortibox"));
        bookInventory.addBook(new Book(3,"Chaperlipopete","chatpito"));

        inventoryReport.GenerateReport();

        Book bookToRemove = bookInventory.getBookById(3);
        bookInventory.removeBook(bookToRemove);

        inventoryReport.GenerateReport();

        checkoutSystem.borrowBook(bookInventory.getBookById(1));
        checkoutSystem.borrowBook(bookInventory.getBookById(2));

        checkoutSystem.returnBook(bookInventory.getBookById(2).getId());


    }
}
