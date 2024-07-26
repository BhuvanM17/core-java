package org.xworkz.chatshop;

import org.xworkz.chatshop.Dao.ChatShopDao;
import org.xworkz.chatshop.Dto.ChatShopDto;

public class ChatShopRunner {

        public static void main(String[] args) {
            // Example of adding a chaat item
            ChatShopDto itemDto = new ChatShopDto("C001", "Masala Puri", "Spicy Chaat", 10);

            ChatShopDao dao = new ChatShopDao();
            dao.addItem(itemDto);
            dao.getItemDetails();


    }
}
