package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class is the validator for URLs.
 */
public class UrlValidation {

    /**
     * This method will validate the given url using regex.
     * @param url - String, url to be validated
     * @return true if url is valid, false otherwise
     */
    public boolean validateUrl(String url) {
        String pattern = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

        try {
            Pattern patt = Pattern.compile(pattern);
            Matcher matcher = patt.matcher(url);
            return matcher.matches();
        } catch (RuntimeException e) {
            return false;
        }
    }
}
