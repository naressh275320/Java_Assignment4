//Write a Java program to remove all duplicate elements from a list using streams.

package Streams;
import java.util.*;
import java.util.stream.Collectors;

public class Duplicate {
    public void findduplicate(){
        List<Integer> list = Arrays.asList(4,6,9,4,6,1,3,5);
        System.out.println(list);
        
        List<Integer> s2 = list.stream()
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println(s2);
    }
}
