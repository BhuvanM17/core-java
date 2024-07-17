class NprTester{

	public static long Npr(long n,long r){
	
	

	System.out.println("------nPr---------");
	long result=Factorial.fact(n)/Factorial.fact(n-r);
	System.out.println(result);
	System.out.println("------end of npr---------");
return result;
}

}


