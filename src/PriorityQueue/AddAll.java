//Write a Java program to add all the elements of a priority queue to another priority queue. 

package PriorityQueue;
import java.util.*;

public class AddAll {
    void fun(){
        Queue<String> queue1 = new PriorityQueue<>();
        Queue<String> queue2 = new PriorityQueue<>();
        
        queue1.add("Blue");
        queue1.add("Yellow");
        queue1.add("Red");
        queue1.add("Green");

        queue2.add("Brown");
        queue2.add("Pink");
                
        System.out.println("Priority Queue 1: " + queue1);
        System.out.println("Priority Queue 2: " + queue2);

        queue2.addAll(queue1);
        System.out.println("Tree Set 2 after adding elemtns: " + queue2);
    }
}
