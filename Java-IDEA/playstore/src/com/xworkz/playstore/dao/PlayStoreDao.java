package com.xworkz.playstore.dao;

import com.xworkz.playstore.dto.PlayStoreDto;

public class PlayStoreDao {
    PlayStoreDto dto;

    public boolean purchaseApp(PlayStoreDto dto) {
        boolean isDtoCreated = false;
        if(dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getAppDetails() {
        if (dto != null) {
            System.out.println("App details:");
            System.out.println("App Name: " + dto.appName);
            System.out.println("Category: " + dto.category);
            System.out.println("Price: $" + dto.appPrice);
            System.out.println("Customer Name: " + dto.customerName); // Added for illustration
            System.out.println("Payment Method: " + dto.paymentMethod); // Added for illustration
            System.out.println("Payment Status: " + dto.paymentStatus); // Added for illustration
        } else {
            System.out.println("No app details found.");
        }
    }
}
