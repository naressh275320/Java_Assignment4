//Write a Java program to remove all elements from a priority queue. 

package PriorityQueue;
import java.util.*;

public class RemoveAll {
    void fun(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Blue");
        queue.add("Green");
        queue.add("Red");
        queue.add("Brown");

        System.out.println("The Priority Queue: " + queue);
        queue.clear();
        System.out.println("The Priority Queue after emptying: " + queue);
    }
}
