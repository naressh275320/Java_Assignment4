//Write a Java program to create a priority queue, add some colors (strings) and print out the elements of the priority queue. 

package PriorityQueue;
import java.util.*;

public class Basic {
    void fun(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Blue");
        queue.add("Green");
        queue.add("Red");
        queue.add("Brown");

        System.out.println(queue);
    }
}
