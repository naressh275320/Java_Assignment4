//Write a Java program to iterate through all elements in a tree set. 

package TreeSet;
import java.util.*;

public class IterateTreeSet {
    void fun(){
        Set<String> set = new TreeSet<>();
        set.add("Blue");
        set.add("Yellow");
        set.add("Red");
        set.add("Green");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }   
    }
}
