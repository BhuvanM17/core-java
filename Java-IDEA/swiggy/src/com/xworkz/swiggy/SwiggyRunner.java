package com.xworkz.swiggy;

import com.xworkz.swiggy.dao.SwiggyDao;
import com.xworkz.swiggy.dto.SwiggyDto;

public class SwiggyRunner {

    public static void main(String[] args) {
        SwiggyDto dto = new SwiggyDto();
        dto.deliveryLocation = "Bangalore";
        dto.customerName = "John Doe";
        dto.restaurantName = "Spice Kitchen";
        dto.orderDetails = "1 x Chicken Biryani, 2 x Butter Naan";
        dto.paymentMethod = "Credit Card";
        dto.contactNumber = "9876543210";
        dto.isPaymentSuccessful = true;
        dto.orderId = "SW12345";
        dto.password = "password@123";
        dto.currentWorkingDirectory = "/home/johndoe";
        dto.securityQuestion = "What is your favorite food?";
        dto.securityAnswer = "Pizza";
        dto.captcha = "7G3F9A";

        SwiggyDao dao = new SwiggyDao();
        dao.placeOrder(dto);
        dao.getOrderDetails();
    }

}
