//Write a Java program to retrieve an element (at a specified index) from a given array list. 

package ArrayList;

import java.util.ArrayList;

public class Retrieve {
    void fun(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");
        System.out.println("Retrieving the element from 2nd index of the Array list: " + list.get(2));

    }
    
}
