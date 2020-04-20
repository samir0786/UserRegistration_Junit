public class userRegistration{

    static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";
    static final String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
    static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,3}[' '][0-9]{10}$";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }

    public static boolean validEmailId(String emailId) {
        return emailId.matches(EMAIL_PATTERN);
    }

    public static boolean validMobileNumber(String MobileNumber) {
        return MobileNumber.matches(MOBILE_NUMBER_PATTERN);
    }
}
