class Passport {
    static String cpvLoc;
    static int dcdrLoc;
    static String gName;
    static String sName;
    static String dobd;
    static String emaill;
    static boolean isEmailLoginSamee;
    static String loginIdd;
    static String passwd;
    static String checkwd;
    static String hintQ;
    static String hintA;
    static String capth;
    static boolean isPassportCreated = false;

public static boolean createPassword(String cpvLocation, int dcdrLocation, String givenName, String surName,String dob, String email, boolean isEmailLoginSame,String loginId, String pwd, String cwd, String hintQue,String hintAns, String captcha) {

    boolean isGivenCpvLocValid = false;
  boolean isGivenDcdrLocValid = false;
  boolean isGivenNameValid = false;
  boolean isGivenSurnameValid = false;
  boolean isGivenDobValid = false;
  boolean isGivenEmailValid = false;
  boolean isGivenLoginIdValid = false;
  boolean isGivenPwdValid = false;
  boolean isGivenCwdValid = false;
  boolean isGivenHintQueValid = false;
  boolean isGivenHintAnsValid = false;
  boolean isGivenCaptchaValid = false;

   if (cpvLocation != null) {
    cpvLoc = cpvLocation;
    isGivenCpvLocValid = true;
    }else{
       System.out.println("Please enter cpv location correctly");
		}

   if (dcdrLocation >= 0) {
       dcdrLoc = dcdrLocation;
       isGivenDcdrLocValid = true;
       }else{
            System.out.println("Please enter dcdr location correctly");
        }

       if (givenName != null) {
           gName = givenName;
           isGivenNameValid = true;
       } else {
           System.out.println("Please enter given name correctly");
       }
      if (surName != null) {
       sName = surName;
       isGivenSurnameValid = true;
       } else {
       System.out.println("Please enter surname correctly");
        }

   if (dob != null) {
           dobd = dob;
           isGivenDobValid = true;
        } else {
           System.out.println("Please enter date of birth correctly");
        }

   if (email != null) {
            emaill = email;
            isGivenEmailValid = true;
        } else {
            System.out.println("Please enter email correctly");
        }

   if (isEmailLoginSame) {
            isEmailLoginSamee = true;
        } else {
            System.out.println("Please confirm email login correctly");
        }

   if (loginId != null) {
            loginIdd = loginId;
            isGivenLoginIdValid = true;
        } else {
            System.out.println("Please enter login ID correctly");
        }

    if (pwd != null && pwd.equals(cwd)) {
            passwd = pwd;
            checkwd = cwd;
            isGivenPwdValid = true;
        } else {
            System.out.println("Please enter and confirm password correctly");
        }

     if (hintQue != null) {
            hintQ = hintQue;
            isGivenHintQueValid = true;
        } else {
            System.out.println("Please enter hint question correctly");
        }

   if (hintAns != null) {
            hintA = hintAns;
            isGivenHintAnsValid = true;
        } else {
            System.out.println("Please enter hint answer correctly");
        }

   if (captcha != null) {
            capth = captcha;
            isGivenCaptchaValid = true;
        } else {
            System.out.println("Please enter captcha correctly");
        }

   if (isGivenCpvLocValid && isGivenDcdrLocValid && isGivenNameValid && isGivenSurnameValid &&
                isGivenDobValid && isGivenEmailValid && isGivenLoginIdValid && isGivenPwdValid &&
                isGivenHintQueValid && isGivenHintAnsValid && isGivenCaptchaValid) {
        isPassportCreated = true;
        }

    return isPassportCreated;
    }

    public static void getPassportDetails() {
        if (isPassportCreated) {
			System.out.println("the account created succesfully here the details");
            System.out.println("The cpvLocation is: " + cpvLoc);
            System.out.println("The dcdrLocation is: " + dcdrLoc);
            System.out.println("The given name is: " + gName);
            System.out.println("The surname is: " + sName);
            System.out.println("The date of birth is: " + dobd);
            System.out.println("The entered email is: " + emaill);
            System.out.println("Is email same as login: " + isEmailLoginSamee);
            System.out.println("The login ID is: " + loginIdd);
            System.out.println("The hint question is: " + hintQ);
            System.out.println("The hint answer is: " + hintA);
            System.out.println("The captcha is: " + capth);
        } else {
            System.out.println("Passport details are not correctly provided.");
   }
  }
}
