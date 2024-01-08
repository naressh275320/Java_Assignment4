//Write a Java program to create an array list, add some colors (strings), and print out the collection. 

package ArrayList;
import java.util.*;

public class Basic {
    void fun(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        System.out.println(list);
    }
}
