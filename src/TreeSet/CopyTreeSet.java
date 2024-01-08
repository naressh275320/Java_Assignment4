//Write a Java program to add all the elements of a specified tree set to another tree set.

package TreeSet;
import java.util.*;

public class CopyTreeSet {
    void fun(){
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        
        set1.add("Blue");
        set1.add("Yellow");
        set1.add("Red");
        set1.add("Green");

        set2.add("Brown");
        set2.add("Pink");
                
        System.out.println("Tree Set 1 before adding elemtns: " + set1);
        System.out.println("Tree Set 2 before adding elemtns: " + set2);

        set2.addAll(set1);
        System.out.println("Tree Set 2 after adding elemtns: " + set2);
    }
}
