//Write a Java program to get all keys from a Tree Map. 

package TreeMap;
import java.util.*;

public class AllKeys {
    void fun(){
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(1, "Blue");
        map.put(4,"Green");
        map.put(3,"Red");
        map.put(2,"Brown");

        System.out.println(map.keySet());
        
        Set<Integer> keys = map.keySet();
        for(Integer key: keys){
            System.out.println(key);
        }
    }
}
