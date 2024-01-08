//Write a Java program to associate the specified value with the specified key in a Tree Map. 

package TreeMap;
import java.util.*;

public class BasicTreeMap {
    void fun(){
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(1, "Blue");
        map.put(4,"Green");
        map.put(3,"Red");
        map.put(2,"Brown");

        System.out.println(map);
    }
}