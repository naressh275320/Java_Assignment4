//Write a Java program to test if a hash set is empty or not. 

package HashSet;
import java.util.*;

public class CheckEmpty {
    void fun(){
        Set<String> set = new HashSet<>();
        set.add("Deva");
        set.add("Ravi");
        set.add("Nash");
        set.add("Saga");

        System.out.println("Hash Set: " + set);
        
        if(set.isEmpty()){
            System.out.println("The HashSet is empty");
        }
        else{
            System.out.println("The HashSet is not empty");
        }
        
    }
}
