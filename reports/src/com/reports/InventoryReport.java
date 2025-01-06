package com.reports;

import com.inventory.BookInventory;

public class InventoryReport {
    private final BookInventory inventory = new BookInventory();
    public void GenerateReport() {
        System.out.println("Génération du rapport d'inventaire");
        inventory.getBooks().forEach(System.out::println);
    }
}
