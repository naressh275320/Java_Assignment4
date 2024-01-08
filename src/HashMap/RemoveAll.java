//Write a Java program to remove all mappings from a map. 

package HashMap;
import java.util.*;

public class RemoveAll {
    void fun(){
        Map<Integer, String> map  = new HashMap<Integer, String>();
        map.put(1, "Deva");
        map.put(2, "Saga");
        map.put(3, "Ravi");

        map.clear();
        System.out.println("Map after removing all mappings: " + map);
    }
}
