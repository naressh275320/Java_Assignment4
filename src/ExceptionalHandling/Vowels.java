//Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.

package ExceptionalHandling;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

public class Vowels{
    void checkVowels(String text) throws NoVowelsException {
    boolean containsVowels = false;
    String vowels = "aeiouAEIOU";

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (vowels.contains(String.valueOf(ch))) {
        containsVowels = true;
        break;
      }
    }
    if (!containsVowels) {
      throw new NoVowelsException("String does not contain any vowels.");
    }
  }
}
