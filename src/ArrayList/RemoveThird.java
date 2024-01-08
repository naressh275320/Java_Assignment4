//Write a Java program to remove the third element from an array list. 

package ArrayList;

import java.util.ArrayList;

public class RemoveThird {
    void fun(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Blue");
        list.add("Green");
        list.add("Red");
        list.add("Brown");

        System.out.println("Array list before removing the 3rd element from the list: " + list);
        list.remove(2);
        System.out.println("Array list after removing the 3rd element from the list: " + list);

    }
}
