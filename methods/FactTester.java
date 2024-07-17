class FactTester{
	public static void main(String[] F){
	System.out.println("----main started------");
	long fn=20;
	long n=8;
	long r=4;
	long result=Factorial.fact(fn);
	System.out.println("the factorial is "+result);
	long result1=NprTester.Npr(n,r);
	System.out.println("the Npr is "+result1);
	long result2=NcrTester.Ncr(n,r);
	System.out.println("the Ncr is "+result2);
	System.out.println("-----main ended--------");
	}

}