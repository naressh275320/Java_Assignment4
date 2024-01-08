//Write a Java program to copy all mappings from the specified map to another map. 

package HashMap;
import java.util.*;

public class CopyMap {
    void fun(){
        Map<Integer, String> map1  = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map1.put(1, "Deva");
        map1.put(2, "Saga");
        map1.put(3, "Ravi");

        map2.put(4, "Sam");
        map2.put(5, "John");
        map2.put(6, "Ishan");
        
        System.out.println("Values in first map: " + map1);
        System.out.println("Values in first map: " + map2);
        
        map2.putAll(map1);
        System.out.println("Values in second map after copying all value and key from first map:" + map2);
    }
}
