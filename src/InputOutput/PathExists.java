//Write a Java program to check if a file or directory specified by pathname exists or not.

package InputOutput;
import java.io.*;

public class PathExists {
    public static void main(String args[]){
        File file = new File("C://Users//Documents//Assignment_4//src//GeneralQuestions");
        if(file.exists()){
            System.out.println("Path exists!");
        }
        else{
            System.out.println("Path does not exist!");
        }
    }
}
