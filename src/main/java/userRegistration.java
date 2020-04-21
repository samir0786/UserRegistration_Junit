public class userRegistration{

    static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,3}[' '][0-9]{10}$";
    static final String VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTER = "^[a-zA-Z0-9]{8,}$";
    static final String VALIDATE_PASSWORD_UPPER_CASE = "^(?=.*[A-Z])[a-zA-Z]{8,}$";
    static final String VALID_PASSWORD_WITH_ATLEAST_ONE_NUMBER = "^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static boolean validEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public static boolean validMobileNumber(String MobileNumber) {
        return MobileNumber.matches(MOBILE_NUMBER_PATTERN);
    }


    public static boolean validatePassword(String password) {
        return password.matches(VALID_PASSWORD_WITH_MINIMUM_EIGHT_CHARACTER);
    }

    public static boolean validatePasswordForUpperCase(String password) {
        return password.matches(VALIDATE_PASSWORD_UPPER_CASE);
    }

    public static boolean validatePasswordForNumber(String password) {
        return password.matches(VALID_PASSWORD_WITH_ATLEAST_ONE_NUMBER);
    }
}
