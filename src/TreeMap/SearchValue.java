//Write a Java program to search for a value in a Tree Map. 

package TreeMap;
import java.util.*;

public class SearchValue {
    void fun(){
        Map<Integer,String> map = new TreeMap<Integer, String>();
        map.put(1, "Blue");
        map.put(4,"Green");
        map.put(3,"Red");
        map.put(2,"Brown");

        if(map.containsValue("Green")){
            System.out.println("Map contains value Green content" );
        }
        else{
            System.out.println("Map doesn't contain value Green content");
        }

        if(map.containsValue("Pink")){
            System.out.println("Map contains value Pink content");
        }
        else{
            System.out.println("Map doesn't contain value Pink content");
        }
    }
}
