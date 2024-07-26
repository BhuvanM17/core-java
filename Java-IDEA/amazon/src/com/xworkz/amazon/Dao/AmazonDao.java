package com.xworkz.amazon.Dao;

import com.xworkz.amazon.Dto.AmazonDto;

public class AmazonDao {
    AmazonDto dto;


    public boolean addProduct(AmazonDto dto) {
        boolean isDtoCreated = false;
        if (dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getProductDetails() {
        if (dto != null) {
            System.out.println("Product details:");
            System.out.println("Product ID: " + dto.productId);
            System.out.println("Product Name: " + dto.productName);
            System.out.println("Product Category: " + dto.productCategory);
            System.out.println("Product Price: $" + dto.productPrice);
            System.out.println("Product Manufacturer: " + dto.productManufacturer);
        } else {
            System.out.println("No product details found.");
        }
    }
}
