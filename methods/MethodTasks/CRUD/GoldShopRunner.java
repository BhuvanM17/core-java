class GoldShopRunner {
    public static void main(String[] gold) {
        boolean isGoldAdded = GoldShop.addGoldItemNames("Necklace", 170000);
        System.out.println("Gold item added: " + isGoldAdded);
		
        isGoldAdded = GoldShop.addGoldItemNames("Gold Ring", 38000.0);
        System.out.println("Gold item added: " + isGoldAdded);
		
		isGoldAdded = GoldShop.addGoldItemNames("Gold Bracelets", 300000);
        System.out.println("Gold item added: " + isGoldAdded);
		
		isGoldAdded = GoldShop.addGoldItemNames("Gold Earrings", 150000.0);
        System.out.println("Gold item added: " + isGoldAdded);
		
		isGoldAdded = GoldShop.addGoldItemNames("Gold Chains", 197000.0);
        System.out.println("Gold item added: " + isGoldAdded);
		
		isGoldAdded = GoldShop.addGoldItemNames("Gold Biscate", 200000.0);
        System.out.println("Gold item added: " + isGoldAdded);
		
		//isGoldAdded = GoldShop.addGoldItemNames("Gold Coins", 300000.0);
        //System.out.println("Gold item added: " + isGoldAdded);
		
		 GoldShop.getGoldDetails();
		
		
		
		boolean isGoldUpdated = GoldShop.updateGoldItems("Necklace","Gold Bangles",332999);


        GoldShop.getGoldDetails();
    }
}
