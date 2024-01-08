//Write a Java program to create a tree set, add some colors (strings) and print out the tree set. 

package TreeSet;
import java.util.*;

public class BasicTreeSet {
    void fun(){
        Set<String> set = new TreeSet<>();
        set.add("Blue");
        set.add("Yellow");
        set.add("Red");
        set.add("Green");

        System.out.println(set);
    }
}
