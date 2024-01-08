//Write a Java program to create a method that reads a file and throws an exception if the file is not found.

package ExceptionalHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadFileExcep {
    void exce(File file){
        try{
            if(file.exists()){
                System.out.println("File exists!");
            }
            else{
                throw new FileNotFoundException();
            }
        }catch(FileNotFoundException e){
            System.out.println(e + " File not exists");
        }
    }
}
