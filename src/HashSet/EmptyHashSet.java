//Write a Java program to empty an hash set. 

package HashSet;
import java.util.*;

public class EmptyHashSet {
    void fun(){
        Set<String> set = new HashSet<>();
        set.add("Deva");
        set.add("Ravi");
        set.add("Nash");
        set.add("Saga");

        System.out.println("Hash Set: " + set);
        set.clear();
        System.out.println("The Hash Set after emptying: " + set);
    }
}
