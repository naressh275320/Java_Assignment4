//Write a Java program to insert the specified element at the specified position in the linked list. 

package LinkedList;
import java.util.*;

public class SpecElePos {
    void fun(){
        List<String> list = new LinkedList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        System.out.println("Original Linked List: " + list);
        System.out.println("Adding Orange in index 2");
        list.add(2, "Orange");
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
