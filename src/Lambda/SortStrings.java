//Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.

package Lambda;

import java.util.ArrayList;
import java.util.List;

public class SortStrings {
    void fun(){
        List<String> list = new ArrayList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Brown");
        list.add("Red");
        
        System.out.println("Before sorting the list: ");
        for(String str: list){
            System.out.println(str);
        }

        list.sort((str1, str2) -> str1.compareToIgnoreCase(str2));
        System.out.println("\nAfter sorting the list: ");
        for(String str: list){
            System.out.println(str);
        }
       
    }
}
