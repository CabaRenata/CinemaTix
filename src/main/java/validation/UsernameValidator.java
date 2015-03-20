package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * This class is the validator for username
 */
public class UsernameValidator{

    private Pattern pattern;
    private Matcher matcher;

    private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";

    public UsernameValidator(){
        pattern = Pattern.compile(USERNAME_PATTERN);
    }

    /**
     * This method will validate username with regular expression
     * @param username username for validation
     * @return true valid username, false otherwise
     */
    public boolean validateUsername(final String username){

        matcher = pattern.matcher(username);
        return matcher.matches();

    }
}
