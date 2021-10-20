package junitassertions;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-z]{3,}";
    private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-z]{3,}";
    private static final String E_MAIL_PATTERN = "^([a-z]{3,20})?([@\\.\\-\\+])?([0-9]{3,6})?[@]?([a-z]{2,10})?[.][a-z]{2,5}?[.]?([a-z]{1,})?";
    private static final String MOBILE_NUMBER_PATTERN = "^[0\\+91][6789][0-9]{9,13}";
    private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*()<>,.`])(?=.*[a-z]{5,})";

    public boolean validateFirstName(String Fname) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(Fname).matches();
    }

    public boolean validateLastName(String Lname) {
        Pattern pattern = Pattern.compile(LAST_NAME_PATTERN);
        return pattern.matcher(Lname).matches();
    }


    public boolean validateEmail(String Email) {
        Pattern pattern = Pattern.compile(E_MAIL_PATTERN);
        return pattern.matcher(Email).matches();
    }

    public boolean validateMobileNumber(String MobNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(MobNumber).matches();
    }

    public boolean ValidateUserPassword(String UserPassword) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(UserPassword).matches();
    }

//    public static void main(String[] args) {
//        System.out.println("Welcome");
//        System.out.println("Enter Details For Registration -> ");
//    }
}
