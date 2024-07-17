class NcrTester{
	
	public static long Ncr(long n,long r){
		
	System.out.println("------nCr---------");
	long result2=Factorial.fact(n)/(Factorial.fact(n-r)*Factorial.fact(r));
	System.out.println("nCr is "+result2);
	System.out.println("------End of nCr---");
	return result2;
	}
	
	
	
}