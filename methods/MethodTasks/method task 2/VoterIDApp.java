class VoterIDApp {
    static long voteID;
    static String fName;
    static String location;
    static int agee;
    static String genderr;
    static boolean isRegistered = false;

    public static boolean VoterIDRegisration(long voterID, String fullName, String address, int age, String gender) {
        boolean isGivenVoterIDValid = false;
        boolean isGivenNameValid = false;
        boolean isGivenAddressValid = false;
        boolean isGivenAgeValid = false;
        boolean isGivenGenderValid = false;

   if (voterID > 0) {
       voteID  =    voterID;
	   isGivenVoterIDValid = true;
        } else {
            System.out.println("Please enter a valid Voter ID.");
        }

	if (fullName != null) {
          fName   =    fullName;
            isGivenNameValid = true;
        } else {
            System.out.println("Please enter a valid full name.");
        }
	if (address != null) {
         location       =    address;
            isGivenAddressValid = true;
		} else {
            System.out.println("Please enter a valid address.");
        }

	if (age > 0) {
            agee    =   age;
       isGivenAgeValid = true;
      } else {
            System.out.println("Please enter a valid age.");
        }
	if (gender != null) {
            genderr   =    gender;
            isGivenGenderValid = true;
        } else {
            System.out.println("Please enter a valid gender.");
        }
	if (isGivenVoterIDValid && isGivenNameValid && isGivenAddressValid && isGivenAgeValid && isGivenGenderValid) {
            isRegistered = true;
        }

    return isRegistered;
    }

    public static void displayDetails() {
        if (isRegistered) {
            System.out.println("Voter ID Number: " + voteID);
            System.out.println("Full Name: " + fName);
            System.out.println("Address: " + location);
            System.out.println("Age: " + agee);
            System.out.println("Gender: " + genderr);
        } else {
            System.out.println("No voter details available. Please register correctly first");
        }
}}
