package com.xworkz.swiggy.dao;

import com.xworkz.swiggy.dto.SwiggyDto;

public class SwiggyDao {
    SwiggyDto dto;

    public boolean placeOrder(SwiggyDto dto) {
        boolean isDtoCreated = false;
        if(dto != null) {
            this.dto = dto;
            isDtoCreated = true;
        }
        return isDtoCreated;
    }

    public void getOrderDetails() {
        System.out.println("Order details:");
        System.out.println("Delivery Location: " + dto.deliveryLocation);
        System.out.println("Customer Name: " + dto.customerName);
        System.out.println("Restaurant Name: " + dto.restaurantName);
        System.out.println("Order Details: " + dto.orderDetails);
        System.out.println("Payment Method: " + dto.paymentMethod);
        System.out.println("Contact Number: " + dto.contactNumber);
        System.out.println("Is Payment Successful: " + dto.isPaymentSuccessful);
        System.out.println("Order ID: " + dto.orderId);
        System.out.println("Security Question: " + dto.securityQuestion);
        System.out.println("Security Answer: " + dto.securityAnswer);
        System.out.println("Captcha: " + dto.captcha);
    }
}





