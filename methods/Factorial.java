class Factorial{
	public static long fact(long fn){
	long fact=1;
	System.out.println("----fact method started------");
	for(int i=1;i<=fn;i++){
              fact = i*fact;
	}
	System.out.println("----fact method ended------");
	return fact;
	
	}

}
