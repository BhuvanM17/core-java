package org.xworkz.chatshop.Dao;

import org.xworkz.chatshop.Dto.ChatShopDto;

public class ChatShopDao {
     ChatShopDto dto;

    public boolean addItem(ChatShopDto dto) {
        boolean isDtoCreated = false;
        if (dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getItemDetails() {
        if (dto != null) {
            System.out.println("Chaat item details:");
            System.out.println("Item ID: " + dto.itemId);
            System.out.println("Item Name: " + dto.itemName);
            System.out.println("Item Category: " + dto.itemCategory);
            System.out.println("Item Price: $" + dto.itemPrice);
        } else {
            System.out.println("No chaat item details found.");
        }
    }
}
