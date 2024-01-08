//Write a Java program to iterate through all elements in an array list. 

package ArrayList;
import java.util.*;

public class Iterate {
    void fun(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
