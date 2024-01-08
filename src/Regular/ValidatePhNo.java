//Write a Java program to validate a phone number.

package Regular;

public class ValidatePhNo{
   Boolean validate(String text) {
        return text.matches("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
   }
}