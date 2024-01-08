//Write a Java program to iterate through all elements in a linked list. 

package LinkedList;
import java.util.*;

public class IterateAll {
    void fun(){
        List<String> list = new LinkedList<>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
