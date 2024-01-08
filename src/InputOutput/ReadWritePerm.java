// Write a Java program to check if a file or directory has read and write permissions.

package InputOutput;
import java.io.*;

public class ReadWritePerm {
    public static void main(String args[]){
        File file = new File("C:\\Users\\nab275320\\Documents\\Assignment_4\\src\\GeneralQuestions");
        if(file.canRead()){
            System.out.println("We can do read operations on this path");
        }
        else{
            System.out.println("We cannot do read operations on this path");
        }
        if(file.canWrite()){
            System.out.println("We can do write operations on this path");
        }
        else{
            System.out.println("We cannot do write operations on this path");
        }
    }
}
