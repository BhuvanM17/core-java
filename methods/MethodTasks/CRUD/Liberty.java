class Liberty{
	static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addShoeBrands(String shoeBrand){
	boolean isShoeBrandAdded = false;
	if(shoeBrand != null && index<shoeBrands.length){
		shoeBrands[index]= shoeBrand;
		index++;
		isShoeBrandAdded=true;
	}
	
	return isShoeBrandAdded;
	}
	
	public static void getShoeBrands(){
		for(int i=0;i<shoeBrands.length;i++){
		System.out.println(shoeBrands[i]);
		}	
	}
	 
	 public static boolean updateShoeBrand(String oldshoeBrand,String newShoeBrand){
		boolean isShoeBrandUpdated = false;
		for(int i=0;i<shoeBrands.length;i++){
			if(oldshoeBrand == shoeBrands[i]){
					shoeBrands[i]	=	newShoeBrand;
					System.out.println(oldshoeBrand+"has been replaced with"+newShoeBrand);
					isShoeBrandUpdated = true;
			}
		} if(isShoeBrandUpdated == false ) System.out.println("nin athra ee brand irle ila");
	return isShoeBrandUpdated;	 
	 }

}