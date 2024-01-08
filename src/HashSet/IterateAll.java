//Write a Java program to iterate through all elements in a hash list. 

package HashSet;
import java.util.*;

public class IterateAll {
    void fun(){
        Set<String> set = new HashSet<>();
        set.add("Deva");
        set.add("Ravi");
        set.add("Nash");
        set.add("Saga");

        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }   
    }
}
