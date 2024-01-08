//Write a Java program to insert an element into the array list at the first position. 

package ArrayList;

import java.util.*;

public class InsertAtFirst {
    void fun(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");
        System.out.println("Array list before inserting an element into the first position: " + list);

        list.add(0,"Orange");
        System.out.println("Array list after inserting an element into the first position: " + list);
    }
}
