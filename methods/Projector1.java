class Projector1{
	
	static boolean isOn;
	
	
	
	public static void onOrOff(){
		System.out.println("----isOn started------");
		 if(isOn == false){
		 isOn = true;
		 System.out.println("projector turned on");
		 
		 }
			else if(isOn == true){
			isOn=false;
			System.out.println("projector turned off");
			}
	
		System.out.println("----isOn ended------");
	
	return;
	}







}