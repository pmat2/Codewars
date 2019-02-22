import java.util.regex.Pattern;

/**
 * https://www.codewars.com/kata/regex-validate-pin-code/train/java
 *
 * @author pmatusiak
 */
public class RegexValidatePINCode {

    private static boolean validatePin(String pin) {
        if (pin.length() == 5){
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]{4,6}");
        return pattern.matcher(pin).matches();
    }

    public static void main(String[] args) {
        System.out.println(validatePin("45627"));
    }
}
