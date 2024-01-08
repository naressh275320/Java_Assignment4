//Write a Java program to separate consonants and vowels from a given string.

package Regular;

public class VowCons {
    String vowcos(String str){
        return str.replaceAll("[aeiouAEIOU]", "")  + str.replaceAll("[^aeiouAEIOU]", "");
    }
}
