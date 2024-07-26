package com.xworkz.playstore;

import com.xworkz.playstore.dao.PlayStoreDao;
import com.xworkz.playstore.dto.PlayStoreDto;

public class PlayStoreRunner {
    public static void main(String[] args) {
        // Example of purchasing an Online Game
        PlayStoreDto onlineGameDto = new PlayStoreDto();
        onlineGameDto.appName = "Fortnite";
        onlineGameDto.appPrice = 200;
        onlineGameDto.category = "Online Games";
        onlineGameDto.customerName = "Bhuvan";
        onlineGameDto.paymentMethod = "Credit Card";
        onlineGameDto.paymentStatus = "Paid";

        PlayStoreDao onlineGameDao = new PlayStoreDao();
        onlineGameDao.purchaseApp(onlineGameDto);
        onlineGameDao.getAppDetails();
    }
}
