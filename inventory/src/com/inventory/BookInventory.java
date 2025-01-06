package com.inventory;
import com.bookApi.Book;
import com.notificationService.NotificationService;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {
    private final List<Book> books = new ArrayList<>();

    private final NotificationService notificationService = new NotificationService();

    public  void addBook(Book book){
        books.add(book);
        notificationService.sendNotification("inventory", "Ajout du livre: " + book.getTitle());
    }

    public List<Book> getBooks(){
        return books;
    }

    public Book getBookById(int id){
        return books.stream().filter(book -> book.getId() == id).findFirst().get();
    }

    public void removeBook(Book book){
        books.remove(book);
        notificationService.sendNotification("inventory", "Suppresion du livre: " + book.getTitle());
    }
}
