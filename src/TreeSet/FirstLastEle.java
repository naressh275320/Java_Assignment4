//Write a Java program to get the first and last elements in a tree set. 

package TreeSet;
import java.util.*;

public class FirstLastEle {
    void fun(){
        TreeSet<String> set = new TreeSet<>();
        set.add("Blue");
        set.add("Yellow");
        set.add("Red");
        set.add("Green");

        System.out.println("Tree set is: " + set);
        System.out.println("First element of the Tree set is: " + set.first());
        System.out.println("First element of the Tree set is: " + set.last());
        
    }
}
