class BarRunner{

	public static void main(String []wines){
	
	boolean isNameAdded = Bar.addWineBrands("Sula Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Four Seasons Wines");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Grover Zampa Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Fratelli Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("York Winery");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Chandon India");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Charosa Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Reveilo Wines");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Good Earth Winery");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Myra Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Krsma Estates");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Nine Hills Wines");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Vallonné Vineyards");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Seagram's Nine Peaks");
	System.out.println(isNameAdded);
	isNameAdded = Bar.addWineBrands("Renaissance Winery");
	System.out.println(isNameAdded);
	
	boolean isUpdated = Bar.updateWineBrands("Myra Vineyards","Good Drop Wine Cellars");
	
	
	Bar.getWineBrands();
	
	}



}












