/*Write a Java program to move all lower-case letters to the front of a given word. This will keep the 
relative position of all the letters (both upper and lower case) same.*/

package Regular;

public class LowUppCase{
    String case1(String str){
        return str.replaceAll("[A-Z]", "")  + str.replaceAll("[a-z]", "");
    }
}
