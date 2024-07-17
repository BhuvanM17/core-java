class Ksrtc {
    static long phone;
    static int otpwd;
    static String fName;
    static String email;
    static long adharNum;
    static boolean isAccountCreated = false;
public static boolean createAccount(long phoneNumber, int otp, String fullName, String emailID, long adharId) {
    boolean isGivenPhoneNumberValid = false;
    boolean isGivenOtpValid = false;
    boolean isGivenFullNameValid = false;
    boolean isGivenEmailIDValid = false;
    boolean isGivenAdharIdValid = false;

    if (phoneNumber != 0) {
    phone   =    phoneNumber;
            isGivenPhoneNumberValid = true;
    } else {
            System.out.println("Please enter a valid phone number.");
    }

	if (otp != 0) {
            otpwd  =  otp;
        isGivenOtpValid = true;
    } else {
            System.out.println("Please enter a valid OTP.");
        }

    if (fullName != null && !fullName.isEmpty()) {
    fName  =   fullName;
            isGivenFullNameValid = true;
    } else {
            System.out.println("Please enter a valid full name.");
        }
	if (emailID != null && emailID.contains("@")) {
            email   =   emailID;
            isGivenEmailIDValid = true;
        } else {
            System.out.println("Please enter a valid email ID.");
        }
    if (adharId != 0) {
            adharNum  =    adharId;
            isGivenAdharIdValid = true;
        } else {
            System.out.println("Please enter a valid Aadhar number.");
        }

   if (isGivenPhoneNumberValid && isGivenOtpValid && isGivenFullNameValid && isGivenEmailIDValid && isGivenAdharIdValid) {
            isAccountCreated = true;
        }

    return isAccountCreated;
    }

    public static void getDetails() {
        if (isAccountCreated) {
			System.out.println("yup!!!!, you succesfully loged in");
            System.out.println("The entered phone number is: " + phone);
            System.out.println("The entered OTP is: " + otpwd);
            System.out.println("The entered full name is: " + fName);
            System.out.println("The entered email ID is: " + email);
            System.out.println("The entered Aadhar number is: " + adharNum);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}
