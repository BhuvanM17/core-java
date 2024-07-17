class Xworkz {
    static String fname;
    static long pnumber;
    static long wNumber;
    static String email;
    static String usn;
    static boolean isXworkzIDCreated = false;

    public static boolean createAccount(String fullName, long phoneNumber, long whatsAppNumber, String emailId, String usnNumber) {
    boolean isGivenFullNameValid = false;
    boolean isGivenPhoneNumberValid = false;
    boolean isGivenWhatsAppNumberValid = false;
    boolean isGivenEmailIdValid = false;
    boolean isGivenUsnNumberValid = false;
	if (fullName != null) {
      fname     =    fullName;
            isGivenFullNameValid = true;
    } else{
        System.out.println("Please enter a valid full name.");
        }
	if (phoneNumber != 0) {
       pnumber   =    phoneNumber;
     isGivenPhoneNumberValid = true;
   } else{
      System.out.println("Please enter a valid phone number.");
        }
	if (whatsAppNumber != 0) {
       wNumber = whatsAppNumber;
            isGivenWhatsAppNumberValid = true;
     } else {
       System.out.println("Please enter a valid WhatsApp number.");
        }

     if (emailId != null) {
            email   =     emailId;
            isGivenEmailIdValid = true;
    } else {
            System.out.println("Please enter a valid email ID.");
        }

    if (usnNumber != null) {
            usn    =    usnNumber;
            isGivenUsnNumberValid = true;
        } else {
            System.out.println("Please enter a valid USN number.");
        }

        if (isGivenFullNameValid && isGivenPhoneNumberValid && isGivenWhatsAppNumberValid && isGivenEmailIdValid && isGivenUsnNumberValid) {
            isXworkzIDCreated = true;
        }

    return isXworkzIDCreated;
    }

    public static void getDetails() {
        if (isXworkzIDCreated) {
            System.out.println("The full name is: " + fname);
            System.out.println("The phone number is: " + pnumber);
            System.out.println("The WhatsApp number is: " + wNumber);
            System.out.println("The email ID is: " + email);
            System.out.println("The USN number is: " + usn);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}
