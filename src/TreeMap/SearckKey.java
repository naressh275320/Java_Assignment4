//Write a Java program to search for a key in a Tree Map. 

package TreeMap;
import java.util.*;

public class SearckKey {
    void fun(){
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(1, "Blue");
        map.put(4,"Green");
        map.put(3,"Red");
        map.put(2,"Brown");

        if(map.containsKey(3)){
            System.out.println("Map contains key 3 content: " + map.get(3));
        }
        else{
            System.out.println("Map doesn't contain key 3 content");
        }

        if(map.containsKey(5)){
            System.out.println("Map contains key 5 content: " + map.get(5));
        }
        else{
            System.out.println("Map doesn't contain key 5 content");
        }
    }
}
