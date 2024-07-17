import java.util.Scanner;
class Person{
		public static void main(String args[]){
			Scanner scan= new Scanner(System.in);
			System.out.println("person ID");
			int pId = scan.nextInt();
			System.out.println("person name");
			String pName = scan.next();
			System.out.println("enter contact number");
			String contactNumber = scan.next();
			System.out.println("enter email id");
			String email = scan.next();
			System.out.println("enter your date of birth");
			String dob = scan.next();
			System.out.println("enter your addresss");
			String address = scan.next();
			System.out.println("enter your adhar number");
			String adharNumber = scan.next();
			System.out.println("enter ur pan number");
			String pan = scan.next();
			System.out.println("enter ur blood group");
			String bloodGroup = scan.next();
			System.out.println("enter your gender");
			 String gender = scan.next();
			 System.out.println("------------PERSON INFORMATION----------------");
			System.out.println("person ID : "+ pId);
			System.out.println("person name "+ pName);
			System.out.println("contactNumber is  "+ contactNumber);
			System.out.println(" email id "+email);
			System.out.println("date of birth "+ dob);
			System.out.println(" addressss "+address);
			System.out.println("adhar number  "+adharNumber);
				System.out.println("pan card number "+pan);
			System.out.println(" bloodGroup is "+bloodGroup);
				System.out.println(" gender "+gender);
			System.out.println("-------------------------------------------------");
			
		}
}