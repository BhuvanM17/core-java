package org.xworkz.chatshop.Dto;

public class ChatShopDto {
    public String itemId;
    public String itemName;
    public String itemCategory;
    public double itemPrice;


    public ChatShopDto(String itemId, String itemName, String itemCategory, double itemPrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemPrice = itemPrice;
    }
}
