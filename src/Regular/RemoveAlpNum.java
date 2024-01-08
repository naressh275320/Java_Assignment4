//Write a Java program to remove all non-alphanumeric characters from a given string.

package Regular;

public class RemoveAlpNum {
    String remove(String str){
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }
}
