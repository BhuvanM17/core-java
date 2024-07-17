class GoldShop{
static String goldItemNames[]={null,null,null,null,null,null,null};
static double goldPrices[]={0.0,0.0,0.0,0.0,0.0,0.0,0.0};
static int index;

	public static boolean addGoldItemNames(String goldItemName,double goldPrice){
		boolean isGoldItemAdded = false;
		
		if(index < goldItemNames.length && goldItemName != null && goldPrice > 0.0){
		
		goldItemNames[index]= goldItemName;
		goldPrices[index]= goldPrice;
		index++;
		
		isGoldItemAdded=true;
		}else  System.out.println(" jaga ila kanana");
	return isGoldItemAdded;
	}
	public static void getGoldDetails(){
		System.out.println("the available gold items are:");
		for(int i=0;i<index;i++){
			System.out.println(goldItemNames[i] +" are available for :"+goldPrices[i]);
			
		}	
	return;	
	}
	public static boolean updateGoldItems(String oldGoldItem,String newGoldItem,double newGoldPrice){
		boolean isGoldItemUpdated = false;
		for(int i=0;i < goldItemNames.length; i++){
			if(oldGoldItem == goldItemNames[i]){
				goldItemNames[i] = newGoldItem;
					goldPrices[i]= newGoldPrice;
			isGoldItemUpdated=true;	
			System.out.println(oldGoldItem+" updated with "+newGoldItem+" and price is "+newGoldPrice);
			}if(isGoldItemUpdated == false) System.out.println(" jaga ila kanana");
		
		
		return isGoldItemUpdated;	
		}
		
		
	return isGoldItemUpdated;	
	}

} 
 