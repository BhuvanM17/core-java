class Demant {
    static String pan;
    static long boI;
    static String birthdate;
    static String captchaa;
    static int onetimepwd;
    static boolean isAccountCreated = false;

    public static boolean createAccount(String panNumber, long boID, String dob, String captcha, int otp) {
    boolean isGivenPanValid = false;
    boolean isGivenBoIValid = false;
    boolean isGivenBirthdateValid = false;
    boolean isGivenCaptchaValid = false;
    boolean isGivenOtpValid = false;

    if (panNumber != null) {
            pan   =      panNumber;
            isGivenPanValid = true;
        } else {
            System.out.println("Please enter a valid PAN number.");
		}

   if (boID != 0) {
            boI     =        boID;
            isGivenBoIValid = true;
        } else {
            System.out.println("Please enter a valid BO ID.");
    }

    if (dob != null) {
            birthdate      =    dob;
            isGivenBirthdateValid = true;
        } else {
            System.out.println("Please enter a valid date of birth.");
    }
	if (captcha != null) {
            captchaa    =       captcha;
            isGivenCaptchaValid = true;
        } else {
            System.out.println("Please enter a valid captcha.");
        }

    if (otp > 0) {
       onetimepwd = otp;
       isGivenOtpValid = true;
    } else {
            System.out.println("Please enter a valid OTP.");
    }

    if (isGivenPanValid && isGivenBoIValid && isGivenBirthdateValid && isGivenCaptchaValid && isGivenOtpValid) {
            isAccountCreated = true;
        }

    return isAccountCreated;
    }

    public static void getDetails() {
        if (isAccountCreated) {
            System.out.println("The PAN number is: " + pan);
            System.out.println("The BO ID is: " + boI);
            System.out.println("The date of birth is: " + birthdate);
            System.out.println("The captcha is: " + captchaa);
            System.out.println("The OTP is: " + onetimepwd);
        } else {
            System.out.println("No account details available. Please create an account first.");
        }
    }
}
