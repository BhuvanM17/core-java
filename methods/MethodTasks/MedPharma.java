class MedPharma{

	static String medicinNames[] = {null,null,null,null,null,null};
	static double medPrices[] = {0.0,0.0,0.0,0.0,0.0,0.0};
	
	static int index ;
	static int index1 ;
	
	public static boolean createMedicinName(String medicinName){
	
	boolean isMedicinNameCreated = false;
	if(medicinName != null){
		medicinNames[index] =	medicinName;
		index++;
		isMedicinNameCreated = true;
		}
		else System.out.println("you have entered  invalid medicinName");
		
	return isMedicinNameCreated;
	}
	public static boolean addMedPrices(double medPrice){
		boolean isPriceAdded = false;
		if(medPrice > 0.0){
			medPrices[index1]= medPrice;	
			index1++;
			isPriceAdded = true;
		}
		else System.out.println("enter a valid price");
		
		
	return 	isPriceAdded;
	}
	
	 
	 public static boolean updateMedicine(String oldMed,String newMed,int newPrice){
		 boolean isMedicineUpdated = false;
		  
		  for(int index=0; index<medicinNames.length;index++){
			  if(oldMed == medicinNames[index] ){
				  medPrices[index] = newPrice;
				  medicinNames[index] = newMed;
				  isMedicineUpdated = true;
				  System.out.println(newMed+" updated with "+oldMed+" and price is "+newPrice);
			  }
		  }
		 if(isMedicineUpdated == false) System.out.println("Aste jaga irodu nin shop ali");
		 
		 
		 
	return isMedicineUpdated ;
	 }
	 
	
	 public static void getMedicines(){
		 System.out.println("the medicines available are:");
		 for(String medicinName : medicinNames)
			 System.out.println(medicinName);
		 for(double medPrice :medPrices)
			 System.out.println(medPrice);
		 
	 }
	 
	
}
	

