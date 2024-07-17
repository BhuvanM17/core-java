class MedPharmaRunner{

	public static void main(String []medicine){
	 
	boolean isMedAdded = MedPharma.createMedicinName("dolo650");
	boolean priceAdded = MedPharma.addMedPrices(400);
	System.out.println("the added medicine is"+isMedAdded +" and price added is"+priceAdded);
	
	isMedAdded = MedPharma.createMedicinName("paracetmol");
	 priceAdded = MedPharma.addMedPrices(500);
	System.out.println("the added medicine is"+isMedAdded +" and price added is"+priceAdded);
	
	isMedAdded = MedPharma.createMedicinName("saridon");
	 priceAdded = MedPharma.addMedPrices(450);
	System.out.println("the added medicine is"+isMedAdded +" and price added  is"+priceAdded);
	 
	isMedAdded = MedPharma.createMedicinName("powerGin");
	 priceAdded = MedPharma.addMedPrices(650);
	System.out.println("the added medicine is"+isMedAdded +" and price added is"+priceAdded);
	
	isMedAdded = MedPharma.createMedicinName("vicksaction");
	 priceAdded = MedPharma.addMedPrices(350);
	System.out.println("the added medicine is"+isMedAdded +" and price added is"+priceAdded);
	
	 isMedAdded = MedPharma.createMedicinName("crosin");
	 priceAdded = MedPharma.addMedPrices(460);
	 System.out.println("the added medicine is"+isMedAdded +" and price added is"+priceAdded);
	 
	 MedPharma.getMedicines();
	 boolean medupdate = MedPharma.updateMedicine("powerGin","japal matre",77);
	
	 
	MedPharma.getMedicines();
	}


}