//Write a Java program to iterate through all elements in a linked list starting at the specified position. 

package LinkedList;
import java.util.*;

public class IterateFromSpecified {
    void fun(){
        List<String> list = new LinkedList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        System.out.println("The list: " + list);
        System.out.println("List is iterated from index 1: ");
        Iterator itr = list.listIterator(1);
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
