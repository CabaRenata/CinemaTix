package validation;

/**
 * This class is the validator for first and last name.
 */
public class NameValidation {

    /**
     * This method will validate the first name given as parameter.
     * @param firstName - String, first name which will be validated
     * @return true if the first name is valid, false otherwise
     */
    public static boolean validateFirstName( String firstName ) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    /**
     * This method will validate the last name given as a parameter.
     * @param lastName - String, the last name which will be validated
     * @return - true if last name is valid, false otherwise
     */
    public static boolean validateLastName( String lastName )
    {
        return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
    }
}
