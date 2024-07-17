class WatchShop{
static String watchNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;
	
	public static boolean addWatcheNames(String watchName){
	boolean isWatchAdded = false;
	if(watchName != null && index<watchNames.length){
	watchNames[index]=watchName;
	index++;
	isWatchAdded = true;
	}
	return isWatchAdded;
	}
	
	public static void getWatchBrands(){
		System.out.println("the Watch Brands Available are:");
		for(int i=0;i<watchNames.length;i++) System.out.println(watchNames[i]);
		
		
	}
	public static boolean updateWatchBrands(String oldWatchBrand,String newWatchBrand){
		boolean isUpdated = false;
		for(int i =0;i<watchNames.length;i++){
			if(oldWatchBrand == watchNames[i]){
				watchNames[i] = newWatchBrand;
				System.out.println(oldWatchBrand+"is Updated with"+newWatchBrand);
			isUpdated=true;
			}
			
		}if(isUpdated = false) System.out.println("guru nin athra "+oldWatchBrand+" brand watches ilve ila :-[");
		
		
	return isUpdated;
	}
}

	

