package com.xworkz.amazon;

import com.xworkz.amazon.Dao.AmazonDao;
import com.xworkz.amazon.Dto.AmazonDto;

public class AmazonRunner {
    public static void main(String[] args) {

        AmazonDto productDto = new AmazonDto("P001", "Smartphone", "Electronics", 1000, "Apple");

        AmazonDao dao = new AmazonDao();
        dao.addProduct(productDto);
        dao.getProductDetails();
    }
}
