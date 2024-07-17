class Myntra {
    static long phone;
    static int onetp;
    static String fName;
    static String location;
    static int pin;
    static boolean isAccountCreated = false;

public static boolean createAccount(long phoneNumber, int otp, String name, String address, int pinCode) {
boolean isGivenPhoneValid = false;
boolean isGivenOtpValid = false;
boolean isGivenNameValid = false;
boolean isGivenLocationValid = false;
boolean isGivenPinValid = false;

   if (phoneNumber != 0) {
     phone = phoneNumber;
	 isGivenPhoneValid = true;
	} else {
    System.out.println("Please enter a valid phone number.");
        }

    if (otp > 0) {
       onetp = otp;
       isGivenOtpValid = true;
        } else {
            System.out.println("Please enter a valid OTP.");
        }
	if (name != null) {
        fName = name;
       isGivenNameValid = true;
        } else {
            System.out.println("Please enter a valid name.");
        }
    if (address != null) {
       location = address;
       isGivenLocationValid = true;
        } else {
            System.out.println("Please enter a valid address.");
        }
	if (pinCode > 0) {
        pin = pinCode;
        isGivenPinValid = true;
        } else {
             System.out.println("Please enter a valid pincode.");
        }

   if (isGivenPhoneValid && isGivenOtpValid && isGivenNameValid && isGivenLocationValid && isGivenPinValid) {
            isAccountCreated = true;
   }

return isAccountCreated;
}

    public static void getDetails() {
        if (isAccountCreated) {
            System.out.println("The entered phone number is: " + phone);
            System.out.println("The entered OTP is: " + onetp);
            System.out.println("The entered name is: " + fName);
            System.out.println("The entered address is: " + location);
            System.out.println("The pincode is: " + pin);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}
