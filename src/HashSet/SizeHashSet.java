//Write a Java program to get the number of elements in a hash set. 

package HashSet;
import java.util.*;

public class SizeHashSet {
    void fun(){
        Set<String> set = new HashSet<>();
        set.add("Deva");
        set.add("Ravi");
        set.add("Nash");
        set.add("Saga");

        System.out.println("Hash Set: " + set);
        System.out.println("The size of Hash Set: " + set.size());
    }
}
