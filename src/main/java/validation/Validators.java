package validation;

/**
 * This class is the validator for all input fields.
 */
public class Validators {

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String URL_PATTERN = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";
    private static final String LAST_NAME_PATTERN = "[a-zA-z]+([ '-][a-zA-Z]+)*";
    private static final String FIRST_NAME_PATTERN = "[A-Z][a-zA-Z]*";
    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    /**
     * This method will validate email with regular expression.
     * @param email string for validation
     * @return true valid hex, false otherwise
     */
    public boolean validateEmailAddress(final String email) { return email.matches(EMAIL_PATTERN); }

    /**
     * This method will validate the first name given as parameter.
     * @param firstName - String, first name which will be validated
     * @return true if the first name is valid, false otherwise
     */
    public static boolean validateFirstName( String firstName ) {
        return firstName.matches(FIRST_NAME_PATTERN);
    }

    /**
     * This method will validate the last name given as a parameter.
     * @param lastName - String, the last name which will be validated
     * @return - true if last name is valid, false otherwise
     */
    public static boolean validateLastName( String lastName ) { return lastName.matches( LAST_NAME_PATTERN ); }

    /**
     * This method will validate the URL given as a parameter.
     * @param url - String, the URL which will be validated
     * @return -  true if URL is valid, false otherwise
     */
    public static boolean validateUrl(String url) { return url.matches(URL_PATTERN); }

    /**
     * This method will validate the username given as a parameter.
     * @param username - String, the username which will be validated
     * @return -  true if username is valid, false otherwise
     */
    public static boolean validateUsername(String username) { return  username.matches(USERNAME_PATTERN);}

    /**
     * This method will validate the given phone number.
     * @param phoneNo - String the number wich will be validated
     * @return - true if the phone number is valid, false otherwise
     */
    public boolean validatePhoneNumber(String phoneNo) {
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) return true;
            //validating phone number with -, . or spaces
        else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
            //validating phone number with extension length from 3 to 5
        else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
            //validating phone number where area code is in braces ()
        else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
            //return false if nothing matches the input
        else return false;
    }

}