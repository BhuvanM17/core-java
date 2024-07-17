class Girias{

	static String homeAppliances[] = {null, null, null, null, null, null, null, null, null, null, null, null};
	static int index = 0;

	public static boolean createHomeAppliance(String applianceName){

		boolean isApplianceCreated = false;
		if(applianceName != null){
			homeAppliances[index] = applianceName;
			index++;
			isApplianceCreated = true;
		}
		else {
			System.out.println("Invalid appliance name Added");
		}
		
	return isApplianceCreated;
	}

	public static void getHomeAppliances(){
		System.out.println("The home appliances available are:");
		for(String appliance : homeAppliances){
			if(appliance != null)
				System.out.println(appliance);
		}
	}
	public static boolean updateAppliances(String oldAppliances,String newAppliances){
		boolean isUpdated=false;
		for(int i=0;i<homeAppliances.length;i++){
			if(oldAppliances == homeAppliances[i]){
				homeAppliances[i]	= newAppliances;
			isUpdated = true;
			System.out.println(oldAppliances+ "has been replaced with"+newAppliances);
			} 
			
		}if(isUpdated = false) System.out.println("maga aa Applaince nin store ali ilve ila");
	return isUpdated;
	}
	 public static boolean deleteHomeAppliance(String applianceToBeDeleted){
        System.out.println("deleteHomeAppliance Started");
        boolean isApplianceDeleted = false;
        int newIndex, oldIndex;
        for(newIndex=0, oldIndex=0; oldIndex<homeAppliances.length; oldIndex++){
            if(homeAppliances[oldIndex] != null && homeAppliances[oldIndex] == applianceToBeDeleted){
            homeAppliances[newIndex] = homeAppliances[oldIndex];
            newIndex++;
        }
        homeAppliances = Array.copyOf(homeAppliances, newIndex);
        if(homeAppliances != null)
            isApplianceDeleted = true;
        
        if(isApplianceDeleted == false)
            System.out.println("'" + applianceToBeDeleted + "' not found");
        
        System.out.println("deleteHomeAppliance ended");
        return isApplianceDeleted;
    }
}
}