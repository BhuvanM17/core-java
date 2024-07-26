package com.xworkz.amazon.Dto;

public class AmazonDto {
    public String productId;
    public String productName;
    public String productCategory;
    public double productPrice;
    public String productManufacturer;

    public AmazonDto(String productId, String productName, String productCategory, double productPrice, String productManufacturer) {
        this.productId = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productManufacturer = productManufacturer;
    }


}

