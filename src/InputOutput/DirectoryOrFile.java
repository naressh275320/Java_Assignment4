//Write a Java program to check if the given pathname is a directory or a file

package InputOutput;
import java.io.*;

public class DirectoryOrFile {
    public static void main(String args[]){
        File file = new File("C:\\Users\\nab275320\\Documents\\Assignment_4\\src\\GeneralQuestions");
        if(file.isDirectory()){
            System.out.println("It is a directory");
        }
        else{
            System.out.println("It is not a directory");
        }
        if(file.isFile()){
            System.out.println("It is a file");
        }
        else{
            System.out.println("It is not a file");
        }
    }
}
