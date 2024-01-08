//Write a Java program to create a reverse order view of the elements contained in each tree set. 

package TreeSet;
import java.util.*;

public class ReverseView {
    void fun(){
        TreeSet<String> set = new TreeSet<>();
        set.add("Blue");
        set.add("Yellow");
        set.add("Red");
        set.add("Green");

        System.out.println("Tree Set: " + set);
        System.out.println("Tree Set in reverse order: ");
        Iterator itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }   
    }
}
