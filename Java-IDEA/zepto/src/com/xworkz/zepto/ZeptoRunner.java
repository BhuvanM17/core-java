package com.xworkz.zepto;

import com.xworkz.zepto.Dao.ZeptoDao;
import com.xworkz.zepto.Dto.ZeptoDto;

public class ZeptoRunner {
    public static void main(String[] args) {
        ZeptoDto dto = new ZeptoDto();
        dto.orderNumber = "1234";
        dto.customerName = "DEV";
        dto.restaurantName = "Tasty Bites";
        dto.orderDetails = "2 x Pizza, 1 x Garlic Bread";
        dto.deliveryAddress = "123 Main Street, Vijaynagar";
        dto.deliveryStatus = "Pending";

        ZeptoDao dao = new ZeptoDao();
        dao.placeOrder(dto);
        dao.getOrderDetails();
    }
}
