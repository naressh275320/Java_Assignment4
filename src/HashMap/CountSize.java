//Write a Java program to count the number of key-value (size) mappings in a map. 

package HashMap;
import java.util.*;

public class CountSize {
    void fun(){
        Map<Integer, String> map  = new HashMap<Integer, String>();
        map.put(1, "Deva");
        map.put(2, "Saga");
        map.put(3, "Ravi");

        System.out.println("Number of key-value mappings in the map: " + map.size());
    }
}
