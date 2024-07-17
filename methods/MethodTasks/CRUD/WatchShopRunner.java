class WatchShopRunner{

	public static void main(String []brands){
	
	boolean addbrands = WatchShop.addWatcheNames("Tissot");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Titan");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Omega");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Fossil");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Casio");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Citizen");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Diesel");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Seiko");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Emporio Armani");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.addWatcheNames("Michael Kors");
	System.out.println("the added watchbrand is "+addbrands);
	
	WatchShop.getWatchBrands();
	boolean isUpdated = WatchShop.updateWatchBrands("Tissot","Rolex");
	
	
	WatchShop.getWatchBrands();
	
	}




}