package com.xworkz.zepto.Dao;

import com.xworkz.zepto.Dto.ZeptoDto;

public class ZeptoDao {
    ZeptoDto dto;

    public boolean placeOrder(ZeptoDto dto) {
        boolean isDtoCreated = false;
        if(dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getOrderDetails() {
        if (dto != null) {
            System.out.println("Order details:");
            System.out.println("Order Number: " + dto.orderNumber);
            System.out.println("Customer Name: " + dto.customerName);
            System.out.println("Restaurant Name: " + dto.restaurantName);
            System.out.println("Order Details: " + dto.orderDetails);
            System.out.println("Delivery Address: " + dto.deliveryAddress);
            System.out.println("Delivery Status: " + dto.deliveryStatus);
        } else {
            System.out.println("No order details found.");
        }
    }
}
