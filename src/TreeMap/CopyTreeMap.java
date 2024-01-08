//Write a Java program to copy Tree Map's content to another Tree Map. 

package TreeMap;
import java.util.*;

public class CopyTreeMap {
    void fun(){
        Map<Integer,String> map1 = new TreeMap<Integer, String>();
        Map<Integer,String> map2 = new TreeMap<Integer, String>();
        map1.put(1, "Blue");
        map1.put(4,"Green");
        map1.put(3,"Red");
        map1.put(2,"Brown");

        map2.put(8, "Innova");
        map2.put(9, "Alto");

        System.out.println("Tree Map 1: " + map1);
        System.out.println("Tree Map 2: " + map2);
        map2.putAll(map1);
        System.out.println("Tree Map 2 after copying all content from map1: " + map2);
    }
}
