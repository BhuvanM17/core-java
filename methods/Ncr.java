class NcrTester{
	
	public static long Ncr(String[] ncr){
		
	long n=9;
	long r=4;
	System.out.println("------nCr---------");
	long result2=Factorial.fact(n)/(Factorial.fact(n-r)*Factorial.fact(r));
	System.out.println("nr is "+result2);
	System.out.println("------nCr---------");
	
	}
	
	
	
}