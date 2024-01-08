//Write a Java program to calculate the average of a list of integers using streams.

package Streams;

import java.util.*;

public class average {
    public void compute(){
        List<Integer> list = Arrays.asList(4,6,1,9,5,8);
        System.out.println("List: " + list);
        double avg = list.stream()
            .mapToDouble(Integer::doubleValue)
            .average()
            .orElse(0.0);

        System.out.println("Average of the list of integers: " + avg);
    }
}
