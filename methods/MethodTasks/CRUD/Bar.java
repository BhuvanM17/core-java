class Bar{

	static String wineBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	public static boolean addWineBrands(String wineBrand){
		boolean isWineBrandAdded = false;
		
		if(wineBrand != null && index<wineBrands.length){
			wineBrands[index]	=	wineBrand;
				index++;
				isWineBrandAdded = true;
		}
		
	return isWineBrandAdded;	
	}
	
	public static void getWineBrands(){
		System.out.println("the Wine Brands Available are");
		for(int i=0;i<wineBrands.length;i++) System.out.println(wineBrands[i]);
	}
	
	public static boolean updateWineBrands(String oldWineBrand,String newWineBrand){
		boolean isBrandNameUpdated = false;
		for(int i=0;i<wineBrands.length;i++){
			if(oldWineBrand == wineBrands[i]){
				wineBrands[i]	=	newWineBrand;
				System.out.println(oldWineBrand +"been replaced with new brand "+newWineBrand);
				isBrandNameUpdated = true;
			}
		}	
	return isBrandNameUpdated;	
	}
	
	

}