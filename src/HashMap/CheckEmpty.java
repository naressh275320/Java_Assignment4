//Write a Java program to check whether a map contains key-value mappings (empty) or not. 

package HashMap;
import java.util.*;

public class CheckEmpty {
    void fun(){
        Map<Integer, String> map  = new HashMap<Integer, String>();
        map.put(1, "Deva");
        map.put(2, "Saga");
        map.put(3, "Ravi");

        boolean check = map.isEmpty();
        System.out.println("Does map conatins key-value pair: " + check);

        map.clear();
        check = map.isEmpty();
        System.out.println("Does map conatins key-value pair: " + check);
    }
}
