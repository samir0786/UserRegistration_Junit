public class userRegistration {

    static final String NAME_PATTERN = "^[A-Z][a-z]{2,}$";

    public static boolean validInputName(String inputName) {
        return inputName.matches(NAME_PATTERN);
    }
}
