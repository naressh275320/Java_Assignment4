//Write a Java program to convert a list of strings to uppercase or lowercase using streams.

package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StringCase{
    public void casechange() {
        
        List<String> list = Arrays.asList("Blue", "Green", "Orange", "Red", "Pink");
        System.out.println("The Array list of colors: " + list);

        //To convert the string to uppercase
        List<String> uppercase = list.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());

        System.out.println("Strings after converting to uppercase: " + uppercase);

        //To convert the string to lowercase
        List<String> lowercase = list.stream()
            .map(String::toLowerCase)
            .collect(Collectors.toList());

        System.out.println("Strings after converting to lowercase: " + lowercase);
    }
}