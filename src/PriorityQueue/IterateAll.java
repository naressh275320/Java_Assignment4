//Write a Java program to iterate through all elements in the priority queue.

package PriorityQueue;
import java.util.*;

public class IterateAll {
    void fun(){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Blue");
        queue.add("Green");
        queue.add("Red");
        queue.add("Brown");

        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
