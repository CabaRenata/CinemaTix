/**
 * Created by Renata on 3/8/2015.
 */

import validation.Validators;

public class main {


    public static void main(String[] args) {
        Validators validators = new Validators();

        System.out.println(validators.validateUrl("https://www.youtube.com/watch?v=BgbQ0zBZe1M"));

        System.out.println(validators.validateLastName("Tom"));
        System.out.println(validators.validateFirstName("Tom"));

        System.out.println(validators.validateUsername("mkyong-2002"));
        System.out.println(validators.validateUsername("mkyong34"));
        System.out.println(validators.validateUsername("mkyong_2002"));
        System.out.println(validators.validateUsername("mkyong-2002"));

        System.out.println(validators.validatePhoneNumber("123 456 7890"));
        System.out.println(validators.validatePhoneNumber("123.456.7890"));
        System.out.println(validators.validatePhoneNumber("(123)-456-7890"));
        System.out.println(validators.validatePhoneNumber("1234567890"));
        System.out.println(validators.validatePhoneNumber("123-456-7890"));

        System.out.println(validators.validateEmailAddress("mkyong@yahoo.com"));
        System.out.println(validators.validateEmailAddress("mkyong-100@yahoo.com"));
        System.out.println(validators.validateEmailAddress("mkyong@1.com"));
        System.out.println(validators.validateEmailAddress("mkyong+100@gmail.com"));
        System.out.println(validators.validateEmailAddress("mkyong"));
        System.out.println(validators.validateEmailAddress("mkyong@.com.my"));

    }
}