//Write a Java program to insert a given element into a priority queue. 

package PriorityQueue;
import java.util.*;

public class InsertEle {
    void fun(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Blue");
        queue.add("Green");
        queue.add("Red");
        queue.add("Brown");

        System.out.println("The Priority Queue: " + queue);
        queue.offer("Yellow");
        System.out.println("The Priority Queue after insertion: " + queue);
    }
}
