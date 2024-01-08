//Write a Java program to iterate a linked list in reverse order. 

package LinkedList;
import java.util.*;

public class IterateReverse {
    void fun(){
        LinkedList<String> list = new LinkedList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        System.out.println("Original Linked List: " + list);

        Iterator itr = list.descendingIterator();
        
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
