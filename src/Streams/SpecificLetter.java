//Write a Java program to count the number of strings in a list that start with a specific letter using streams.

package Streams;
import java.util.*;

public class SpecificLetter {
    public void startingc() {
        List<String> list = Arrays.asList("Blue", "Orange", "Yellow", "Red", "Brown", "Pink");
        System.out.println("Original list of strings: " + list);

        long c = list.stream()
                     .filter(s -> s.startsWith(String.valueOf("B")))
                     .count();
        
        System.out.println("Number of color starting with 'B' = " + c);
    }    
}
