//Write a Java program that takes a number and sets a thousand separators for that number.

package Regular;

public class Seperator {
    String seperate(String num){
        int n = num.length();
        if(n < 4){
            return num;
        }
        else{
            return seperate(num.substring(0,n-3)) + '#' + num.substring(n-3);
        }
    }
}