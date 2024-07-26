package com.xworkz.project;

import com.xworkz.project.dao.ProjectEightDao;
import com.xworkz.project.dto.ProjectEightDto;

public class ProjectEightRunner {
    public static void main(String[] args) {
        // Example of adding a beverage item
        ProjectEightDto Dto = new ProjectEightDto();
        //"B001", "Beer", "Beverage", 5.99, true
        Dto.itemId="123";
        Dto.itemName="OLD MONK";
        Dto.itemPrice=4;
        Dto.itemType="AMRUTHA";
        Dto.isAvailable=true;
        ProjectEightDao dao = new ProjectEightDao();
        dao.addItem(Dto);
        dao.getItemDetails();

    }
}