class SbiBank{
	static String fname;
	static long phone;
	static long adhar;
	static String panId;
	static String janmadina;
	static String avthar;
	static String nominee;
	static boolean isAccountCreated = false;
	public static boolean creatAccount(String fullName,long phoneNumber,long adharNumber,String pan,String dob,String gender,String nomine){
	
	boolean isGivenNameValid = false;
	boolean isGivenAdharValid = false;
	boolean isGivenDobValid = false;
	boolean isGivenGenderValid = false;
	boolean isGivenPanValid = false;
	boolean isGivenNomineValid = false;
	boolean isGivenPhoneValid = false;
	if(fullName != null ){
				fname	= fullName;
				isGivenNameValid = true;
	}else{
	System.out.println("enter the full name");
	}
	if(phoneNumber != 0.0){
			phone	=	phoneNumber;
			isGivenPhoneValid = true;
	}else{
	System.out.println("enter the phone number correctly");
	}
	if(adharNumber != 0.0){
			adhar = adharNumber;
			isGivenAdharValid = true;
	}
	else{
		System.out.println("please enter adharNumber correctly");
	}
	if(pan != null){
			panId	= pan;
			isGivenPanValid = true;
	}
	else{
		System.out.println("please enter pan Id correctly");
	}
	if(dob != null){
		janmadina = dob;
		isGivenDobValid = true;
	}
	else{
		System.out.println("please enter dob correctly");
	}
	if(gender != null){
			avthar	= gender;
			isGivenGenderValid = true;
	}
	else{
		System.out.println("please enter gender correctly");
	}
	if(nomine != null){
		nominee = nomine;
		isGivenNomineValid = true;
	}
	else{
		System.out.println("please enter nomine correctly");
	}
	
	if(isGivenNameValid && isGivenAdharValid && isGivenDobValid && isGivenGenderValid && isGivenPanValid && isGivenPhoneValid && isGivenNomineValid){
	isAccountCreated = true ;	
	}
	
	
	
	
	return isAccountCreated;
	}
	public static void fetchDetails(){
		if(isAccountCreated != false){
	
	System.out.println("the name is :"+fname);
	System.out.println("the phoneNumber is :"+phone);
	System.out.println("the adharNumber is :"+adhar);
	System.out.println("the panId is :"+panId);
	System.out.println("the dob is :"+janmadina);
	System.out.println("the gender is :"+avthar);
	System.out.println("the nomine is :"+nominee);
	System.out.println("isAccountCreated"+isAccountCreated);
		}
	}
	




}