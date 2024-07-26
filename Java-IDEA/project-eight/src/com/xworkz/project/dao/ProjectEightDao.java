package com.xworkz.project.dao;

import com.xworkz.project.dto.ProjectEightDto;

public class ProjectEightDao {

    ProjectEightDto dto;

    // Method to add an item to the BAR menu
    public boolean addItem(ProjectEightDto dto) {
        boolean isDtoCreated = false;
        if (dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    // Method to get item details from the BAR menu
    public void getItemDetails() {
        if (dto != null) {
            System.out.println("Item details:");
            System.out.println("Item ID: " + dto.itemId);
            System.out.println("Item Name: " + dto.itemName);
            System.out.println("Item Type: " + dto.itemType);
            System.out.println("Item Price: $" + dto.itemPrice);
            System.out.println("Availability: " + (dto.isAvailable ? "Available" : "Not Available"));
        } else {
            System.out.println("No item details found.");
        }
    }

}
