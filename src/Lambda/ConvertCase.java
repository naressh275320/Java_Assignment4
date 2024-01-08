//Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.

package Lambda;

import java.util.ArrayList;
import java.util.List;

public class ConvertCase {
    void fun(){
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Brown");
        
        System.out.println("Before converting the list: ");
        for(String str: list){
            System.out.println(str);
        }

        list.replaceAll(str -> str.toLowerCase());
        System.out.println("\nAfter converting the list to lower case: ");
        for(String str: list){
            System.out.println(str);
        }

        list.replaceAll(str -> str.toUpperCase());
        System.out.println("\nAfter converting the list to upper case: ");
        for(String str: list){
            System.out.println(str);
        }        
    }
}
