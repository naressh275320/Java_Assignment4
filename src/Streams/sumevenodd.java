//Write a Java program to calculate the sum of all even, odd numbers in a list using streams.

package Streams;

import java.util.Arrays;
import java.util.List;

public class sumevenodd {
    public void sumof(){
        List<Integer> arr = Arrays.asList(3,9,5,6,2,8);
        System.out.println("The array list: " + arr);

        int sumeven = arr.stream()
                .filter(n -> n%2 == 0)
                .reduce(0, (c,e) -> c+e);

        System.out.println("Sum of even numbers: " + sumeven);

        int sumodd = arr.stream()
                .filter(n -> n%2 != 0)
                .reduce(0, (c,e) -> c+e);

        System.out.println("Sum of odd numbers: " + sumodd);
    }
}
