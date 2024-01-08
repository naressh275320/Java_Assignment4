//Write a Java program to associate the specified value with the specified key in a HashMap. 

package HashMap;
import java.util.*;

class Specified{
    void fun(){
        Map<Integer, String> map  = new HashMap<Integer, String>();
        map.put(1, "Deva");
        map.put(2, "Saga");
        map.put(3, "Ravi");

        for(Map.Entry e: map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}